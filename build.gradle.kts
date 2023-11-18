import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "3.1.5" apply false
    id("io.spring.dependency-management") version "1.1.3" apply false
    kotlin("jvm") version "1.8.22"
    kotlin("plugin.spring") version "1.8.22" apply false
}

allprojects{
    group = "org.example"
    version = "1.0-SNAPSHOT"

    repositories {
        // jcenter()
        mavenCentral()
    }

}

subprojects{
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "org.jetbrains.kotlin.plugin.spring")
    apply(plugin = "kotlin")
    apply(plugin = "kotlin-kapt")

    dependencies {


        //implementation("org.springframework.boot:spring-boot-starter-mustache")
        implementation("org.springframework.boot:spring-boot-starter-webflux")
        runtimeOnly("org.springframework.boot:spring-boot-devtools")

        implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
        implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
        annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

        // db

        // util
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

        // test
        testImplementation(kotlin("test"))
    }

    tasks.test {
        useJUnitPlatform()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }
}


