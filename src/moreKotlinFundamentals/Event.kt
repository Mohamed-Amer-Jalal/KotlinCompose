package moreKotlinFundamentals

// Define the Daypart enum
enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
}

// Refactor the Event class to use the Daypart enum
data class Event(
    val title: String,
    val description: String?,
    val daypart: Daypart,
    val durationInMinutes: Int
)

fun main() {
    // Create an event instance using the Daypart enum values
    val event = Event(
        title = "Study Kotlin",
        description = "Commit to studying Kotlin at least 15 minutes per day.",
        daypart = Daypart.EVENING,
        durationInMinutes = 15
    )

    println(event)
}
