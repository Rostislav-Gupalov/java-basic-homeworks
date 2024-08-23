package ru.otus.java.basic.homework4;

import java.util.Objects;

public class Box {

    private final int size;
    private String color;
    private String status;
    private String item;

    public void setColor(String color) {
        this.color = color;
        System.out.println("Коробка окрашена в " + color + " цвет");
    }

    public Box(int size, String color, String status, String item) {
        this.size = size;
        this.color = color;
        this.status = status;
        this.item = item;
    }

    public void openBox() {
        if (Objects.equals(this.status, "Закрыта")) {
            this.status = "Открыта";
            System.out.println("Коробка открылась");
        } else System.out.println("Коробка уже открыта");
    }

    public void closeBox() {
        if (Objects.equals(this.status, "Открыта")) {
            this.status = "Закрыта";
            System.out.println("Коробка закрылась");
        } else System.out.println("Коробка уже закрыта");
    }

    public void info() {
        System.out.println("Информация о коробке:\nРазмер: " + this.size + "\nЦвет: " + this.color);
        System.out.println(this.status);
        System.out.println(this.item);
    }

    public void putItem() {
        if (Objects.equals(this.status, "Открыта")) {
            if (Objects.equals(this.item, "Пусто")) {
                this.item = "Не пусто";
                System.out.println("Предмет помещён в коробку");
            } else System.out.println("Предмет поместить невозможно - коробка заполнена.");
        }
            else System.out.println("Коробка закрыта");
        }

    public void takeItem() {
        if (Objects.equals(this.status, "Открыта")) {
            if (Objects.equals(this.item, "Не пусто")) {
                this.item = "Пусто";
                System.out.println("Предмет извлечён из коробки");
            } else System.out.println("Предмет извлечь невозможно - коробка пуста");
        }
            else System.out.println("Коробка закрыта");
            }
        }




