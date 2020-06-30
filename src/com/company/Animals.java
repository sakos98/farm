package com.company;

public class Animals {
    public String species;
    public Double cost = 1.0;

    static  final Double DEFAULT_CAT_COST = 50.0;
    static  final Double DEFAULT_HAMSTER_COST = 5.0;
    static  final Double DEFAULT_DOG_COST = 100.0;
    static  final Double DEFAULT_GOLDFISH_COST = 25.0;

    static final  Double DEFAULT_COW_COST = 200.0;
    static final  Double DEFAULT_SHEEP_COST = 150.0;
    static final  Double DEFAULT_HORSE_COST = 500.0;
    static final  Double DEFAULT_PIG_COST = 200.0;
    static final  Double DEFAULT_CHICKEN_COST = 30.0;
    static final  Double DEFAULT_RABBIT_COST = 40.0;




    public void houseAnimals(String species) {
        this.species = species;
        if (species == "cat") {
            this.cost = DEFAULT_CAT_COST;
        } else if (species == "hamster") {
            this.cost = DEFAULT_HAMSTER_COST;
        } else if (species == "dog") {
            this.cost = DEFAULT_DOG_COST;
        }else if (species == "golden_fish") {
                this.cost = DEFAULT_GOLDFISH_COST;
            }
        }

    public void farmAnimal(String species) {
        this.species = species;
        if (species == "cow") {
            this.cost = DEFAULT_COW_COST;
        } else if (species == "sheep") {
            this.cost = DEFAULT_SHEEP_COST;
        } else if (species == "horse") {
            this.cost = DEFAULT_HORSE_COST;
        }else if (species == "pig") {
            this.cost = DEFAULT_PIG_COST;
        }else if (species == "chicken") {
            this.cost = DEFAULT_CHICKEN_COST;
        }else if (species == "rabbit") {
            this.cost = DEFAULT_RABBIT_COST;
        }

    }


    String[] houseAnimals = new String[]{
            "cat",
            "hamster",
            "dog",
            "0golden_fish"
    };

    public void setHouseAnimals(String[] houseAnimals) {
        this.houseAnimals = houseAnimals;
    }

    public String[] getHouseAnimals() {
        return houseAnimals;
    }



    String[] farmAnimal = new String[]{
            "cow",
            "sheep",
            "horse",
            "pig",
            "chicken",
            "rabbit"
    };

    public void setFarmAnimal(String[] farmAnimal) {
        this.farmAnimal = farmAnimal;
    }

    public String[] getFarmAnimal() {
        return farmAnimal;
    }
}
