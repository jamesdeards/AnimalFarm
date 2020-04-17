package com.Farm.animals;

import com.Farm.enums.Colour;
import com.Farm.enums.Size;

public class Sheep extends Animal {

    private final Colour colour;
    private static String phrase = "Baa!";


    private int totalProduce;
    private int totalCollected;


    private int woolIncrease;

    private static final int smallWoolIncrease = 2;
    private static final int mediumWoolIncrease = 3;
    private static final int largeWoolIncrease = 4;

    private static final int smallPrice = 5;
    private static final int mediumPrice = 6;
    private static final int largePrice = 7;

    public Sheep() {
        super();
        Size size = this.getSize();
        if (size == Size.SMALL) {
            this.setPrice(smallPrice);
            this.woolIncrease = smallWoolIncrease;
        } else if (size == Size.MEDIUM) {
            this.setPrice(mediumPrice);
            this.woolIncrease = mediumWoolIncrease;
        } else {
            this.setPrice(largePrice);
            this.woolIncrease = largeWoolIncrease;
        }
        this.colour = Colour.values()[(int) (Math.random() * Colour.values().length)];
        this.totalProduce = 0;
    }

    public Colour getColour() {
        return this.colour;
    }

    public String getPhrase() {
        return phrase;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name = " + this.getName() +
                ", age = " + this.getAge() +
                ", size = " + this.getSize() +
                ", gender = " + this.getGender() +
                ", price = " + this.getPrice() +
                ", wool colour = " + this.colour +
                '}';
    }


    //sheep grows wool
    public boolean produce() {
        this.totalProduce += this.woolIncrease;
        return true;
    }

    //collect wool from the sheep
    public boolean collect() {
        totalCollected = this.totalProduce;
        this.totalProduce = 0;
        return true;
    }


    public int getTotalProduce() {
        return totalProduce;
    }

    public int getTotalCollected() { return totalCollected; }
}

