package com.williamheng

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
class CustomerApp {
}

fun main(args: Array<String>) {
    SpringApplication.run(CustomerApp::class.java, *args)
}
