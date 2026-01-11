pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "CMPFadingEdiges"

include(":cmp-fadingedges")
include(":example")
include(":example:composeApp")