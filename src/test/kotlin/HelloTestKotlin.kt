import org.example.Hello
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class HelloTestKotlin{
    val hello = Hello()

    @Test
    fun `GIVEN hello when say() THEN world is returned`() {
        val actual = hello.say()

        assertEquals("world", actual)
    }
}