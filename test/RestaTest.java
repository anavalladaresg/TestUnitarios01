import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaTest {
    @Test
    public void restarTest() {
        assertEquals(0, Resta.restar(5,5));
    }
}