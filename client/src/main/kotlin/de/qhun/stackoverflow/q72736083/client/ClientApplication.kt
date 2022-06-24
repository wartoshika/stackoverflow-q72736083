package de.qhun.stackoverflow.q72736083.client

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.core.env.Environment

@SpringBootApplication
@RefreshScope
open class ClientApplication(
    private val env: Environment
) {
    init {
       // the wanted `application-dev.yml` from the project root
       // is within the env bean above. prio is not correct
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(ClientApplication::class.java, *args)
}