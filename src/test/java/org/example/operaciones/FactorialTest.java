package org.example.operaciones;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialTest {

    @Test
    public void testCalculate() {
        Factorial factorial = new Factorial();

        assertEquals(1, factorial.calculate(0)); // 0! = 1
        assertEquals(1, factorial.calculate(1)); // 1! = 1
        assertEquals(2, factorial.calculate(2)); // 2! = 2
        assertEquals(6, factorial.calculate(3)); // 3! = 6
        assertEquals(24, factorial.calculate(4)); // 4! = 24
        assertEquals(120, factorial.calculate(5)); // 5! = 120
        assertEquals(720, factorial.calculate(6)); // 6! = 720
    }

}