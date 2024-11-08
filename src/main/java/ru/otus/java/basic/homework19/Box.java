package ru.otus.java.basic.homework19;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.copy;

public class Box<T extends Fruit> {

    private List<T> fruits;
    private double weight;

    public Box() {
        this.fruits = new ArrayList<>();
        weight = 0;
    }

    public void putFruit(T fruit) {
        fruits.add(fruit);
    }

    public double weight() {
        for (T fruit : fruits) this.weight += fruit.getWeight();
        return weight;
    }

    public boolean compare(Box<?> anotherBox) {
        if (this.weight() == anotherBox.weight()) {   //если сравнивать методы, возвращает true, но если сравнить метод и
            // поле weight, возвращает false. Почему так,
            return true;
        }
        else return false;
    }

    public void transfer(Box<? super T> anotherBox) {
        copy(anotherBox.fruits, this.fruits);
        for (T fruit : fruits) fruits.remove(fruit);
    }
}