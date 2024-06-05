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

        assertEquals(expected, actual.words)
    }

    @Test
    fun `GIVEN blank string WHEN countWords THEN return 0`() {
        val text = "   "
        val expected = 0

        val actual = counter.countWordsFromString(text)

        assertEquals(expected, actual.words)
    }

    @Test
    fun `GIVEN string with 5 words WHEN countWords THEN return 5`() {
        val text = "Mary had a little lamb"
        val expected = 4

        val actual = counter.countWordsFromString(text)

        assertEquals(expected, actual.words)
    }

    @Test
    fun `GIVEN string with 5 words with empty spaces at head and tail WHEN countWords THEN return 5`() {
        val text = "   Mary had a little lamb    "
        val expected = 4

        val actual = counter.countWordsFromString(text)

        assertEquals(expected, actual.words)
    }

    @Test
    fun `GIVEN string with 5 words with empty spaces in between words WHEN countWords THEN return 5`() {
        val text = "Mary   had a    little lamb"
        val expected = 4

        val actual = counter.countWordsFromString(text)

        assertEquals(expected, actual.words)
    }

    @Test
    fun `GIVEN string with multiple occurrences of words WHEN countWords THEN count number of unique words`() {
        val text = "Humpty-Dumpty sat on a wall. Humpty-Dumpty had a great fall."
        val expectedWords = 7
        val expectedUniqueWords = 6

        val actual = counter.countWordsFromString(text)

        assertEquals(expectedWords, actual.words)
        assertEquals(expectedUniqueWords, actual.uniqueWords)
    }

    @Test
    fun `GIVEN string with multiple words WHEN countWords THEN average word length is correct`() {
        val text = "Mary had a little lamb"
        val expectedAverage = 4.25

        val actual = counter.countWordsFromString(text)

        assertEquals(expectedAverage, actual.averageWordLength)
    }

    @Test
    fun `GIVEN text in file with 5 words WHEN countWords THEN return 5`() {
        val file = File("src/test/resources/textContent.txt")
        val expected = 20

        val actual = counter.countWordsFromFile(file)

        assertEquals(expected, actual.words)
    }
}