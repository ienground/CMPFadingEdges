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

rootProject.name = "CMPFadingEdges"

include(":cmp-fadingedges")
include(":example")
include(":example:composeApp")