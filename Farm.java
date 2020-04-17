package com.Farm;

import com.Farm.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {

   private List<Animal> animals = new ArrayList<>();

    public Animal addAnimal(Animal animal){
        animals.add(animal);
        return null;
    }

    public void removeAnimal(Animal animal) {
        for (Animal value : animals) {
            if (value.equals(animal)) {
                animals.remove(animal);
                break;
            }
        }
    }

    @Override
    public String toString(){
        return animals.toString();
    }
}
