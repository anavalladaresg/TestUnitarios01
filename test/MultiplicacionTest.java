import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicacionTest {
    @Test
    public void multiplicarTest(){
        assertEquals(10, Multiplicacion.multiplicar(2,5));
    }
}
