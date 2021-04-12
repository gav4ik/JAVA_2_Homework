package ru.appline.tatiana.hw_04.task_02;

public class Chocolate extends Present{
    private int cacao;

    public Chocolate(String name, int weight, Double price, int cacao) {
        super(name, weight, price);
        this.cacao = cacao;
    }

    public int getCacao() {
        return cacao;
    }

    public void setCacao(int cacao) {
        this.cacao = cacao;
    }

    @Override
    public String toString() {
        return "Шоколад: " + super.toString() + ", Процент содержания какао = " + cacao;
    }
}
