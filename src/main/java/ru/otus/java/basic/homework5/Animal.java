package ru.otus.java.basic.homework5;

public class Animal {

    String name;
    float runSpeed;
    float swimSpeed;
    int stamina;

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
        while ((stamina > 0) && (distanceLeft > 0)) {
            stamina = stamina - staminaRun;
            runTime = runTime + (1.0f / runSpeed);
            distanceLeft = distanceLeft- 1;
        }
        if (stamina > 0) {
            System.out.println(name + " пробежал(-а) " + distance + " м за " + runTime + " с.");
        } else if (distance == 0) {
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
        while ((stamina > 0) && (distanceLeft > 0)) {
            stamina = stamina - staminaSwim;
            swimTime = swimTime + (1.0f/swimSpeed);
            distanceLeft = distanceLeft- 1;
        } if (stamina > 0) {
            System.out.println(name + " проплыл(-а) " + distance + " м за " + swimTime + " с.");
        } else if (distance == 0) {
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

