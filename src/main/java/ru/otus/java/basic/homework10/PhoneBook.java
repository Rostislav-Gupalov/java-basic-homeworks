package ru.otus.java.basic.homework10;

import java.util.*;

public class PhoneBook {

    private Map<String, List<String>> phoneBook = new HashMap<>();
    private Set<String> numbers = new HashSet<>();

    public void add(String name, String number) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(number);
        } else phoneBook.put(name, new ArrayList<>(Arrays.asList(number)));
        numbers.add(number);
    }

    public void find(String name) {
        System.out.println(phoneBook.get(name));
    }

    public boolean containsPhoneNumber(String number) {
        return (numbers.contains(number));
    }
}
