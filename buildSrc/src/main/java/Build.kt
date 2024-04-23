object Build {
    private const val androidBuildToolsVersion = "8.3.0"
    const val androidBuildTools = "com.android.tools.build:gradle:$androidBuildToolsVersion"

    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"

    const val androidNavigationSafeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:2.5.3"
    const val ktLint = "org.jlleitschuh.gradle:ktlint-gradle:9.2.1"
    const val spotless = "com.diffplug.spotless:spotless-plugin-gradle:6.9.1"

}
