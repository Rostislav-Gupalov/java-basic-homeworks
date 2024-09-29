package ru.otus.java.basic.homework7;

public enum Area {
    FOREST("по лесу"), PLAIN("по равнине"), SWAMP("по болоту");

    private String name;

    public String getName() {
        return name;
    }

    Area(String name) {
        this.name = name;
    }
}
