package ru.otus.java.basic.homework7;

public class Car implements Transport {

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

    public Car(String name) {
        this.name = name;
        this.fuel = 300;
    }

    @Override
    public boolean move(int distance, Area area) {
        if (area == Area.PLAIN) {
            if (fuel >= distance) {
                fuel = fuel - distance;
                System.out.println(Human.getName() + " проехал на машине " + distance + " км " + area.getName());
                return true;
            } else System.out.println("Не хватает топлива.");
        } else System.out.println("Машина не может передвигаться по лесу и болоту.");
        return false;
    }
}

