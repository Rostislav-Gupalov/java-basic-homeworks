package ru.otus.java.basic.homework19;

public class Application {

    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Apple apple = new Apple(5.0);
        Orange orange = new Orange(5.0);

        appleBox.putFruit(apple);
        orangeBox.putFruit(orange);
        fruitBox.putFruit(apple);
        fruitBox.putFruit(orange);
        appleBox.putFruit(apple);

        System.out.println(fruitBox.weight());
        System.out.println(appleBox.weight());

        System.out.println(appleBox.compare(fruitBox));

        /*fruitBox.transfer(appleBox); // Метод PECS не позволяет пересыпать из fruitBox в appleBox и orangeBox
        fruitBox.transfer(orangeBox);*/  // , т.к. dest подразумевает <? super Fruit>
        fruitBox.transfer(fruitBox);
        fruitBox.transfer(fruitBox);
        appleBox.transfer(appleBox);
        appleBox.transfer(fruitBox);
        orangeBox.transfer(orangeBox);
        orangeBox.transfer(fruitBox);
    }
}
