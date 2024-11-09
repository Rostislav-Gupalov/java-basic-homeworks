package ru.otus.java.basic.homework19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static java.util.Collections.addAll;
import static java.util.Collections.copy;

public class Box<T extends Fruit> {

    private List<T> fruits;
    //private double weight;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void putFruit(T fruit) {
        fruits.add(fruit);
    }

    public double weight() {
        double weight = 0;
        for (T fruit : fruits) weight += fruit.getWeight();
        return weight;
    }

    public boolean compare(Box<?> anotherBox) {
        if (Math.abs(this.weight() - anotherBox.weight()) < 0.0001) {
            return true;
        } else return false;
    }

    public void transfer(Box<? super T> anotherBox) {
        if (this != anotherBox) {
            anotherBox.fruits.addAll(fruits);
            this.fruits.clear();
        } else System.out.println("Пересыпать фрукты можно только в другую коробку");
    }
}
