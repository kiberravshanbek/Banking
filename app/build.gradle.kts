plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.banking"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.banking"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures{
        viewBinding=true
    }

}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation("android.arch.persistence.room:runtime:1.1.1")
    annotationProcessor("android.arch.persistence.room:compiler:1.1.1")
    implementation("com.squareup.okhttp3:okhttp:4.11.0")
    implementation(platform("com.squareup.okhttp3:okhttp-bom:4.11.0"))
    implementation ("com.google.code.gson:gson:2.10.1")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    implementation("com.google.dagger:hilt-android:2.44")
    kapt ("com.google.dagger:hilt-compiler:2.44")
    var activity_version = "1.8.0"
    implementation ("androidx.activity:activity-ktx:$activity_version")
    implementation ("com.github.kirich1409:viewbindingpropertydelegate-full:1.5.9")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")

    val lifecycle_version = "2.6.2"
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")

    val fragment_version = "1.6.1"
    implementation ("androidx.fragment:fragment-ktx:$fragment_version")
    implementation( "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")

    val nav_version = "2.7.4"

    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")

}

kapt {
    correctErrorTypes =true
}