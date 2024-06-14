package org.example.operaciones;

public class NumeroPrimo {

    public int getNthPrime(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("El número debe ser mayor que cero");
        }

        int count = 0;
        int number = 1;

        while (count < n) {
            number++;
            if (isPrime(number)) {
                count++;
            }
        }

        return number;
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
