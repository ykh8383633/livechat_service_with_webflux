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
include("pipelines")
include("pipelines:spamProcessor")
findProject(":pipelines:spamProcessor")?.name = "spamProcessor"
include("infra:redis")
findProject(":infra:redis")?.name = "redis"
include("pipelines:recentChatProcessor")
findProject(":pipelines:recentChatProcessor")?.name = "recentChatProcessor"
