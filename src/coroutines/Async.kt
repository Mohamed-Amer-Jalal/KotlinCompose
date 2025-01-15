package coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun getForecast(): String {
    delay(1000)
    return "Sunny"
}

suspend fun getTemperature(): String {
    delay(500)
    val isValid = false // Simulate a condition
    if (!isValid) throw AssertionError("Temperature is invalid")
    return "30\u00b0C" // This is now reachable if the condition is met
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