package moreKotlinFundamentals

// Define the Daypart enum class
enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
}

// Define the Event data class
data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int
)

fun main() {
    // Store all events in a List
    val events = mutableListOf(
        Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0),
        Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15),
        Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30),
        Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60),
        Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10),
        Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)
    )

    // Print the count of events
    println("Number of events scheduled: ${events.size}")

    // Optionally, add more events
    events.add(Event(title = "Read a book", daypart = Daypart.EVENING, durationInMinutes = 30))

    // Print the updated count of events
    println("Number of events after adding a new one: ${events.size}")
}
