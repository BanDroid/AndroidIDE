/*
 *  This file is part of AndroidIDE.
 *
 *  AndroidIDE is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  AndroidIDE is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with AndroidIDE.  If not, see <https://www.gnu.org/licenses/>.
 */
plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    namespace = "com.itsaky.androidide.layoutlib"
    
    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(libs.common.jkotlin)
    
    implementation(libs.aapt2.annotations)
    implementation(libs.aapt2.jb.annotations)
    
    implementation(libs.google.guava.jre)
    
    testImplementation(libs.tests.junit)
    testImplementation(libs.tests.google.truth)
}