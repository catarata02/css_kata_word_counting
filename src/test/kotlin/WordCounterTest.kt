import org.example.WordCounter
import kotlin.test.Test
import kotlin.test.assertEquals

class WordCounterTest {
    val counter = WordCounter()

    @Test
    fun `GIVEN empty string WHEN countWords THEN return 0`() {
        val text = ""
        val expected = 0

        val actual = counter.countWords(text)

        assertEquals(expected, actual)
    }

    @Test
    fun `GIVEN blank string WHEN countWords THEN return 0`() {
        val text = "   "
        val expected = 0

        val actual = counter.countWords(text)

        assertEquals(expected, actual)
    }

    @Test
    fun `GIVEN string with 5 words WHEN countWords THEN return 5`() {
        val text = "Mary had a little lamb"
        val expected = 5

        val actual = counter.countWords(text)

        assertEquals(expected, actual)
    }
}