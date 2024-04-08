import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaTest {
    @Test
    public void comprobarSuma() {
        assertEquals(5, Suma.sumar(2,3));
    }
}