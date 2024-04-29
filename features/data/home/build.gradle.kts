plugins {
    id(Plugins.androidLibrary)
    kotlin(Plugins.android)
    id(Plugins.kotlinKsp)
    id(Plugins.hilt)
}

android {
    namespace = "com.megatrust.home"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    // empedded modules
//    implementation(project(Modules.commonData))
//    implementation(project(Modules.commonDomain))
//    implementation(project(Modules.commonResource))
//    implementation(project(Modules.homeDomain))

    // Hilt
    implementation(DaggerHilt.android)
    ksp(DaggerHilt.hiltCompiler)

    // Arrow
    implementation(Arrow.core)
    implementation(Arrow.syntax)
    ksp(Arrow.meta)

    // Okhttp
    implementation(platform(Okhttp.bom))
    implementation(Okhttp.okhttp)
    implementation(Okhttp.interceptor)

    // Retrofit
    implementation(Retrofit.core)
    implementation(Retrofit.converterMoshi)
    implementation(Retrofit.moshi)
    ksp(Retrofit.moshiKCG)

    // Test
    testImplementation(Junit.junit4)
    androidTestImplementation(Junit.junit4)
    androidTestImplementation(AndroidXTest.runner)
//    implementation("androidx.core:core-ktx:1.13.0")
//    implementation("androidx.appcompat:appcompat:1.6.1")
//    implementation("com.google.android.material:material:1.11.0")
//    testImplementation("junit:junit:4.13.2")
//    androidTestImplementation("androidx.test.ext:junit:1.1.5")
//    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}