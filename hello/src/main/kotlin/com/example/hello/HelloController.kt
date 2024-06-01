package com.example.hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/v1")
    fun hello(): Map<String, String> {
        return mapOf("message" to "Hello World! V1")
    }
}
