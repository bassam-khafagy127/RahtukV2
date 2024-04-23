// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven { url = uri("https://plugins.gradle.org/m2/") }
        maven { url = uri("https://jitpack.io") }
        maven { url = uri("https://maven.google.com") }
    }
    dependencies {
        classpath(Build.androidBuildTools)
        classpath(Build.kotlinGradlePlugin)
        classpath(Google.googleServices)
        classpath(Firebase.crashlyticsPlugin)
        classpath(Firebase.perfPlugin)
        classpath(Firebase.appDistributionPlugin)
        classpath(Build.androidNavigationSafeArgs)
    }
}
plugins {
    id(Plugins.kotlinKsp) version Plugins.kotlinKspVersion apply false
    id(Plugins.jvm) version Plugins.kotlinJvmVersion apply false
    id(Plugins.jetbrainsKotlin) version Plugins.kotlinJvmVersion apply false
}
