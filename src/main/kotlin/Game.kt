import Game.GameState.Player1Wins
import Game.GameState.Player2Wins
import Game.GameState.Tie

class Game {
    private var player1Diff: Int = 0

    fun play(round: Round) {
        player1Diff += when {
            round.player1Wins() -> 1
            round.player2Wins() -> -1
            else -> 0
        }
    }

    fun state(): GameState {
        return when {
            player1Diff > 0 -> Player1Wins
            player1Diff < 0 -> Player2Wins
            else -> Tie
        }
    }

    sealed class GameState {
        object Player1Wins: GameState()
        object Player2Wins: GameState()
        object Tie: GameState()
    }
}

class Round(private val player1: Shape, private val player2: Shape) {
    fun player1Wins() = player1.beats(player2)
    fun player2Wins() = player2.beats(player1)
}
