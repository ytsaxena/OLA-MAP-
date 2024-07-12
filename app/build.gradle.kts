import org.gradle.internal.impldep.bsh.commands.dir

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.anonymous.olamap"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.anonymous.olamap"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
        }
        release {


            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        debug {
            isMinifyEnabled= false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures{
        viewBinding =true
    }

}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:4.9.3")


    implementation(files("libs/maps-1.0.68.aar"))

//    debugImplementation(files("libs/maps-1.0.68.aar"))
//    releaseImplementation(files("libs/maps-1.0.68.aar"))


    // Required for Ola-MapsSdk
    implementation ("com.moengage:moe-android-sdk:12.6.01")
    implementation ("org.maplibre.gl:android-sdk:10.2.0")
    implementation ("org.maplibre.gl:android-sdk-directions-models:5.9.0")
    implementation ("org.maplibre.gl:android-sdk-services:5.9.0")
    implementation ("org.maplibre.gl:android-sdk-turf:5.9.0")
    implementation ("org.maplibre.gl:android-plugin-markerview-v9:1.0.0")
    implementation ("org.maplibre.gl:android-plugin-annotation-v9:1.0.0")

    implementation ("androidx.lifecycle:lifecycle-runtime:2.0.0")
    implementation ("androidx.lifecycle:lifecycle-extensions:2.0.0")
    annotationProcessor ("androidx.lifecycle:lifecycle-compiler:2.0.0")
}