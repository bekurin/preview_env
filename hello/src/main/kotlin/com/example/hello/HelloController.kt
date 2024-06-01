package com.example.hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/v1")
    fun helloV1(): Map<String, String> {
        return mapOf("message" to "Hello World! V1")
    }

    @GetMapping("/v2")
    fun helloV2(): Map<String, String> {
        return mapOf("message" to "Hello World! V2")
    }
}
