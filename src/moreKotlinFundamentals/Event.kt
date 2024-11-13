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

// Extension property to get the duration as a string
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
}


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

/*fun main() {
    // Store all events in a MutableList
    val events = mutableListOf(
        Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0),
        Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15),
        Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30),
        Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60),
        Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10),
        Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)
    )

    // Step 1: Group the events by their daypart
    val groupedByDaypart = events.groupBy { it.daypart }

    // Step 2: Count the number of events in each daypart
    val morningCount = groupedByDaypart[Daypart.MORNING]?.size ?: 0
    val afternoonCount = groupedByDaypart[Daypart.AFTERNOON]?.size ?: 0
    val eveningCount = groupedByDaypart[Daypart.EVENING]?.size ?: 0

    // Step 3: Print the summary
    println("Morning: $morningCount events")
    println("Afternoon: $afternoonCount events")
    println("Evening: $eveningCount events")
}*/