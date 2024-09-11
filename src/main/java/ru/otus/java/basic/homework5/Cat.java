package ru.otus.java.basic.homework5;

public class Cat extends Animal {

    public Cat (String name, int runSpeed, int swimSpeed, int stamina) {
        super (name, runSpeed, swimSpeed, stamina);
    }

    @Override
    public int swim(int distance) {
        System.out.println(name + " не умеет плавать.");
        return stamina;
    }
}
