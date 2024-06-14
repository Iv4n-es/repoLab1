package org.example.operaciones;

import junit.framework.TestCase;
import org.junit.Test;

public class NumeroPrimoTest extends TestCase {

    @Test
    public void testGetNthPrime() {
        NumeroPrimo primeNumber = new NumeroPrimo();

        assertEquals(2, primeNumber.getNthPrime(1));  // 1º número primo es 2
        assertEquals(3, primeNumber.getNthPrime(2));  // 2º número primo es 3
        assertEquals(5, primeNumber.getNthPrime(3));  // 3º número primo es 5
        assertEquals(7, primeNumber.getNthPrime(4));  // 4º número primo es 7
        assertEquals(11, primeNumber.getNthPrime(5)); // 5º número primo es 11
        assertEquals(13, primeNumber.getNthPrime(6)); // 6º número primo es 13
        assertEquals(17, primeNumber.getNthPrime(7)); // 7º número primo es 17
        assertEquals(19, primeNumber.getNthPrime(8)); // 8º número primo es 19
        assertEquals(23, primeNumber.getNthPrime(9)); // 9º número primo es 23
        assertEquals(29, primeNumber.getNthPrime(10)); // 10º número primo es 29
    }
}

