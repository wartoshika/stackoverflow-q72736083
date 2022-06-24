plugins {
    id("org.springframework.boot") version "2.7.0"
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.cloud:spring-cloud-starter-bootstrap")
    implementation("org.springframework.cloud:spring-cloud-starter")
    implementation("org.springframework.cloud:spring-cloud-starter-config")
}

springBoot {
    mainClass.set("de.qhun.stackoverflow.q72736083.client.ClientApplicationKt")
}