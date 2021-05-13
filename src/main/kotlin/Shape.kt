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

    abstract fun beats(other: Shape): Boolean
}
