plugins {
    id("easter.eggs.library")
}

android {
    namespace = "com.dede.android_eggs.settings"
}

dependencies {
    implementation(libs.androidx.core)
    implementation(libs.androidx.appcompat)
}
