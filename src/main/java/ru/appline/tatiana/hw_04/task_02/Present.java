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
        Jellybean sw1 = new Jellybean("Кислые червячки", 10, 35.6, "Красный");
        Jellybean sw2 = new Jellybean("Мишки", 20, 47.99, "Зеленый");
        Jellybean sw3 = new Jellybean("Буратино", 7, 20.5, "Жёлтый");
        Jellybean sw4 = new Jellybean("Бонпари", 100, 50.35, "Разноцветный");
        Candy t1 = new Candy("Ириска", 450, 564.10, true);
        Candy t2 = new Candy("Грильяж", 380, 421.80, false);
        Candy t3 = new Candy("Му-Му", 30, 85.00, true);
        Chocolate ch1 = new Chocolate("Альпенголд", 90, 42.6, 60);
        Chocolate ch2 = new Chocolate("Виспа", 100, 75., 70);
        Chocolate ch3 = new Chocolate("Шок", 150, 120.5, 80);

        double totalSum = 0;
        int totalWeight = 0;
        System.out.println(" Сформирован школьный подарок: ");

        Present[] schoolGift = {sw1, t2, ch1, ch3};


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

        Present[] kinderGift = {sw2, sw3, t1, t3, ch2};


        for (Present elem : kinderGift) {
            System.out.println(elem);
            totalSum1 += elem.getPrice();
            totalWeight1 += elem.getWeight();
        }
        System.out.println("Общий вес садовского подарка = " + totalWeight1 + ", Общая сумма подарка = " + totalSum1);
    }
}



