package com.company;

public class Buildings {
        public String name;
        public double price;
        public Integer level;

        public Buildings(String name, double price, Integer level) {
            this.name = name;
            this.price = price;
            this.level= level;
        }


        public String toString() {
            return " name: " + this.name + " price: " + this.price;
             }

        String[] buildings = new String[] {
          "house",
          "hovel",
          "farm",
          "barn",
        };
}
