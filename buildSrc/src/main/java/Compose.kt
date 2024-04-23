object Compose {
    private const val activityComposeVersion = "1.6.1"
    const val activity = "androidx.activity:activity-compose:$activityComposeVersion"
    const val viewbinding = "androidx.compose.ui:ui-viewbinding:1.5.0"
    //    const val viewbinding = "androidx.compose.ui:ui-viewbinding:1.7.0-alpha04"
    const val kotlinCompilerComposeVersion = "1.5.3"
    const val composeVersion = "1.5.2"
    private const val materialVersion = "1.4.0-alpha03"
    const val ui = "androidx.compose.ui:ui:${this.composeVersion}"
    const val material = "androidx.compose.material:material:${this.materialVersion}"
    const val tooling = "androidx.compose.ui:ui-tooling:${this.composeVersion}"
    const val util = "androidx.compose.ui:ui-util:${this.composeVersion}"
    private const val navigationVersion = "2.5.3"
    const val navigation = "androidx.navigation:navigation-compose:$navigationVersion"

    const val maps = "com.google.maps.android:maps-compose:2.11.4"
    const val swipeRefresh = "com.google.accompanist:accompanist-swiperefresh:0.25.1"

    const val iconsCore = "androidx.compose.material:material-icons-core:1.3.1"
    const val iconsExtended = "androidx.compose.material:material-icons-extended:1.3.1"
    const val charts = "io.github.bytebeats:compose-charts:0.1.2"
}

object ComposeTest {
    const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4:${Compose.composeVersion}"
    const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:${Compose.composeVersion}"
}