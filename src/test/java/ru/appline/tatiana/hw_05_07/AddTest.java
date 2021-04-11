package ru.appline.tatiana.hw_05_07;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddTest {

    @Test
    public void testAdd() {
        Add a = new Add();
        assertEquals("Сложение двух положительных чисел",Double.valueOf(5),a.calculate((double)3,(double)2));
        assertEquals("Сложение отрицательного и положительного числа", Double.valueOf(-5),a.calculate((double)-12,(double)7));
        assertEquals("Сложение отрицательных чисел", Double.valueOf(-10),a.calculate((double)-5,(double)-5));
        assertEquals("Сложение с нулём", Double.valueOf(8),a.calculate((double)8,(double)0));

    }

}