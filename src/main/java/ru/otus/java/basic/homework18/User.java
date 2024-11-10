package ru.otus.java.basic.homework18;


public class User {
    int id;
    private String login;
    private String password;
    private String username;
    private String role;

    public User(int id, String login, String password, String username, String role) {
        this.id = id;
        this.password = password;
        this.login = login;
        this.username = username;
        this.role = role;
    }


    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

}