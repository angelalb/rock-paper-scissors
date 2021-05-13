import Shape.Paper
import Shape.Rock
import Shape.Scissors
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ShapeTest {

    @Test
    fun `paper beats rock`() {
        assertTrue(Paper.beats(Rock))
    }
    @Test

    fun `rock beats scissors`() {
        assertTrue(Rock.beats(Scissors))
    }

    @Test
    fun `scissors beats paper`() {
        assertTrue(Scissors.beats(Paper))
    }

    @Test
    fun `paper doesn't beat scissor`() {
        assertFalse(Paper.beats(Scissors))
    }

    @Test
    fun `scissor doesn't beat rock`() {
        assertFalse(Scissors.beats(Rock))
    }

    @Test
    fun `rock doesn't beat paper`() {
        assertFalse(Rock.beats(Paper))
    }

    @Test
    fun `paper doesn't beat paper`() {
        assertFalse(Paper.beats(Paper))
    }

    @Test
    fun `scissor doesn't beat scissor`() {
        assertFalse(Scissors.beats(Scissors))
    }

    @Test
    fun `rock doesn't beat rock`() {
        assertFalse(Rock.beats(Rock))
    }
}
