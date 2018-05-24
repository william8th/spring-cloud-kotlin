package com.williamheng

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class App {
}

fun main(args: Array<String>) {
    SpringApplication.run(App::class.java, *args)
}
