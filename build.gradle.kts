plugins {
    // Kotlin and Android plugins
    id("com.android.gradle-plugin") version "7.0.0"
    kotlin("android") version "1.5.31"
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}