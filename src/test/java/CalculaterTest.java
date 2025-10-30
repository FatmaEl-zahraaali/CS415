
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculaterTest {

    @Test
    void TestAdd() {
        Calculater calc = new Calculater();
        assertEquals(4, calc.add(2, 3));
    }}

