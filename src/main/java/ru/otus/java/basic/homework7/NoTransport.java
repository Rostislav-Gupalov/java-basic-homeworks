package ru.otus.java.basic.homework7;

public class NoTransport implements Transport {

    private String name = Human.getName();
    private int energy;

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
        return false;
    }

    public NoTransport() {
        this.energy = 30;
    }

    @Override
    public boolean move(int distance, Area area) {
        if (energy >= distance) {
            energy = energy - distance;
            System.out.println(Human.getName() + " прошёл пешком " + distance + " км " + area.getName());
            return true;
        } else System.out.println("Не хватает сил.");
        return false;
    }
}
