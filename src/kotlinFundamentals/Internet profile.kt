package kotlinFundamentals

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

/*class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        println("Likes to $hobby.")

        if (referrer != null) {
            println("Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")
        } else {
            println("Doesn't have a referrer.")
        }
    }
}*/

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")

        // Print the hobby
        hobby?.let { println("Likes to $it.") } ?: println("Hobby not specified.")

        // Print the referrer details
        if (referrer != null) {
            println("Has a referrer named ${referrer.name}, who likes to ${referrer.hobby ?: "unknown hobbies"}.")
        } else {
            println("Doesn't have a referrer.")
        }

        println()
    }
}
