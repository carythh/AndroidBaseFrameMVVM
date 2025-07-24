pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven { url = java.net.URI.create("https://maven.google.com") }
        maven { url  = java.net.URI.create("https://jitpack.io")}
        maven { url  = java.net.URI.create("https://maven.aliyun.com/repository/central")}
        maven { url  = java.net.URI.create("https://maven.aliyun.com/repository/public")}
        maven { url  = java.net.URI.create("https://maven.aliyun.com/repository/google")}
        maven { url  = java.net.URI.create("https://maven.aliyun.com/repository/gradle-plugin")}

    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven { url = java.net.URI.create("https://maven.google.com") }
        maven { url  = java.net.URI.create("https://jitpack.io")}
        maven { url  = java.net.URI.create("https://maven.aliyun.com/repository/central")}
        maven { url  = java.net.URI.create("https://maven.aliyun.com/repository/public")}
        maven { url  = java.net.URI.create("https://maven.aliyun.com/repository/google")}
        maven { url  = java.net.URI.create("https://maven.aliyun.com/repository/gradle-plugin")}
    }
}

rootProject.name = "AndroidBaseFrameMVVM"

include(
    ":app",
    ":lib_base",
    ":lib_common",
    ":module_home"
)