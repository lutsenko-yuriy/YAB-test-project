plugins {
    // Auto-provisions the JDK 21 toolchain on machines that don't have one installed.
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "yab-test-project"
