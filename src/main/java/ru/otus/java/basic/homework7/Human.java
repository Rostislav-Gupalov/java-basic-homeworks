package ru.otus.java.basic.homework7;

public class Human {

    private static String name;
    private Transport currentTransport;
    private boolean isTransportUsed;
    private static int energy;

    public static String getName() {
        return name;
    }

    public static int getEnergy() {
        return energy;
    }

    public Human(String name) {
        this.name = name;
        this.currentTransport = new NoTransport();
        this.isTransportUsed = false;
        this.energy = currentTransport.getEnergy();
    }

    public void get(Transport transport) {
        if (!isTransportUsed) {
            currentTransport = transport;
            System.out.println(name + " взял " + currentTransport.getName());
            isTransportUsed = true;
        } else
            System.out.println("Невозможно выполнить команду. " + name + " сейчас использует " + currentTransport.getName());
    }

    public void leave() {
        if (isTransportUsed) {
            currentTransport = new NoTransport();
            System.out.println(name + " оставил транспорт.");
            isTransportUsed = false;
        } else System.out.println("Невозможно выполнить команду. " + name + " сейчас не использует транспорт.");
    }

    public void move(int distance, Area area) {
        currentTransport.move(distance, area);
        if ((!isTransportUsed) || (currentTransport.getIsItBike())) {
            energy = currentTransport.getEnergy();
        }
    }
}
