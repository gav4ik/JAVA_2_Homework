package ru.appline.tatiana.hw_03;

import java.util.Scanner;

/**
 * Class ChooseOperation
 * Get the user to choose between two options: find the max value of the string array or calculate result from inputed float values and calculating action
 * @author Naryshkina Tatyana
 */
public class ChooseOperation {
    /**
     * Main method is the essential program procedure which contain the basic programm logic
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        int input;
        int size; // number of array elements
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие: 1 - поиск максимального элемента массива, 2 - пользование калькулятором");
        input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("Вы выбрали поиск максимального элемента в строковом массиве.");
                System.out.println("Введите количество элементов в массиве");
                size = scanner.nextInt();
                String[] myArray = new String[size];// array of string elements
                for (int i = 0; i < size; i++) {
                    System.out.print("Введите элемент " + (i + 1) + ":  ");
                    myArray[i] = scanner.next();
                }
                String max = myArray[0]; //contains max value of array
                for (int i = 1; i < size; i++) {
                    if (max.length() < myArray[i].length()) {
                        max = myArray[i];
                    }
                }
                System.out.println(" ");
                System.out.println("Максимальный элемент массива: " + max);
                break;


            case 2:
                System.out.println("Вы выбрали пользование калькулятором.");
                System.out.println("Введите первое дробное число");
                double a = scanner.nextDouble(); // the first inputed fraction value
                System.out.println("Введите второе дробное число");
                double b = scanner.nextDouble(); // the second inputed fraction value
                double result = 0; //variable contains the result of calculating
                System.out.println("Введите вид действия по вычислению: +, -, *, / ");
                char action = scanner.next().charAt(0); // the inputed type of calculating action
                switch (action) {
                    case '+':
                        result = a + b;
                        System.out.print(a + " " + action + " " + b + " " + " = ");
                        System.out.printf("%.4f", result);
                        break;
                    case '-':
                        result = a - b;
                        System.out.print(a + " " + action + " " + b + " " + " = ");
                        System.out.printf("%.4f", result);
                        break;
                    case '*':
                        result = a * b;
                        System.out.print(a + " " + action + " " + b + " " + " = ");
                        System.out.printf("%.4f", result);
                        break;
                    case '/':
                        if (b == 0) {
                            System.out.println("Делить на ноль нельзя!");

                        } else {
                            result = a / b;
                            System.out.print(a + " " + action + " " + b + " " + " = ");
                            System.out.printf("%.4f", result);
                        }
                        break;
                    default:
                        System.out.println("Неподходящее действие для вычисления. Программа завершена. Запустите её заново.");

                }
            default:
                System.out.println("Вы ввели некорректное значение. Запустите Программу заново");
        }
    }
}



