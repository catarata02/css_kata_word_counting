import org.example.WordCounter
import java.io.File
import kotlin.test.Test
import kotlin.test.assertEquals

class WordCounterTest {
    val counter = WordCounter()

    @Test
    fun `GIVEN empty string WHEN countWords THEN return 0`() {
        val text = ""
        val expected = 0

        val actual = counter.countWordsFromString(text)

        assertEquals(expected, actual)
    }

    @Test
    fun `GIVEN blank string WHEN countWords THEN return 0`() {
        val text = "   "
        val expected = 0

        val actual = counter.countWordsFromString(text)

        assertEquals(expected, actual)
    }

    @Test
    fun `GIVEN string with 5 words WHEN countWords THEN return 5`() {
        val text = "Mary had a little lamb"
        val expected = 4

        val actual = counter.countWordsFromString(text)

        assertEquals(expected, actual)
    }

    @Test
    fun `GIVEN string with 5 words with empty spaces at head and tail WHEN countWords THEN return 5`() {
        val text = "   Mary had a little lamb    "
        val expected = 4

        val actual = counter.countWordsFromString(text)

        assertEquals(expected, actual)
    }

    @Test
    fun `GIVEN string with 5 words with empty spaces in between words WHEN countWords THEN return 5`() {
        val text = "Mary   had a    little lamb"
        val expected = 4

        val actual = counter.countWordsFromString(text)

        assertEquals(expected, actual)
    }

    @Test
    fun `GIVEN text in file with 5 words WHEN countWords THEN return 5`() {
        val file = File("src/test/resources/textContent.txt")
        val expected = 20

        val actual = counter.countWordsFromFile(file)

        assertEquals(expected, actual)
    }
}