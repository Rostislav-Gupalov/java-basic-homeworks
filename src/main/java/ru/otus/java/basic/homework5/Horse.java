package ru.otus.java.basic.homework5;

public class Horse extends Animal {
    public Horse(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, swimSpeed, stamina);
    }

    @Override
    public int swim(int distance) {
        int staminaSwim = 4;
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
}
