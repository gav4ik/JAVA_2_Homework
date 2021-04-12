package ru.appline.tatiana.hw_04.task_02;

public class Jellybean extends Present{
       private String colour;

        public Jellybean(String name, int weight, Double price){
            super(name, weight, price);
        }

        public Jellybean(String name, int weight, Double price, String colour){
            super(name, weight, price);
            this.colour = colour;
        }

        public String getColour() {
            return colour;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }

        @Override
        public String toString(){
            return "Мармелад: " + super.toString() + ", Цвет: " + colour;
        }
    }

