plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("com.google.devtools.ksp") version libs.versions.ksp
}

android {
    namespace = "com.itsaky.androidide.editor"
}

kapt {
    arguments {
        arg ("eventBusIndex", "com.itsaky.androidide.events.EditorEventsIndex")
    }
}

dependencies {
    ksp(projects.annotationKsp)
    kapt(libs.common.eventbus.ap)
    
    api(libs.androidide.ts)
    api(libs.androidide.ts.java)
    api(libs.androidide.ts.json)
    api(libs.androidide.ts.kotlin)
    api(libs.androidide.ts.xml)
    api(libs.common.editor)
    api(libs.common.editor.ts)
    
    api(projects.editorApi)
    
    implementation(libs.androidx.annotation)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    
    implementation(libs.common.utilcode)
    
    implementation(libs.google.material)
    
    implementation(projects.actions)
    implementation(projects.annotations)
    implementation(projects.common)
    implementation(projects.eventbusAndroid)
    implementation(projects.eventbusEvents)
    implementation(projects.lexers)
    implementation(projects.shared)
    implementation(projects.resources)
    
    implementation(projects.lsp.api)
    implementation(projects.lsp.java)
    implementation(projects.lsp.xml)
    
    testImplementation(libs.tests.junit)
    testImplementation(libs.tests.google.truth)
    testImplementation(libs.tests.robolectric)
}