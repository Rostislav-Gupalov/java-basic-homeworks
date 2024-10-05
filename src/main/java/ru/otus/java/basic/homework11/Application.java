package ru.otus.java.basic.homework11;

public class Application {
    public static void main(String[] args) {
        Person Ivanov = new Person("Иванов", Position.MANAGER, 1L);
        Person Petrov = new Person("Петров",Position.DRIVER, 2L);
        PersonDataBase pdb = new PersonDataBase();
        pdb.add(Ivanov);
        pdb.add(Petrov);
        pdb.findById(2L);
        System.out.println(pdb.isManager(Ivanov));
        System.out.println(pdb.isManager(Petrov));
        System.out.println(pdb.isEmployee(1L));
        System.out.println(pdb.isEmployee(2L));
    }
}
