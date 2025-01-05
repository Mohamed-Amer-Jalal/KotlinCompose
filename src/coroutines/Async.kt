package coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun getForecast(): String {
    delay(1000)
    return "Sunny"
}

suspend fun getTemperature(): String {
    delay(1000)
    return "30\u00b0C"
}

fun main() {
    runBlocking {
        println("Weather forecast")
        val forecast = async { getForecast() }
        val temperature = async { getTemperature() }
        println("${forecast.await()} ${temperature.await()}")
        println("Have a good day!")
    }
}