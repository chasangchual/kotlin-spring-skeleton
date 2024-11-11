plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "kotlin-spring-skeleton"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") { from(files("core.versions.toml")) }
    }
}
