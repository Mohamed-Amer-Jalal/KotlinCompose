package kotlinFundamentals

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when (age) {
        in 0..12 -> 15 // Children's ticket
        in 13..60 -> if (isMonday) 25 else 30 // Standard ticket with Monday discount
        in 61..100 -> 20 // Senior ticket
        else -> -1 // Invalid age
    }
}
