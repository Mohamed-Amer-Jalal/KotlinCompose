package kotlinFundamentals

// Define the Daypart enum class
enum class DayPart {
    MORNING,
    AFTERNOON,
    EVENING
}

// Define the Event data class
data class Event(
    val title: String,
    val description: String? = null,
    val dayPart: DayPart,
    val durationInMinutes: Int
)

/*// Extension property to get the duration as a string
val Event.durationOfEvent: String get() = if (this.durationInMinutes < 60) "short" else "long"

fun main() {
    // List of events
    val events = listOf(
        Event("Wake up", "Time to get up", Daypart.MORNING, 0),
        Event("Eat breakfast", "Time to fuel up", Daypart.MORNING, 15),
        Event("Learn Kotlin", "Study programming", Daypart.AFTERNOON, 90)
    )

    // Using the extension property
    println("Duration of first event of the day: ${events[0].durationOfEvent}")
    println("Duration of second event of the day: ${events[1].durationOfEvent}")
    println("Duration of third event of the day: ${events[2].durationOfEvent}")
}*/

/*fun main() {
    // List of events
    val events = listOf(
        Event("Wake up", "Time to get up", Daypart.MORNING, 0),
        Event("Eat breakfast", "Time to fuel up", Daypart.MORNING, 15),
        Event("Learn Kotlin", "Study programming", Daypart.AFTERNOON, 30)
    )

    // Print the last event's title using the `last()` function
    println("Last event of the day: ${events.last().title}")
    //println("Last event of the day: ${events[events.size - 1].title}")
}*/

fun main() {
    // Store all events in a MutableList
    val events = mutableListOf(
        Event(title = "Wake up", description = "Time to get up", dayPart = DayPart.MORNING, durationInMinutes = 0),
        Event(title = "Eat breakfast", dayPart = DayPart.MORNING, durationInMinutes = 15),
        Event(title = "Learn about Kotlin", dayPart = DayPart.AFTERNOON, durationInMinutes = 30),
        Event(title = "Practice Compose", dayPart = DayPart.AFTERNOON, durationInMinutes = 60),
        Event(title = "Watch latest DevBytes video", dayPart = DayPart.AFTERNOON, durationInMinutes = 10),
        Event(title = "Check out latest Android Jetpack library", dayPart = DayPart.EVENING, durationInMinutes = 45)
    )

    // Step 1: Group the events by their daypart
    val groupedByDaypart = events.groupBy { it.dayPart }

    // Step 2: Count the number of events in each daypart
    val morningCount = groupedByDaypart[DayPart.MORNING]?.size ?: 0
    val afternoonCount = groupedByDaypart[DayPart.AFTERNOON]?.size ?: 0
    val eveningCount = groupedByDaypart[DayPart.EVENING]?.size ?: 0

    // Step 3: Print the summary
    println("Morning: $morningCount events")
    println("Afternoon: $afternoonCount events")
    println("Evening: $eveningCount events")
}