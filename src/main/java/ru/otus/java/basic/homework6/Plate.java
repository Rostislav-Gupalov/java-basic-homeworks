package ru.otus.java.basic.homework6;

public class Plate {

    private int foodMax;
    private int foodCurrent;


    public int getFoodCurrent() {
        return foodCurrent;
    }

    public Plate(int foodMax) {
        this.foodMax = foodMax;
        this.foodCurrent = foodMax;
    }

    public void addFood(int food) {
        foodCurrent += food;
        if (foodCurrent > foodMax) {
            foodCurrent = foodMax;
        }
        System.out.println("Количество еды в тарелке - " + foodCurrent);
    }

    public boolean takeFood(int food) {
        foodCurrent -= food;
        if (foodCurrent >= 0) {
            System.out.println("Взято еды - " + food + ". Количество оставшейся еды в тарелке - " + foodCurrent);
            return true;
        } else {
            foodCurrent = 0;
            System.out.println("Количество оставшейся еды в тарелке - " + foodCurrent);
            return false;
        }
    }
}
