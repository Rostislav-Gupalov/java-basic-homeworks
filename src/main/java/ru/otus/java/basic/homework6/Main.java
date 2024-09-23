package ru.otus.java.basic.homework6;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(30);
        plate.addFood(5);
        System.out.println(plate.takeFood(20));
        plate.addFood(20);
        Cat[] cats = {
                new Cat("Барсик", 10),
                new Cat("Мурзик", 5),
                new Cat("Рыжик", 25)
        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
    }


}
