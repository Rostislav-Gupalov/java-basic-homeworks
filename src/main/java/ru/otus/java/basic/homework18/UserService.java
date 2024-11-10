package ru.otus.java.basic.homework18;

import java.util.List;

public interface UserService extends AutoCloseable{
    List<User> getAll();
}