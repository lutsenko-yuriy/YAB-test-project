# Tech Stack

## Languages

| Language | Version | Used for |
|---|---|---|
| Java | 21 (planned; chosen at onboarding, no build file yet) | Application code (Spring Boot) |
| Python | 3.9–3.12 (`.github/workflows/tests.yml`; `onboard.py check`/`apply` need 3.11+) | YAB workflow tooling under `scripts/` |
| Shell | POSIX sh / bash (`scripts/onboard/gate.sh`) | Onboarding gate hook |

## Frameworks and libraries

- [Spring Boot](https://spring.io/projects/spring-boot) 3: application framework (planned)
- [JUnit 5](https://junit.org/junit5/): Java tests (planned, Spring Boot default)
- Python standard library only (`unittest`, `tomllib`) for tooling

## Platforms

- JVM 21 server application (planned)
- macOS developer machine; GitHub Actions `ubuntu-latest` for CI

## Tooling

- **Build / package manager:** Gradle via wrapper (`./gradlew`, planned)
- **Test runner:** `./gradlew test` (Java); `python -m unittest` (tooling)
- **Linter / formatter:** none configured
- **CI:** GitHub Actions (`.github/workflows/tests.yml`)
