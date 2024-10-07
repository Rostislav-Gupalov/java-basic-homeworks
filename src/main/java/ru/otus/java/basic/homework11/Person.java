package ru.otus.java.basic.homework11;

public class Person {

    private String name;
    private Position position;
    private Long id;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public Position getPosition() {
        return position;
    }

    public Person(String name, Position position, Long id) {
        this.name = name;
        this.position = position;
        this. id = id;
    }

}
