import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondTaskTest {

    @Test
    void baseCases() {
        assertEquals(2, SecondTask.sequence(0));
        assertEquals(3, SecondTask.sequence(1));
    }

    @Test
    void recursiveCases() {
        assertEquals(7, SecondTask.sequence(2));
        assertEquals(13, SecondTask.sequence(3));
        assertEquals(27, SecondTask.sequence(4));
    }

    @Test
    void negativeNumberThrowsException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> SecondTask.sequence(-1)
        );
    }
}