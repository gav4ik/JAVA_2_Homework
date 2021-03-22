package ru.appline.tatiana.hw_04.task_02;

public class Toys extends Present {
        private String type;

        public Toys(){}

        public Toys(String name, int weight, Double price, String type) {
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
            return "Игрушка: "+ super.toString() + ", Тип: " + type;
        }

    }


