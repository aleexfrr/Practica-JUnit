
import com.mycompany.calculadora.*;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private static Calculadora calc;
    @BeforeAll
    public static void inici(){
        calc = new Calculadora();
    }
    @AfterAll
    public static void fin() {
        calc.restablecer();
    }
    @Test
    public void sumaTest() {
        float res = calc.suma(2, 3);
        float esperado = 5; // 2 + 3 = 5
        assertEquals(esperado, res);
    }
    @Test
    public void restaTest() {
        float res = calc.resta(3, 2);
        float esperado = 1; // 3 - 2 = 1
        assertEquals(esperado, res);
    }
    @Test
    public void multiplicaTest() {
        float res = calc.multiplica(3, 2);
        float esperado = 6; // 3 * 2 = 6
        assertEquals(esperado, res);
    }
    @Test
    public void divideixTest() {
        float res = calc.divideix(12, 3);
        float esperado = 4; // 12 / 3 = 4
        assertEquals(esperado, res);
    }
    @Test
    public void majorQueTest() {
        boolean res = calc.majorQue(3, 2);
        boolean esperado = true; // 3 > 2 = true
        assertEquals(esperado, res);
    }
}
