import Shape.Paper
import Shape.Rock
import Shape.Scissors
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
}
