import Shape.Paper

fun main() {

    /*
    Stage 4
    Create a Game object that will simulate 2 players throwing shapes until one player wins the best of 7.

    Each round must be printed showing the shapes thrown by both players, the result of the round and a
    running total of the scores.
    */

    val game = Game()
    var roundsPlayed = 0

    while (roundsPlayed < 7) {
        val player1 = Shape.random()
        val player2 = Shape.random()
        val round = Round(player1, player2)
        println(round)
        game.play(round)
        roundsPlayed += 1
    }

    println("End game")
    println(game.state())
}
