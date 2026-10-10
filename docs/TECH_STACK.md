# Tech Stack

## Languages

| Language | Version | Used for |
|---|---|---|
| Java | 21 (`build.gradle.kts` toolchain) | Application code (Spring Boot) |
| Python | 3.9–3.12 (`.github/workflows/tests.yml`; `onboard.py check`/`apply` need 3.11+) | YAB workflow tooling under `scripts/` |
| Shell | POSIX sh / bash (`scripts/onboard/gate.sh`) | Onboarding gate hook |

## Frameworks and libraries

- [Spring Boot](https://spring.io/projects/spring-boot) 4.1.1 (`build.gradle.kts`): application framework, `spring-boot-starter-webmvc`
- [JUnit Jupiter](https://junit.org/) 6 (version managed by Spring Boot, via `spring-boot-starter-test`): Java tests
- Python standard library only (`unittest`, `tomllib`) for tooling

## Platforms

- JVM 21 server application (embedded Tomcat)
- macOS developer machine; GitHub Actions `ubuntu-latest` for CI

## Tooling

- **Build / package manager:** Gradle 9.6.1 via wrapper (`./gradlew`, `gradle/wrapper/gradle-wrapper.properties`); JDK 21 toolchain auto-provisioned by the foojay resolver plugin (`settings.gradle.kts`)
- **Test runner:** `./gradlew test` (Java); `python -m unittest` (tooling)
- **Linter / formatter:** none configured
- **CI:** GitHub Actions (`.github/workflows/tests.yml`)
