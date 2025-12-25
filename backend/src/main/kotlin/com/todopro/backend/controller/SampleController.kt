package com.todopro.backend.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class SampleController {

    @GetMapping("/")
    fun sampleRequestHandler(@RequestParam(required = false) name: String?): String {
        return "Hello!! ${name ?: "Guest"}"
    }

}