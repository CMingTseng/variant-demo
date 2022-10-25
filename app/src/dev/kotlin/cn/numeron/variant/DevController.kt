package cn.numeron.variant

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DevController {

    @GetMapping("say-dev-hello")
    fun sayHello(): String {
        return "Hello Dev"
    }

}