package ru.appline.tatiana.hw_05_07;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testCalc() {
        Calculator c = new Calculator();
        assertEquals("Сложение",Double.valueOf(5),c.calc("+", (double)3,(double)2));
        assertEquals("Вычитание",Double.valueOf(1),c.calc("-", (double)3,(double)2));
        assertEquals("Умножение",Double.valueOf(6),c.calc("*", (double)3,(double)2));
        assertEquals("Деление",Double.valueOf(3),c.calc("/", (double)6,(double)2));
    }

}