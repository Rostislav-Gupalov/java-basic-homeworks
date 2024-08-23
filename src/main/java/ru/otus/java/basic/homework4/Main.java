package ru.otus.java.basic.homework4;

import java.time.Year;

public class Main {

    public static void main(String[] args) {
        User[] users = {
                new User("Иванов", "Иван","Иванович", 1983, "i.ivanov@otus.ru"),
                new User("Петров", "Пётр","Петрович", 1990, "p.petrov@otus.ru"),
                new User("Сидоров", "Сидор", "Сидорович", 1980, "s.sidorov@otus.ru"),
                new User("Алексеев", "Алексей", "Алексеевич", 1991, "a.alexeev@otus.ru"),
                new User("Афанасьев", "Афанасий", "Афанасиевич", 1975, "a.afanasiev@otus.ru"),
                new User("Васильев", "Василий", "Василиьевич", 1992, "v.vasiliev@otus.ru"),
                new User("Кириллов", "Кирилл", "Кириллович", 1974, "k.kirillov@otus.ru"),
                new User("Фролов", "Фрол", "Фролович", 1993, "f.frolov@otus.ru"),
                new User("Борисов", "Борис", "Борисович", 1982, "b.borisov@otus.ru"),
                new User("Николаев", "Николай", "Николаевич", 1995, "n.nikolaev@otus.ru")
        };
        int currentYear = Year.now().getValue();
        for (int i = 0; i < users.length; i++) {
            if ((currentYear - users[i].getBirthYear()) > 40) {
                System.out.print(i + 1 + ". ");
                users[i].info();
            }
        }

        Box box = new Box(10, "Синий", "Открыта", "Пусто" );
        box.setColor("Красный");
        box.openBox();
        box.closeBox();
        box.info();
        box.openBox();
        box.putItem();
        box.takeItem();
    }
}
