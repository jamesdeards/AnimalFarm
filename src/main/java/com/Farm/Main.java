package com.Farm;

import com.Farm.animals.*;

public class Main {

    public static void main(String[] args) {

        Cow Daisy = new Cow();
        System.out.println(Daisy);
        System.out.println("Milk currently: " + Daisy.getTotalProduce());

        Daisy.produce(); //day 1
        System.out.println("After 1 day: " + Daisy.getTotalProduce());

        System.out.println("Several days:");

        Daisy.produce();
        System.out.println(Daisy.getTotalProduce());
        Daisy.produce();
        System.out.println(Daisy.getTotalProduce());
        Daisy.produce();
        System.out.println(Daisy.getTotalProduce());
        Daisy.produce();
        System.out.println(Daisy.getTotalProduce());
        Daisy.produce();
        System.out.println(Daisy.getTotalProduce());
        Daisy.produce();
        System.out.println(Daisy.getTotalProduce());

        System.out.println("After waiting too long, milk production ceases");

        Daisy.collect();
        System.out.println("Collecting milk. Total collected should be equal to milk capacity");
        System.out.println(Daisy.getTotalProduce() + " in udder");
        System.out.println(Daisy.getTotalCollected() + " collected");




//        Sheep mySheep = new Sheep();
//        System.out.println(mySheep);
//
//        System.out.println("Start: " + mySheep.getTotalProduce()); //begins at 0
//        mySheep.produce(); //day 1
//        System.out.println("After day 1: " + mySheep.getTotalProduce() + " wool on sheep");
//
//        mySheep.produce(); //day 2
//        System.out.println("After day 2: " + mySheep.getTotalProduce() + " wool  on sheep");
//
//        mySheep.collect();
//        System.out.println("After collection: " + mySheep.getTotalProduce() + " on sheep");
//        System.out.println("Wool sheared off: " + mySheep.getTotalCollected());

//
//
//        System.out.println();
//        Chicken newChicken = new Chicken();
//        System.out.println(newChicken);
//
//
//        System.out.println("Start: " + newChicken.getTotalProduce()); //begins at 0
//        newChicken.produce(); //day 1
//        System.out.println("After day 1: " + newChicken.getTotalProduce() + " eggs in nest");
//
//        newChicken.produce(); //day 2
//        newChicken.produce(); //day 3
//        System.out.println("After day 3: " + newChicken.getTotalProduce() + " eggs in nest");
//
//        newChicken.collect();
//        System.out.println("After collection: " + newChicken.getTotalProduce() + " eggs in nest");
//        System.out.println("Eggs in basket: " + newChicken.getTotalCollected());

    }

}




//public class Main extends Player {

//    public Animals randomAnimal() {
//        return Animals.values()[new Random().nextInt(Animals.values().length)];
//    }
//
//    public Player createPlayer() throws PlayerException {
//
//        System.out.println("Welcome to the farm");
//        System.out.println("Please enter your player name");
//
//        Scanner scanner = new Scanner(System.in);
//        String playerName = scanner.next();
//
//        //this.setPlayerName(playerName);
//
//        //return new Player(this.getPlayerName(),(20), randomAnimal(),50);
//        //problem with *this.getPlayerName(), my edit:
//        return new Player(playerName, 20, randomAnimal(), 50);
//    }
//
//    public void gameTime(){
//        long startTime = System.currentTimeMillis();
//    }
//
//    public static void main(String[] args) throws PlayerException {
//
//        Main main = new Main();
//        Player player1 = main.createPlayer();
//
//    }
// }