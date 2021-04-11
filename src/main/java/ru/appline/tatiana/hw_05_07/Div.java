package ru.appline.tatiana.hw_05_07;

public class Div implements Calculate{
    @Override
    public Double calculate(Double operand_1, Double operand_2) {
        if(operand_2 == 0)
            throw new CalculateExceptions("Делить на ноль нельзя!");
        return operand_1/operand_2;
    }
}
