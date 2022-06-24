plugins {
    id("org.springframework.boot") version "2.7.0"
}

dependencies {
    implementation("org.springframework.cloud:spring-cloud-starter")
    implementation("org.springframework.cloud:spring-cloud-config-server")
}

springBoot {
    mainClass.set("de.qhun.stackoverflow.q72736083.configServer.ConfigServerApplicationKt")
}