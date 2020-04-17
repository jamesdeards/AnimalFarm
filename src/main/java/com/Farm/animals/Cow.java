package com.Farm.animals;

import com.Farm.enums.Gender;
import com.Farm.enums.Size;

public class Cow extends Animal {

    private int totalProduce;
    private int totalCollected;


    private int milkIncrease;


    private int milkCapacity;

    private int smallMilkIncrease = 2;
    private int mediumMilkIncrease = 3;
    private int largeMilkIncrease = 4;

    private int smallMilkCapacity = 5;
    private int mediumMilkCapacity = 10;
    private int largeMilkCapacity = 15;


    private static String phrase = "Moo!";

    public Cow() {
        super();
        Size size = this.getSize();
        if (this.getGender() == Gender.MALE) {
            this.milkCapacity = 0;
            this.milkIncrease = 0;
        }
        else if (size == Size.SMALL) {
            this.milkIncrease = smallMilkIncrease;
            this.milkCapacity = smallMilkCapacity;
        }
        else if (size == Size.MEDIUM) {
            this.milkIncrease = mediumMilkIncrease;
            this.milkCapacity = mediumMilkCapacity;
        }
        else {
            this.milkIncrease = largeMilkIncrease;
            this.milkCapacity = largeMilkCapacity;
        }
    }


    public boolean produce() {
        if (this.getGender() == Gender.FEMALE && this.totalProduce < this.milkCapacity) {
            this.totalProduce += this.milkIncrease;
            this.totalProduce = Math.min(this.totalProduce, this.milkCapacity);
        }
        return true;
    }

    public boolean collect() {
        if (this.getGender() == Gender.FEMALE && this.totalProduce > 0) {
            totalCollected = totalProduce;
            totalProduce = 0;
        }
        return true;
    }

    public int getTotalProduce() { return totalProduce; }

    public int getTotalCollected() { return totalCollected; }

    public int getMilkCapacity() { return milkCapacity; }

    public int getMilkIncrease() { return milkIncrease; }

    @Override
    public String toString() {
        return "Cow{" +
                "name = " + this.getName() +
                ", age = " + this.getAge() +
                ", size = " + this.getSize() +
                ", gender = " + this.getGender() +
                ", price = " + this.getPrice() +
                ", milk capacity = " + this.getMilkCapacity() +
                ", milk production rate = " + this.getMilkIncrease() +
                '}';
    }
}

