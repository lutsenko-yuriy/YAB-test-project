# Project Config

Read this file to resolve all project-specific constants referenced in skill instructions.
Project identity (name, issue prefix, git host, PM tool, test/version settings) lives in `skill_router.toml`
(`[project]`, `[providers]`). Skills stay unchanged.

## Tech stack

Languages, frameworks, platforms and tooling: `docs/TECH_STACK.md`.

## Project management

@skills/shared/pm-tool-mapping.md

## Documentation paths

| Document | Path |
|---|---|
| Product spec | `docs/PRODUCT_SPEC.md` |
| Glossary | `docs/GLOSSARY.md` |
| Backlog | `docs/BACKLOG.md` |
| Changelog | `docs/CHANGELOG.md` |
| Architecture | `docs/ARCHITECTURE.md` |
| Agent workflow | `AGENTS.md` |
| Knowledge base | `docs/knowledge/notes/` (one `YTP-XX.md` file per ticket) |

## Testing

| Setting | Value |
|---|---|
| Integration test directory | `src/test/java` (e.g. `integration_test/`, `e2e/`) |
| Test harness file | `none (no integration test harness yet)` (e.g. `integration_test/harness.dart`) |
| Harness class / entry point | `none (no integration test harness yet)` (e.g. `AppHarness`) |
| Unit / integration test command | `./gradlew test` (e.g. `flutter test`, `npm test`, `pytest`) |

## Version management

| Setting | Value |
|---|---|
| Version file | `build.gradle.kts` (e.g. `pubspec.yaml`, `package.json`) |
| Version field | `version = "X.Y.Z"` (e.g. `version: X.Y.Z`) |
| Manual vs automated | Bump version name manually; CI manages build numbers — never touch them |

## In QA path patterns

A merged PR moves to **In QA** (not Done directly) if it touches any of:

- `src/main/java/**, src/main/resources/**` — list the directories or file patterns that require human QA sign-off

Move straight to **Done** if the PR touches only: pure logic with no runtime platform dependency, documentation, CI config, or pure refactors where automated tests fully own correctness. When in doubt, use **In QA**.
