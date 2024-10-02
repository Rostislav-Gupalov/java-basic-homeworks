package ru.otus.java.basic.homework10;

public class Application {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "+7919765432");
        phoneBook.add("Иванов", "+7812000456");
        phoneBook.find("Иванов");
        System.out.println(phoneBook.containsPhoneNumber("+7919765432"));
    }

}
