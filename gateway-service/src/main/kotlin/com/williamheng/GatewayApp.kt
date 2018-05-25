package com.williamheng

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@SpringBootApplication
@EnableZuulProxy
class GatewayApp {

}

fun main(args: Array<String>) {
    SpringApplication.run(GatewayApp::class.java, *args)
}