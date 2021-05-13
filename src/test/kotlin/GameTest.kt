import Game.GameState.Player1Wins
import Shape.Paper
import Shape.Rock
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

/*
Stage 4
Create a Game object that will simulate 2 players throwing shapes until one player wins the best of 7.

Each round must be printed showing the shapes thrown by both players, the result of the round and a
running total of the scores.
*/


class GameTest {

    @Test
    fun `paper beats rock`() {
        val game = Game()
        val round = Round(Paper, Rock)

        game.play(round)

        assertTrue(game.state() == Player1Wins)
    }
}
