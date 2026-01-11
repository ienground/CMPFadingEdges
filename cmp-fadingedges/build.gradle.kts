plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.devtools.ksp)
    alias(libs.plugins.vanniktech.mavenPublish)
    alias(libs.plugins.android.kotlin.multiplatform.library)
    alias(libs.plugins.android.lint)
}

group = "zone.ien.cmpfadingedges"
version = libs.versions.lib.version.name.get()

kotlin {
    androidLibrary {
        namespace = "zone.ien.cmpfadingedges"
        compileSdk = libs.versions.android.compileSdk.get().toInt()
        minSdk = libs.versions.android.minSdk.get().toInt()

        withDeviceTestBuilder {
            sourceSetTreeName = "test"
        }.configure {
            instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }
    }
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.compose.material3)
            }
        }

        commonTest {
            dependencies {
                implementation(libs.kotlin.test)
            }
        }

        androidMain {
            dependencies {

            }
        }

        getByName("androidDeviceTest") {
            dependencies {
                implementation(libs.runner)
                implementation(libs.core)
                implementation(libs.junit)
            }
        }

        iosMain {
            dependencies {

            }
        }
    }
}

mavenPublishing {
    publishToMavenCentral()

//    signAllPublications()

    coordinates(group.toString(), "cmp-fadingedges", version.toString())

    pom {
        name = project.name
        description = "Fading Edges Library for Compose Multiplatform"
        inceptionYear = "2026"
        url = "https://github.com/ienground/CMPFadingEdges"
        licenses {
            license {
                name = "Apache-2.0"
                url = "http://www.apache.org/licenses/LICENSE-2.0"
            }
        }
        developers {
            developer {
                id = "ienground"
                name = "Ericano Rhee"
                url = "my@ien.zone"
            }
        }
        scm {
            url = "https://github.com/ienground/CMPFadingEdges.git"
            connection = "scm:git:https://github.com/ienground/CMPFadingEdges.git"
            developerConnection = "scm:git:https://github.com/ienground/CMPFadingEdges.git"
        }
    }
}