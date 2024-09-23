package ru.otus.java.basic.homework7;

public class Horse implements Transport {

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

    public Horse(String name) {
        this.name = name;
        this.fuel = 150;
    }

    @Override
    public boolean move(int distance, Area area) {
        if ((area == Area.PLAIN) || (area == Area.FOREST)) {
            if (fuel >= distance) {
                fuel = fuel - distance;
                System.out.println(Human.getName() + " проехал на лошади " + distance + " км " + area.getName());
                return true;
            } else System.out.println("Не хватает сил.");
        } else System.out.println("Лошадь не может передвигаться по болоту.");
        return false;
    }
}
