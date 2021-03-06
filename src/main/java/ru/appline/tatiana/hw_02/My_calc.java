package ru.appline.tatiana.hw_02;

import java.util.Scanner;

/**
 * Class My_calc
 * Calculate result from inputed float values and calculating action
 * @author Naryshkina Tatyana
 */
public class My_calc {


    /**
     * Main method is the essential program procedure which contain the basic programm logic
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

    }
}
