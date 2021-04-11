package ru.appline.tatiana.hw_05_07;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubTest {


    @Test
    public void testSub() {
        Sub s = new Sub();
        assertEquals("Вычитание двух положительных чисел", Double.valueOf(66), s.calculate((double) 100, (double) 34));
        assertEquals("Вычитание двух отрицательных чисел", Double.valueOf(-2), s.calculate((double) -5, (double) -3));
        assertEquals("Вычитание положительного и отрицательного чисел", Double.valueOf(7), s.calculate((double) 2, (double) -5));
        assertEquals("Вычитание нуля", Double.valueOf(10), s.calculate((double) 10, (double) 0));
    }
}