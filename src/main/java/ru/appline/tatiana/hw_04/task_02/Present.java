package ru.appline.tatiana.hw_04.task_02;


/**
 * Формируется новогодний подарок.
 * Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * У каждой сладости есть название, вес, цена и свой уникальный параметр.
 * Необходимо собрать подарок из сладостей.
 * Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 */

public abstract class Present {
    private String name;
    private int weight;
    private Double price;

    public Present() {
    }

    public Present(String name, int weight, Double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Наименование: " + name + ", Вес: " + weight + ", Стоимость: " + price;
    }

    public static void main(String[] args) {
        Sweets sw1 = new Sweets("Белочка", 10, 35.6, "Конфета");
        Sweets sw2 = new Sweets("Хрустик", 20, 47.99, "Вафля");
        Sweets sw3 = new Sweets("Буратино", 7, 20.5, "Леденец");
        Sweets sw4 = new Sweets("Алёнка", 100, 50.35, "Шоколад");
        Toys t1 = new Toys("Басик", 450, 564.10, "Мягкая игрушка");
        Toys t2 = new Toys("От винта", 380, 421.80, "Конструктор");
        Toys t3 = new Toys("Снеговик", 30, 85.00, "Ёлочная игрушка");

        double totalSum = 0;
        int totalWeight = 0;
        System.out.println(" Сформирован школьный подарок: ");

        Present[] schoolGift = {sw1, sw2, sw4, t1};


        for (Present el : schoolGift) {
            System.out.println(el);
            totalSum += el.getPrice();
            totalWeight += el.getWeight();
        }
        System.out.println("Общий вес школьного подарка = " + totalWeight + ", Общая сумма подарка = " + totalSum);
        System.out.println();

        System.out.println(" Сформирован садовский подарок: ");
        double totalSum1 = 0;
        int totalWeight1 = 0;

        Present[] kinderGift = {sw1, sw2, sw3, t2, t3};


        for (Present elem : kinderGift) {
            System.out.println(elem);
            totalSum1 += elem.getPrice();
            totalWeight1 += elem.getWeight();
        }
        System.out.println("Общий вес садовского подарка = " + totalWeight1 + ", Общая сумма подарка = " + totalSum1);
    }
}



