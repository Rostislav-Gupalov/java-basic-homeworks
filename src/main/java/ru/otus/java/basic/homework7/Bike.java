package ru.otus.java.basic.homework7;

public class Bike implements Transport {

    private String name;
    private int energy;
    private boolean isItBike;


    @Override
    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public int getFuel() {
        return 0;
    }

    public boolean getIsItBike() {
        return isItBike;
    }

    public Bike(String name) {
        this.name = name;
        this.energy = Human.getEnergy();
        this.isItBike = true;
    }

    @Override
    public boolean move(int distance, Area area) {
        if ((area == Area.PLAIN) || (area == Area.FOREST)) {
            if (energy >= distance) {
                energy = energy - distance;
                System.out.println(Human.getName() + " проехал на велосипеде " + distance + " км " + area.getName());
                return true;
            } else System.out.println("Не хватает сил.");
        } else System.out.println("Велосипед не может передвигаться по болоту.");
        return false;
    }
}
