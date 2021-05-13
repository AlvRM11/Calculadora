import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    public void TestSumayResta(){
        final int resultadoSuma = 77;
        final int resultadoResta = 13;

        double actual = calculadora.SumayResta(45, 32);

        assertEquals(resultadoSuma, actual);
        assertEquals(resultadoResta, actual);
    }

    @Test
    public void TestMultiplicacion(){
        final int resultadoMulti = 50;
        
        double actual = calculadora.Multiplicacion(25, 2);

        assertEquals(resultadoMulti, actual);
    }

    @Test
    public void TestDivision(){
        final int resultadoDiv = 2;

        double actual = calculadora.Division(30, 15);

        assertEquals(resultadoDiv, actual);
    }

    @Test
    public void TestValorAbsoluto(){
        double actual = calculadora.VAbsoluto(-9);

        assertEquals(9, actual);
    }

    @Test
    public void TestExponente(){
        double actual = calculadora.ElevarNum(3);

        assertEquals(27, actual);
    }

    @Test
    public void TestEsPositivo(){
        boolean actual = calculadora.EsPositivo(-3);

        assertEquals(false, actual);
    }
}
