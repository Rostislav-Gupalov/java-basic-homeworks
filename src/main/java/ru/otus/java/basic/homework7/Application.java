package ru.otus.java.basic.homework7;

public class Application {

    public static void main(String[] args) {
        Human human = new Human("Ростислав");
        human.move(20, Area.FOREST);
        human.move(20, Area.SWAMP);
        human.get(new Bike("Stels"));
        human.get(new Car("Лада"));
        human.leave();
        human.leave();
        human.get(new Bike("Forward"));
        human.move(5, Area.FOREST);
        human.move(5, Area.SWAMP);
        human.leave();
        Offroad offroad1 = new Offroad("Буран");
        human.get(offroad1);
        human.move(200, Area.FOREST);
        human.move(50, Area.SWAMP);
        human.leave();
        human.get(offroad1);
        human.move(50, Area.PLAIN);
        human.leave();
        Offroad offroad2 = new Offroad("Гусеница");
        human.get(offroad2);
        human.move(50, Area.FOREST);
        System.out.println(offroad2.getFuel());
        human.leave();
        Car car1 = new Car("Лада");
        human.get(car1);
        human.move(250, Area.PLAIN);
        human.leave();
        Horse horse1 = new Horse("Сивка-Бурка");
        human.get(horse1);
        human.move(40, Area.SWAMP);
        human.move(120, Area.FOREST);
    }
}
