# Architecture

## Related docs

- `docs/TECH_STACK.md` — languages, frameworks, tooling
- `docs/CODE_STYLE.md` — style rules
- `docs/CONSTRAINTS.md` — standing constraints that shape design trade-offs

## Overview

Java 21 Spring Boot application built with Gradle; Python tooling under scripts/ drives the YAB agent workflow

No application code exists yet; the Spring Boot app (Gradle, `src/`) is planned. Everything below `src/` is the intended layout.

## Directory structure

```
.claude/commands/     # Slash-command stubs routing to skills/
.github/workflows/    # CI (tests.yml: Python tooling tests)
docs/                 # Spec, architecture, workflows, knowledge base, experiments
scripts/
├── checkup/          # Periodic code-quality checkup scheduler
├── notes/            # Knowledge-base index generator
├── onboard/          # Onboarding probe/check/apply/mark and the session gate hook
└── skill_router/     # Routes skills to models and PM/VCS providers (linear, github, files)
skills/               # Agent skill definitions (build, configure, design, manage, verify, shared)
styles/               # Communication styles (CONCISE, DETAILED, SCHEMATIC)
skill_router.toml     # Project config and provider mapping

src/                  # planned
├── main/java/        # Spring Boot application code
├── main/resources/   # application config, static resources
└── test/java/        # JUnit 5 unit and @SpringBootTest integration tests
```

## Layers

### Application (planned)
Standard Spring Boot layering: web/controller → service → repository. Controllers depend on services only; services hold business logic and depend on repository interfaces; repositories handle persistence. No layer imports from the one above it.

### Tooling
`scripts/` is Python standard library only and is independent of the application; skills invoke it via `python3 scripts/...`. Each package keeps its tests in a sibling `tests/` package.

## Dependencies

- [Spring Boot](https://spring.io/projects/spring-boot) 3 (planned)
- [JUnit 5](https://junit.org/junit5/) (planned)
- [Gradle](https://gradle.org/) wrapper (planned)
- Tooling: Python 3 standard library only
