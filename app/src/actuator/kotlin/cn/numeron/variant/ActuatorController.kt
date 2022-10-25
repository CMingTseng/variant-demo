package cn.numeron.variant

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ActuatorController {

    @GetMapping("say-actuator-hello")
    fun sayHello(): String {
        return "Hello actuator"
    }

}