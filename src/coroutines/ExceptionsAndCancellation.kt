package coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        println("Weather forecast")
        println(getWeatherReportOther())
        println("Have a good day!")
    }
}

suspend fun getWeatherReportOther() = coroutineScope {
    val forecast = async { getForecast() }
    val temperature = async {
        try {
            getTemperature()
        } catch (e: AssertionError) {
            println("Caught exception $e")
            "{ No temperature found }"
        }
    }
    "${forecast.await()} ${temperature.await()}"
}