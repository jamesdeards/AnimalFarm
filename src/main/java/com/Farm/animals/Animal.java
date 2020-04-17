package com.Farm.animals;

import com.Farm.enums.Gender;
import com.Farm.enums.Size;

public abstract class Animal {

    private String name;
    private int age;
    private Size size;
    private Gender gender;
    private int price;
    private static final int maxAge = 11;

    private int totalProduce = 0;
    private int totalCollected = 0;


    public abstract boolean produce();

    public abstract boolean collect();


    public Animal() {
        super();
        this.age = (int) (Math.random() * maxAge);
        this.size = Size.values()[(int) (Math.random() * Size.values().length)];
        this.gender = Gender.values()[(int) (Math.random() * Gender.values().length)];
        if (this.gender == Gender.MALE) {
            this.name = NameGenerator.generateMaleName();
        } else {
            this.name = NameGenerator.generateFemaleName();
        }
    }

    public Animal(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {
        if (age > this.age) {
            this.age = age;
        }
        return true;
    }

    public Size getSize() {
        return size;
    }


    //You can only set the animal size to make it larger
    public boolean setSize(Size size) {
        Size currentSize = this.getSize();
        if (currentSize == Size.SMALL && (size == Size.MEDIUM || size == Size.LARGE) ||
                currentSize == Size.MEDIUM && size == Size.LARGE) {
            this.size = size;
            return true;
        }
        return false;
    }

    public Gender getGender() { return gender; }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

    public int GetPrice() { return this.price; }

    public int getTotalProduce() { return totalProduce; }

    public int getTotalCollected() { return totalCollected; }

    @Override
    public String toString() {
        return "Animal{" +
                "name = " + this.name +
                ", age = " + this.age +
                ", size = " + this.size +
                ", gender = " + this.gender +
                ", price = " + this.price +
                '}';
    }





}

