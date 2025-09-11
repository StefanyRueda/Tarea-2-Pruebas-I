package tests;

import CalculadoraFactorial.CalculadoraFactorial;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PruebaSumaFact {

    @ParameterizedTest(name = "n: {0}  Resultado esperado: {1}")
    @CsvSource({
            "0, 0",
            "1, 0",
            "2, 2",
            "3, 8",
            "4, 32",
            "5, 152",
            "6, 872",
            "7, 5912",
            "8, 46232",
            "9, 409112",
            "10, 4037912"
    })
    public void sumasFactoriales(int n, double esperado) {
        assertEquals(esperado, CalculadoraFactorial.sumaFactoriales(n));
    }

    @Test
    @DisplayName("n negativo retorna 0")
    public void testNegativo() {
        assertEquals(0, CalculadoraFactorial.sumaFactoriales(-5));
    }


}
