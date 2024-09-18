package ru.otus.java.basic.homework6;

public class Cat {

    private String name;
    private int appetite;
    private boolean wellFed;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.wellFed = false;
    }

    public void eat(Plate plate) {
        int foodCurrent = plate.getFoodCurrent();
        String name = this.name;
            int appetite = this.appetite;
            if (!this.wellFed) {
                if (foodCurrent >= appetite) {
                    foodCurrent -= appetite;
                    System.out.println(name + " поел. Оставшееся количество еды в тарелке - " + foodCurrent);
                    this.wellFed = true;
                } else {
                    System.out.println("В тарелке недостаточно еды, чтоб накормить " + name + "а");
                }
            } else {
                System.out.println(name + " уже сыт.");
            }
        plate.setFoodCurrent(foodCurrent);
        }
    }
