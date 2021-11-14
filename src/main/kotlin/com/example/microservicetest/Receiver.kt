package com.example.microservicetest

import org.springframework.stereotype.Component;
@Component()
class Receiver {

    fun receiveMessage(message: String) {
        println("Received <$message>")
    }
}