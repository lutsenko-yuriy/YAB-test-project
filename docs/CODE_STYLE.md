# Code Style

## Base standard

Java: [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
Python: [PEP 8](https://peps.python.org/pep-0008/)
Shell: [Google Shell Style Guide](https://google.github.io/styleguide/shellguide.html)

## Formatting

No formatter configured yet; CI enforces none. Follow the base standard by hand until one is added (e.g. google-java-format via Spotless for Java).

## Linting

No linter configured. Python tests run with `python -W error`, so warnings fail CI.

## Naming and structure

- Java: Spring Boot conventions; packages under `src/main/java`, tests mirror them under `src/test/java` with a `Test` suffix (`FooServiceTest`).
- Python: snake_case modules under `scripts/*/`; tests in a sibling `tests/` package named `test_*.py` (`unittest`).

## Comments

Explain why, not what; keep them to one concise line. No commented-out code.
