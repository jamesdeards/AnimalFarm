package com.Farm.animals;

import com.Farm.enums.Gender;
import com.Farm.enums.Size;

public class Chicken extends Animal {
    private static String phrase = "Cluck cluck";


    //large female chickens lay more eggs per turn. male chickens lay no eggs.
    private int eggLayingRate;
    private int totalProduce;
    private int totalCollected;

    private static final int smallEggRate = 1;
    private static final int mediumEggRate = 2;
    private static final int largeEggRate = 3;


    public Chicken() {
        super();
        this.eggLayingRate = 0;
        if (this.getGender() == Gender.MALE) {
            this.eggLayingRate = 0;
        } else if (this.getSize() == Size.SMALL) {
            this.eggLayingRate = smallEggRate;
        } else if (this.getSize() == Size.MEDIUM) {
            this.eggLayingRate = mediumEggRate;
        } else {
            this.eggLayingRate = largeEggRate;
        }
    }


    //chicken lays eggs
    public boolean produce() {
        if (this.getGender() == Gender.FEMALE) {
            this.totalProduce += this.eggLayingRate;
        }
        return true;
    }

    //collect eggs from chicken
    public boolean collect() {
        this.totalCollected = this.totalProduce;
        this.totalProduce = 0;
        return true;
    }

    public int getEggLayingRate() { return eggLayingRate;
    }
    public int getTotalProduce() {
        return totalProduce;
    }

    public int getTotalCollected() { return totalCollected; }



    @Override
    public String toString() {
        return "Chicken{" +
                "name = " + this.getName() +
                ", age = " + this.getAge() +
                ", size = " + this.getSize() +
                ", gender = " + this.getGender() +
                ", price = " + this.getPrice() +
                ", eggs per day = " + this.getEggLayingRate() +
                '}';
    }


}
