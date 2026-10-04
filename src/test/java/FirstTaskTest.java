import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTaskTest {

    @Test
    void powerZero() {
        assertEquals(1, FirstTask.power(2, 0));
    }

    @Test
    void powerRecursiveCases() {
        assertEquals(8, FirstTask.power(2, 3));
        assertEquals(5, FirstTask.power(5, 1));
        assertEquals(-8, FirstTask.power(-2, 3));
    }

    @Test
    void negativeExponentThrowsException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> FirstTask.power(2, -1)
        );
    }
}