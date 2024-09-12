package ru.otus.java.basic.homework6;

public class Cat {

    private String name;
    private int appetite;
    private boolean wellFed;


    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getWellFed() {
        return wellFed;
    }

    public void setWellFed(boolean wellFed) {
        this.wellFed = wellFed;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.wellFed = false;
    }



}
