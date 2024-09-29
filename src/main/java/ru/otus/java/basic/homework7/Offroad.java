package ru.otus.java.basic.homework7;

public class Offroad implements Transport {

    private String name;
    private int fuel;

    @Override
    public String getName() {
        return name;
    }

    public int getEnergy() {
        return 0;
    }

    public int getFuel() {
        return fuel;
    }

    public boolean getIsItBike() {
        return false;
    }

    public Offroad(String name) {
        this.name = name;
        this.fuel = 200;
    }

    @Override
    public boolean move(int distance, Area area) {
        if (fuel >= distance) {
            fuel = fuel - distance;
            System.out.println(Human.getName() + " проехал на вездеходе " + distance + " км " + area.getName());
            return true;
        } else System.out.println("Не хватает топлива.");
        return false;
    }
}
