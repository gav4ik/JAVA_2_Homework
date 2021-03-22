package ru.appline.tatiana.hw_04.task_02;

public class Sweets extends Present{
       private String type;

        public Sweets(String name, int weight, Double price){
            super(name, weight, price);
        }

        public Sweets(String name, int weight, Double price, String type){
            super(name, weight, price);
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString(){
            return "Сладости: " + super.toString() + ", Тип сладости: " + type;
        }
    }

