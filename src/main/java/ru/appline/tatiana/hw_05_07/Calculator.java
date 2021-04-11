package ru.appline.tatiana.hw_05_07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {

    private final Map<String, Calculate> calc = new HashMap<>();

    public static void main(String[] args) {
        Calculator c = new Calculator();
        double oper1 = c.getOperand();
        double oper2 = c.getOperand();
        String act = null;
        Double result = null;
        try {
            act = c.getAct();
            result = c.calc(act, oper1, oper2);
        } catch (CalculateExceptions e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.print("Результат вычисления: " + oper1 + " " + act + " " + oper2 + " = ");
        System.out.print(result);

    }

    public Calculator() {
        calc.put("+", new Add());
        calc.put("-", new Sub());
        calc.put("*", new Mult());
        calc.put("/", new Div());

    }

    public Double calc(String act, Double op1, Double op2) {
        return calc.get(act).calculate(op1, op2);
    }

    public Double getOperand() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число:");
            try {
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.print("Введённое значение не может быть интерпретированно как число! ");
            }
        }
    }
    public String getAct() {
        System.out.println("Введите знак действия для вычисления: +, -, *, / ");
        Scanner scanner = new Scanner(System.in);
        String act = scanner.next();
        if(!calc.containsKey(act))
            throw new CalculateExceptions("Введен неверный знак вычисления.");
        return act;
        }
}
