package cn.numeron.variant

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

//some annotation
@SpringBootApplication
class VariantDemoApplication

fun main(args: Array<String>) {
    println("Show  here   LogicUtils : ${calculate(5, 6)}")//Java is LogicUtilsKt.calculate or LogicUtils.INSTANCE.calculate
    runApplication<VariantDemoApplication>(*args)
}