# YAB-test-project

[![Tests](https://github.com/lutsenko-yuriy/YAB-test-project/actions/workflows/tests.yml/badge.svg)](https://github.com/lutsenko-yuriy/YAB-test-project/actions/workflows/tests.yml)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A Java Spring sandbox project for trying out the YAB multi-agent workflow.

## What it does

Today it is a minimal Spring Boot app. Its home page (`/`) shows:

```
I am somehow alive! Thank you, Yuriy's agentic boyz!
```

## Running locally

**Requires:** Java 21. Gradle is provided by the wrapper.

| Task | Command |
|---|---|
| Build | `./gradlew build` |
| Run | `./gradlew bootRun`, then open http://localhost:8080/ |
| Test | `./gradlew test` |

## Contributing

1. **Open an issue first** describing the change.
2. Work is tracked as `YTP-N` tickets and done on a branch named `feature/YTP-N-<short-description>`.
3. Follow TDD: write a failing test, make it pass, refactor.
4. Changes are merged via `/ship`.

See [`docs/workflows/FEATURE.md`](docs/workflows/FEATURE.md) for the full workflow and [`docs/CODE_STYLE.md`](docs/CODE_STYLE.md) for code style.

## Built with YAB

This project is developed with the [YAB multi-agent workflow](https://github.com/lutsenko-yuriy/yuriys-agentic-boyz): AI agents brief, plan, implement, review and ship each ticket.
