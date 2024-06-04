import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTestJava {

    private Hello hello = new Hello();

    @Test
    void test_Hello_say() {
        String result = hello.say();

        assertEquals("World", result);
    }

}