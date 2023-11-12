pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
    
}
rootProject.name = "liveChat"
include("api")
include("infra")
include("infra:message")
findProject(":infra:message")?.name = "message"
