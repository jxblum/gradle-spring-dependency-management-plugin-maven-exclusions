plugins {
    id("java-library")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {
    api("org.springframework:spring-core:6.2.8") {
        exclude(group = "org.springframework", module = "spring-jcl")
    }
}

tasks.test {
    useJUnitPlatform()
}
