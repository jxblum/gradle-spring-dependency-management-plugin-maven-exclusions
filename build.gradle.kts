plugins {
    java
    id("org.springframework.boot") version "3.5.3"
    id("io.spring.dependency-management") version "1.1.7"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

repositories {
    mavenCentral()
    maven {
        url = uri("file:repository/")
    }
}

dependencyManagement {
    applyMavenExclusions(false)
}

dependencies {
    implementation("io.codeprimate.example:maven-lib:0.1.2")
    implementation("org.springframework:spring-beans:6.2.8")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
