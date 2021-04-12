package ru.appline.tatiana.hw_04.task_01;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[20];
        //диапазон от -10 до 10: считаем -10 входит в диапазон, 10 не входит.
        int a = -10;
        int b = 10;
        System.out.println("Получаем массив:");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = a + (int) (Math.random() * (b - a));
            System.out.print(" " + myArray[i]);
        }
        int max_negative = Integer.MIN_VALUE;
        int min_positive = Integer.MAX_VALUE;
        int index_positive = 0;
        int index_negative = 0;
        int temp;// переменная для перестановки местами максимального отрицательного элемента и минимального положительного
        for (int i = 0; i < myArray.length; i++) {
            if ((myArray[i] < 0) && (max_negative < myArray[i])) {
                max_negative = myArray[i];
                index_negative = i;
            }
            if ((myArray[i] > 0) && (min_positive > myArray[i])) {
                min_positive = myArray[i];
                index_positive = i;
            }
        }
        System.out.println();
        System.out.println("Минимальный положительный элемент массива: " + min_positive);
        System.out.println("Максимальный отрицательный элемент массива: " + max_negative);
        temp = myArray[index_negative];
        myArray[index_negative] = myArray[index_positive];
        myArray[index_positive] = temp;

        System.out.println("Массив после перестановки найденных элементов:");
        System.out.println(Arrays.toString(myArray));
    }
}



