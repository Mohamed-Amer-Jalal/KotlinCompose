package kotlinFundamentals

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("\"$title\", performed by $artist, was released in $yearPublished.")
    }
}

fun main() {
    val song = Song("Imagine", "John Lennon", 1971, 1200)
    song.printDescription()
    println("Is the song popular? ${song.isPopular}")
}