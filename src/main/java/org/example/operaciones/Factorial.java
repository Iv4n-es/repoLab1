package org.example.operaciones;


public class Factorial {
    public long calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
