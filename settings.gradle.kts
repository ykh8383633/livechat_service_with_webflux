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
include("domain")
include("infra:persistence")
findProject(":infra:persistence")?.name = "persistence"
include("pipelines:saveChatProcessor")
findProject(":pipelines:saveChatProcessor")?.name = "saveChatProcessor"
include("pipelines:defaultValidationProcessor")
findProject(":pipelines:defaultValidationProcessor")?.name = "defaultValidationProcessor"
