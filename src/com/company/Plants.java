package com.company;

import static com.company.Animals.DEFAULT_DOG_COST;

public class Plants {
    public String species;
    public Double cost = 1.0;
    public String week;
    public Integer pubertytime = 1;

    static  final Double DEFAULT_RYE_COST = 10.0;
    static  final Double DEFAULT_BARLEY_COST = 15.0;
    static  final Double DEFAULT_WHEAT_COST = 25.0;
    static  final Double DEFAULT_MAIZE_COST = 50.0;

    static  final Double DEFAULT_CARROT_COST = 5.0;
    static  final Double DEFAULT_CUCUMBER_COST = 15.0;
    static  final Double DEFAULT_POTATOES_COST = 25.0;
    static  final Double DEFAULT_LETTUCE_COST = 50.0;
    static  final Double DEFAULT_CHIVE_COST = 65.0;
    static  final Double DEFAULT_BEETROOT_COST = 80.0;

    static  final Double DEFAULT_STRAWBERRIES_COST = 50.0;
    static  final Double DEFAULT_GOOSEBERRY_COST = 120.0;
    static  final Double DEFAULT_RASPBERRIES_COST = 250.0;
    static  final Double DEFAULT_CURRANTS_COST = 400.0;

    static  final  Integer DEFAULT_RYE_PUBERYTIME = 1;
    static  final  Integer DEFAULT_BARLEY_PUBERYTIME = 2;
    static  final  Integer DEFAULT_WHEAT_PUBERYTIME = 4;
    static  final  Integer DEFAULT_MAIZE_PUBERYTIME = 5;

    static  final  Integer DEFAULT_CARROT_PUBERYTIME = 1;
    static  final  Integer DEFAULT_CUCUMBER_PUBERYTIME = 2;
    static  final  Integer DEFAULT_POTATOES_PUBERYTIME = 3;
    static  final  Integer DEFAULT_LETTUCE_PUBERYTIME = 5;
    static  final  Integer DEFAULT_CHIVE_PUBERYTIME = 7;
    static  final  Integer DEFAULT_BEETROOT_PUBERYTIME = 10;

    static  final  Integer DEFAULT_STRAWBERRIES_PUBERYTIME = 8;
    static  final  Integer DEFAULT_GOOSEBERRY_PUBERYTIME = 14;
    static  final  Integer DEFAULT_RASPBERRIES_PUBERYTIME = 21;
    static  final  Integer DEFAULT_CURRANTS_PUBERYTIME = 25;


    public void tillage (String species) {
        this.species = species;
        if (species == "rye") {
            this.cost = DEFAULT_RYE_COST;
        } else if (species == "barley") {
            this.cost = DEFAULT_BARLEY_COST;
        } else if (species == "wheat") {
            this.cost = DEFAULT_WHEAT_COST;
        }else if (species == "maize") {
            this.cost = DEFAULT_MAIZE_COST;
        }
    }

    public void garden_vegetables(String species) {
        this.species = species;
        if (species == "carrot") {
            this.cost = DEFAULT_CARROT_COST;
        } else if (species == "cucumber") {
            this.cost = DEFAULT_CUCUMBER_COST;
        } else if (species == "potatoes") {
            this.cost = DEFAULT_POTATOES_COST;
        }else if (species == "lettuce") {
            this.cost = DEFAULT_LETTUCE_COST;
        }else if (species == "chive") {
            this.cost = DEFAULT_CHIVE_COST;
        }else if (species == "beetroot") {
            this.cost = DEFAULT_BEETROOT_COST;
        }
    }

    public void garden_fruit (String species) {
        this.species = species;
        if (species == "strawberries") {
            this.cost = DEFAULT_STRAWBERRIES_COST;
        } else if (species == "gooseberry") {
            this.cost = DEFAULT_GOOSEBERRY_COST;
        } else if (species == "raspberries") {
            this.cost = DEFAULT_RASPBERRIES_COST;
        }else if (species == "currants") {
            this.cost = DEFAULT_CURRANTS_COST;
        }
    }

    public void tillage (Integer pubertytime) {
        this.week = week;
        if (week == "rye") {
            this.pubertytime = DEFAULT_RYE_PUBERYTIME;
        } else if (week == "barley") {
            this.pubertytime = DEFAULT_BARLEY_PUBERYTIME;
        } else if (week == "wheat") {
            this.pubertytime = DEFAULT_WHEAT_PUBERYTIME;
        }else if (week == "maize") {
            this.pubertytime = DEFAULT_MAIZE_PUBERYTIME;
        }
    }

    public void garden_vegetables(Integer pubertytime) {
        this.week = week;
        if (week == "carrot") {
            this.pubertytime = DEFAULT_CARROT_PUBERYTIME;
        } else if (week == "cucumber") {
            this.pubertytime = DEFAULT_CUCUMBER_PUBERYTIME;
        } else if (week == "potatoes") {
            this.pubertytime = DEFAULT_POTATOES_PUBERYTIME;
        }else if (week == "lettuce") {
            this.pubertytime = DEFAULT_LETTUCE_PUBERYTIME;
        }else if (week == "chive") {
            this.pubertytime = DEFAULT_CHIVE_PUBERYTIME;
        }else if (week == "beetroot") {
            this.pubertytime = DEFAULT_BEETROOT_PUBERYTIME;
        }
    }

    public void garden_fruit (Integer pubertytime) {
        this.week = week;
        if (week == "strawberries") {
            this.pubertytime = DEFAULT_STRAWBERRIES_PUBERYTIME;
        } else if (week == "gooseberry") {
            this.pubertytime = DEFAULT_GOOSEBERRY_PUBERYTIME;
        } else if (week == "raspberries") {
            this.pubertytime = DEFAULT_RASPBERRIES_PUBERYTIME;
        }else if (week == "currants") {
            this.pubertytime = DEFAULT_CURRANTS_PUBERYTIME;
        }
    }

        String[] tillage = new String[]{
                "rye",
                "barley",
                "wheat",
                "maize"
        };

        public void setTillage(String[] tillage){
            this.tillage = tillage;
        }

        public String[] getTillage() {
            return tillage;
        }

        String[] garden_vegetables = new String[]{
                "carrot",
                "cucumber",
                "potatoes",
                "lettuce",
                "chive",
                "beetroot"
        };

        public void setGarden_vegetables(String[] garden_vegetables) {
            this.garden_vegetables = garden_vegetables;
        }

        public String[] getGarden_vegetables() {
            return garden_vegetables;
        }

        String[] garden_fruit = new String[]{
                "strawberries",
                "gooseberry",
                "raspberries",
                "currants",
        };

        public  void setGarden_fruit(String[] garden_fruit) {
            this.garden_fruit = garden_fruit;
        }

        public String[] getGarden_fruit() {
            return garden_fruit;
        }

}
