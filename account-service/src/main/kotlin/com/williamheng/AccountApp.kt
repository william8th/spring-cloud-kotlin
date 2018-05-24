package com.williamheng

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class AccountApp {
}

fun main(args: Array<String>) {
    SpringApplication.run(AccountApp::class.java, *args)
}
