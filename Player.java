package com.Farm;

import com.Farm.animals.Animal;

public class Player {

    private String name;
    private int gold;

    private Farm farm;

    public Player(String name){
        this.name = name;
        this.gold = 10;
        this.farm = new Farm();
    }

    public String getName() {
        return name;
    }

    public int getGold() {
        return gold;
    }

    public Farm getFarm() {
        return farm;
    }

    public void buyAnimal(Animal animal) {
        if (this.gold >= animal.getPrice()) {
            this.gold -= animal.getPrice();
            farm.addAnimal(animal);
        } else {
            System.out.println("Cannot Afford Item!");
        }
    }

    public void sellAnimal(Animal animal) {
        this.gold += animal.getPrice();
        farm.removeAnimal(animal);
        }
    }

