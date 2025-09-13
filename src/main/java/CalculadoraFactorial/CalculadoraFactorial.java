package CalculadoraFactorial;

public class CalculadoraFactorial {

    public static double sumaFactoriales(int n) {

        if (n < 2)
            return 0;

        return factorial(n) + sumaFactoriales(n - 1);
    }

    private static double factorial(int x) {
        
        if (x <= 1)
            return 1;

        return x * factorial(x - 1);
    }

}
