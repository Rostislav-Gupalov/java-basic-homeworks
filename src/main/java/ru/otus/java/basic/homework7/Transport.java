package ru.otus.java.basic.homework7;

public interface Transport {

    boolean move(int distance, Area area);

    int getEnergy();

    int getFuel();

    String getName();

    boolean getIsItBike();
}
