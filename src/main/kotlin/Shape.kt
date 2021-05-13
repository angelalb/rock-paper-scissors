sealed class Shape {
    object Paper : Shape() {
        override fun beats(other: Shape) = other is Rock
        override fun toString() = "paper"
    }

    object Scissors : Shape() {
        override fun beats(other: Shape) = other is Paper
        override fun toString() = "scissors"
    }

    object Rock : Shape() {
        override fun beats(other: Shape) = other is Scissors
        override fun toString() = "rock"
    }

    object Spock : Shape() {
        override fun beats(other: Shape) = other is Scissors || other is Rock
        override fun toString() = "spock"
    }

    object Lizard : Shape() {
        override fun beats(other: Shape) = other is Spock || other is Paper
        override fun toString() = "lizard"
    }

    abstract fun beats(other: Shape): Boolean

    companion object {
        fun random() = listOf(Paper, Scissors, Rock, Spock, Lizard).random()
    }
}
