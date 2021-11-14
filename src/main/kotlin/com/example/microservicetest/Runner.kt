package com.example.microservicetest

import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component


@Component
class Runner(private val rabbitTemplate: RabbitTemplate) : CommandLineRunner {
    @Throws(Exception::class)
    override fun run(vararg args: String) {
        println("Sending message...")
        rabbitTemplate.convertAndSend(
            MicroserviceTestApplication.topicExchangeName,
            "foo.bar.baz",
            "Hello from RabbitMQ!"
        )
    }
}