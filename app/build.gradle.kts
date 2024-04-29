plugins {
    id(Plugins.androidApplication)
    kotlin(Plugins.android)
    id(Plugins.kotlinParcelize)
    id(Plugins.kotlinKsp)
    id(Plugins.crashlytics)
    id(Plugins.perf)
    id(Plugins.navigationSafeargs)
}

android {
    compileSdk = Android.compileSdk
    @Suppress("UnstableApiUsage")
    buildToolsVersion = Android.buildTools
    namespace = Android.appId

    defaultConfig {
        applicationId = Android.appId
        minSdk = Android.minSdk
        targetSdk = Android.targetSdk
        versionCode = Android.versionCode
        versionName = Android.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        getByName("debug") {
            isDebuggable = true
            versionNameSuffix = ".dev"
            applicationIdSuffix = ".dev"
            manifestPlaceholders["appName"] = "Dev.Rahutk"
        }
    }

    ksp {
        arg("room.schemaLocation", "$projectDir/schemas")
        arg("room.incremental", true.toString())
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
        freeCompilerArgs = listOf("-XXLanguage:+InlineClasses", "-opt-in=kotlin.RequiresOptIn")
    }

    buildFeatures {
        viewBinding = true
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Compose.kotlinCompilerComposeVersion
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    //Modules
    implementation(project(Modules.appHome))

    // AndroidX
    implementation(AndroidX.coreKtx)
    implementation(AndroidX.appCompat)
    implementation(AndroidX.activityKtx)
    implementation(AndroidX.fragmentKtx)
    implementation(AndroidX.navigationFragment)
    implementation(AndroidX.navigationUI)
    implementation(AndroidX.legacySupport)
    implementation(AndroidX.webkit)
    implementation(AndroidX.constraintlayout)
    implementation(AndroidX.preferenceKtx)
    implementation(AndroidX.livedataRuntime)
    implementation(AndroidX.lifecycleLivedata)
    implementation(AndroidX.lifecycleProcess)
    implementation(AndroidX.lifecycleRuntime)
    implementation(AndroidX.lifecycleViewmodel)
    implementation(AndroidX.lifecycleViewmodelSavedstate)
    implementation(AndroidX.multidex)

    // Google
    implementation(Google.material)
    implementation(Google.playCoreKtx)
    implementation(Google.playServicesMaps)
    implementation(Google.playServicesPlaces)
    implementation(Google.playServicesAuth)
    implementation(Google.playServicesAuthPhone)

    // FlowBinding
    implementation(FlowBinding.material)
    implementation(FlowBinding.android)
//    implementation(FlowBinding.recyclerview)
    implementation(FlowBinding.swiperefreshlayout)

    // Compose
    implementation(Compose.viewbinding)
    implementation(Compose.navigation)
    implementation(Compose.ui)
    implementation(Compose.tooling)
    implementation(Compose.util)
    implementation(Compose.activity)
    implementation(Compose.material)
    implementation(Compose.swipeRefresh)
    implementation(Compose.iconsCore)
    implementation(Compose.iconsExtended)
    implementation(Compose.maps)
    implementation(Compose.charts)

    // Coil
    implementation(Coil.android)
    implementation(Coil.compose)
    implementation(Coil.svg)

    // Arrow
    implementation(Arrow.core)
    implementation(Arrow.syntax)
    ksp(Arrow.meta)

    // Retrofit
    implementation(Retrofit.core)
    implementation(Retrofit.converterMoshi)
    implementation(Retrofit.moshi)
    ksp(Retrofit.moshiKCG)

    // Okhttp
    implementation(platform(Okhttp.bom))
    implementation(Okhttp.okhttp)
    implementation(Okhttp.urlConnection)
    implementation(Okhttp.interceptor)

    // CameraX
    implementation(CameraX.camera2)
    implementation(CameraX.lifecycle)
    implementation(CameraX.camera3)

    // Kotlinx
    implementation(Kotlinx.coroutinesCore)
    implementation(Kotlinx.coroutinesAndroid)
    implementation(Kotlinx.coroutinesPlayServices)

    // Lottie
    implementation(Lottie.android)
    implementation(Lottie.compose)

    // Firebase
    implementation(platform(Firebase.bom))
    implementation(Firebase.config)
    implementation(Firebase.analytics)
    implementation(Firebase.crashlytics)
    implementation(Firebase.dataBase)
    implementation(Firebase.fireStore)
    implementation(Firebase.messaging)
    implementation(Firebase.perf)


    //Chucker
    debugImplementation(Chucker.library)
    releaseImplementation(Chucker.libraryNoOp)

    // Test
    testImplementation(Junit.junit4)
    androidTestImplementation(AndroidXTest.runner)
    androidTestImplementation(ComposeTest.uiTestJunit4)
    debugImplementation(ComposeTest.uiTestManifest)
    androidTestImplementation(Junit.junit4)
    debugImplementation(Compose.tooling)

}