// root build.gradle.kts

plugins {
    id("com.android.application") version "8.0.0" apply false
    id("kotlin-android") version "1.7.10" apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}