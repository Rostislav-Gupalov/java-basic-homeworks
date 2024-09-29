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
        if (!this.wellFed) {
            if (plate.getFoodCurrent() >= appetite) {
                plate.takeFood(appetite);
                System.out.println(name + " поел. Оставшееся количество еды в тарелке - " + plate.getFoodCurrent());
                this.wellFed = true;
            } else {
                System.out.println("В тарелке недостаточно еды, чтоб накормить " + name + "а");
            }
        } else {
            System.out.println(name + " уже сыт.");
        }
    }
}
