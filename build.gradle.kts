import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    id("io.quarkus")
    kotlin("jvm") version "1.5.31"
}

repositories {
    mavenCentral()
    mavenLocal()
}

val quarkusPlatformGroupId: String by project
val quarkusPlatformArtifactId: String by project
val quarkusPlatformVersion: String by project

group = "quarkus-gradle"
version = "0.0.1-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("io.quarkus:quarkus-resteasy:0.11.0")

    // Kotlin support
    implementation("io.quarkus:quarkus-kotlin:0.11.0")
    implementation("io.quarkus:quarkus-arc:0.11.0")
    implementation("io.quarkus:quarkus-gradle-plugin:0.11.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.21")
    implementation("org.jetbrains.kotlin:kotlin-allopen:1.3.21")
    implementation("org.jetbrains.intellij.deps:trove4j:1.0.20181211")
    implementation("org.jetbrains.kotlin:kotlin-script-runtime:1.3.21")

    testImplementation("io.quarkus:quarkus-junit5:0.11.0")
    testImplementation("io.rest-assured:rest-assured:3.3.0")
}

quarkus {
    setSourceDir("src/main/kotlin")
    setOutputDirectory("build/classes/kotlin/main")
}
