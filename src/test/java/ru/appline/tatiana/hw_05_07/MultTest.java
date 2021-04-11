package ru.appline.tatiana.hw_05_07;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultTest {

    @Test
    public void testMult(){
        Mult mult=new Mult();
        assertEquals("Умножение двух положительных чисел", Double.valueOf(56), mult.calculate((double)7,(double)8));
        assertEquals("Умножение положительного и отрицательного числа", Double.valueOf(-10), mult.calculate((double)2,(double)-5));
        assertEquals("Умножение на ноль", Double.valueOf(0), mult.calculate((double)7,(double)0));
        assertEquals("Умножение двух отрицательных чисел", Double.valueOf(27), mult.calculate((double)-3,(double)-9));

    }
}