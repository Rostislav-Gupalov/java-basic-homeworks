package ru.otus.java.basic.homework5;

public class Main {

    public static void main(String[] args){
        Cat cat = new Cat("Барсик", 10, 0, 30);
        Dog dog = new Dog("Шарик", 5, 6, 40);
        Horse horse = new Horse("Вихрь", 15, 3, 50);
        cat.info();
        cat.run(20);
        cat.swim(20);
        cat.info();
        cat.run(20);
        cat.info();
        dog.info();
        dog.run(25);
        dog.info();
        dog.swim(6);
        dog.info();
        dog.run(5);
        dog.info();
        horse.info();
        horse.run(30);
        horse.info();
        horse.swim(3);
        horse.info();
        horse.swim(4);
    }
}
