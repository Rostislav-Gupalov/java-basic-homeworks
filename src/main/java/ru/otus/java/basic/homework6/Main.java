package ru.otus.java.basic.homework6;

public class Main {

    public static void main(String[] args){
        Plate plate = new Plate(30);
        plate.addFood(5);
        System.out.println(plate.takeFood(20));
        plate.addFood(20);
        Cat[] cats = {
                new Cat("Барсик", 10),
                new Cat("Мурзик", 5),
                new Cat("Рыжик", 25)
        };
        wellFed(cats,plate);
    }

    public static void wellFed(Cat[] cats, Plate plate) {
        int foodCurrent = plate.getFoodCurrent();
        for (int i = 0; i < cats.length; i++) {
            String name = cats[i].getName();
            int appetite = cats[i].getAppetite();
            if (cats[i].getWellFed() == false) {
                if (foodCurrent >= appetite) {
                    foodCurrent -= appetite;
                    System.out.println(name + " поел. Оставшееся количество еды в тарелке - " + foodCurrent);
                    cats[i].setWellFed(true);
                } else {
                    cats[i].setWellFed(false);
                    System.out.println("В тарелке недостаточно еды, чтоб накормить " + name + "а");
                }
            } else {
                System.out.println(name + " уже сыт.");
        }
        }
    }
}
