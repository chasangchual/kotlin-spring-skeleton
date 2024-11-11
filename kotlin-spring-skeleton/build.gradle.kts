plugins {
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.spring.dependency.management)

    alias(libs.plugins.palantir.docker)

    kotlin("jvm") version "2.0.20"
    kotlin("kapt") version "1.9.24"
    kotlin("plugin.spring") version "1.9.24"
}

group = "org.surefor"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
        vendor.set(JvmVendorSpec.AMAZON)
    }
}

sourceSets { named("main") { java.srcDir("src/main/kotlin") } }

dependencies {
    implementation(libs.spring.boot.cache)
    implementation(libs.spring.boot.oauth2)
    implementation(libs.spring.boot.security)
    implementation(libs.spring.boot.validation)
    implementation(libs.spring.boot.web)
    implementation(libs.spring.boot.webflux)

    implementation(libs.spring.data.commons)

    implementation(libs.kotlin.reflect)
    implementation(libs.kotlin.stdlib)

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}