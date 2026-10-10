# Architecture

## Related docs

- `docs/TECH_STACK.md` — languages, frameworks, tooling
- `docs/CODE_STYLE.md` — style rules
- `docs/CONSTRAINTS.md` — standing constraints that shape design trade-offs

## Overview

Java 21 Spring Boot application built with Gradle; Python tooling under scripts/ drives the YAB agent workflow

## Directory structure

```
.claude/commands/     # Slash-command stubs routing to skills/
.github/workflows/    # CI (tests.yml: `onboard` job for Python tooling, `app` job for ./gradlew test)
docs/                 # Spec, architecture, workflows, knowledge base, experiments
gradle/wrapper/       # Gradle wrapper jar + properties (committed)
scripts/
├── checkup/          # Periodic code-quality checkup scheduler
├── notes/            # Knowledge-base index generator
├── onboard/          # Onboarding probe/check/apply/mark and the session gate hook
└── skill_router/     # Routes skills to models and PM/VCS providers (linear, github, files)
skills/               # Agent skill definitions (build, configure, design, manage, verify, shared)
styles/               # Communication styles (CONCISE, DETAILED, SCHEMATIC)
build.gradle.kts      # Build, dependencies, version (version = "X.Y.Z")
settings.gradle.kts   # Root project name, foojay toolchain resolver
skill_router.toml     # Project config and provider mapping

src/
├── main/java/io/github/lutsenkoyuriy/yabtest/
│   ├── YabTestApplication.java   # @SpringBootApplication entry point
│   └── web/                      # HTTP controllers (HomeController: GET / → plain text)
└── test/java/io/github/lutsenkoyuriy/yabtest/
    └── web/                      # @SpringBootTest integration tests, mirroring main/
```

## Layers

### Application
Standard Spring Boot layering: web/controller → service → repository. Controllers depend on services only; services hold business logic and depend on repository interfaces; repositories handle persistence. No layer imports from the one above it. Today only `web/` exists; a constant-returning controller needs no service layer, so add `service/` and `repository/` when real logic arrives.

### Tooling
`scripts/` is Python standard library only and is independent of the application; skills invoke it via `python3 scripts/...`. Each package keeps its tests in a sibling `tests/` package.

## Dependencies

- [Spring Boot](https://spring.io/projects/spring-boot) 4.1 (`spring-boot-starter-webmvc`, `spring-boot-starter-test`)
- JUnit Jupiter (version managed by Spring Boot)
- [Gradle](https://gradle.org/) 9.6 via the committed wrapper; JDK 21 toolchain auto-provisioned by the foojay resolver plugin
- Tooling: Python 3 standard library only
