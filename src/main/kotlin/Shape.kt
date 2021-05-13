sealed class Shape {
    object Paper : Shape() {
        override fun beats(other: Shape) = other is Rock
    }

    object Scissors : Shape() {
        override fun beats(other: Shape) = other is Paper
    }

    object Rock : Shape() {
        override fun beats(other: Shape) = other is Scissors
    }

    object Spock : Shape() {
        override fun beats(other: Shape) = other is Scissors || other is Rock
    }

    object Lizard : Shape() {
        override fun beats(other: Shape) = other is Spock || other is Paper
    }

    abstract fun beats(other: Shape): Boolean
}
