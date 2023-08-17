import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    java
    `java-library`
    id ("com.github.johnrengelman.shadow") version "7.1.2"
    id("io.freefair.lombok") version "6.6-rc1"
}

allprojects {

    group = "de.levihessmann"
    version = "RC-1.0"

    apply(plugin = "java")
    apply(plugin = "java-library")
    apply(plugin = "com.github.johnrengelman.shadow")
    apply(plugin = "io.freefair.lombok")

    repositories {
        mavenCentral()
        maven("https://jitpack.io")
    }

    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(17))
        }
    }

    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
        options.release.set(17)
    }
}

dependencies {
}