# Changelog

A record of all versioned releases. For planned work and known issues, see @docs/BACKLOG.md.

---

## [0.1.2] — 2026-10-10 (PR #8 merged)

### Added / Changed / Fixed
- [meta] YTP-2: project-specific README (CI and licence badges, what the app does, how to build/run/test, contribution guidelines, YAB link) replaces the template README
- [meta] YTP-2: session start in `AGENTS.md` now reads `[providers].pm` first, so `YTP-N` resolves to the configured PM tool (GitHub issue #N) instead of any other loaded PM MCP

## [0.1.1] — 2026-10-10 (PR #6 merged)

### Added / Changed / Fixed
- [meta] YTP-4: skill_router warns when `skill_router.toml` can't be read on Python < 3.11, and exits 2 with a clear message when a `context:` provider can't supply context (was `Unknown provider 'pm'` / `AttributeError`)
- [meta] YTP-5: removed the YAB template's own entries from this CHANGELOG (PR #7)

## [0.1.0] — 2026-10-10 (PR #3 merged)

### Added / Changed / Fixed
- [user] YTP-1: The app has a home page that greets you with "I am somehow alive! Thank you, Yuriy's agentic boyz!"
- [app] YTP-1: Spring Boot 4.1.1 skeleton on Java 21 with a committed Gradle 9.6.1 wrapper; initial version 0.1.0
- [ci] YTP-1: CI runs the app's tests (`./gradlew test`) alongside the tooling tests

---

<!-- This file is maintained by the Product Owner agent.
     New sections are prepended after each merged PR in the format:

## [X.Y.Z] — YYYY-MM-DD (PR #N merged)

### Added / Changed / Fixed
- ...
-->
