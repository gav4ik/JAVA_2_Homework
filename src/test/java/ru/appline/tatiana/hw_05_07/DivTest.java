package ru.appline.tatiana.hw_05_07;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivTest {

    Div d;

    @Before
    public void setUp() {
        d = new Div();
    }

    @Test
    public void testDiv() {
        assertEquals("Деление двух положительных чисел", Double.valueOf(9), d.calculate((double) 36, (double) 4));
        assertEquals("Деление двух отрицательных чисел", Double.valueOf(3), d.calculate((double) -15, (double) -5));
        assertEquals("Деление положительного и отрицательного числа", Double.valueOf(-7), d.calculate((double) -21, (double) 3));
    }

    @Test(expected = CalculateExceptions.class)
    public void testException() {
        d.calculate((double) 36, (double) 0);
    }
}