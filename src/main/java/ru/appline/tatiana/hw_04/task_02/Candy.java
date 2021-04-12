package ru.appline.tatiana.hw_04.task_02;

public class Candy extends Present {
        private Boolean soft;

        public Candy(){}

        public Candy(String name, int weight, Double price, Boolean soft) {
            super(name, weight, price);
            this.soft = soft;
        }

        public Boolean isSoft() {
            return soft;
        }

        public void setSoft(Boolean soft) {
            this.soft = soft;
        }

        @Override
        public String toString(){
            return "Конфета: "+ super.toString() + ", Мягкая: " +( soft?"да":"нет");
        }

    }


