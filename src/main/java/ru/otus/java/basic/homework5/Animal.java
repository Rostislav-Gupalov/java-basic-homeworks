package ru.otus.java.basic.homework5;

public class Animal {

    protected String name;
    protected float runSpeed;
    protected float swimSpeed;
    protected int stamina;

    public Animal(String name, int runSpeed, int swimSpeed, int stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
    }

    public int run(int distance) {
        int staminaRun = 1;
        float runTime = 0.0f;
        int distanceLeft = distance;
        while (stamina > 0 && distanceLeft > 0) {
            stamina -= staminaRun;
            runTime += (1.0f / runSpeed);
            distanceLeft --;
        }
        if (distance ==0 || stamina > 0) {
            System.out.println(name + " пробежал(-а) " + distance + " м за " + runTime + " с.");
        } else {
            runTime = -1;
            System.out.println(name + " пробежал(-а) " + (distance - distanceLeft) + " из " + distance + " м и устал(-а). Время равно " + runTime);
        } return stamina;
    }

    public int swim(int distance) {
        int staminaSwim = 2;
        float swimTime = 0.0f;
        int distanceLeft = distance;
        while (stamina > 0 && distanceLeft > 0) {
            stamina -= staminaSwim;
            swimTime += (1.0f/swimSpeed);
            distanceLeft --;
        }
        if (distance==0 || stamina > 0) {
            System.out.println(name + " проплыл(-а) " + distance + " м за " + swimTime + " с.");
        } else {
            swimTime = -1;
            System.out.println(name + " проплыл(-а) " + (distance - distanceLeft) + " из " + distance + " м и устал(-а). Время равно " + swimTime);
        } return stamina;
    }

    public void info() {
        System.out.println(name + " имеет " + stamina + " единиц выносливости.");
    }
}

