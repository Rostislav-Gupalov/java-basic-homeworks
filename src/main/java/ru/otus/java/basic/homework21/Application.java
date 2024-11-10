package ru.otus.java.basic.homework21;

public class Application {

    private final Object mon = new Object(); // Монитор для синхронизации

    private static Letter letter = new Letter();

    public static void main(String[] args) {
        Application application = new Application();
        new Thread(() -> application.printA()).start();
        new Thread(() -> application.printB()).start();
        new Thread(() -> application.printC()).start();
    }

    public void printA() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (letter.getLetter().equals("B") || letter.getLetter().equals("C")) {
                        mon.wait();
                    }
                    System.out.print(letter.getLetter());
                    letter.setLetter("B");
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (letter.getLetter().equals("A") || letter.getLetter().equals("C")) {
                        mon.wait();
                    }
                    System.out.print(letter.getLetter());
                    letter.setLetter("C");
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printC() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (letter.getLetter().equals("A") || letter.getLetter().equals("B")) {
                        mon.wait();
                    }
                    System.out.print(letter.getLetter());
                    letter.setLetter("A");
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class Letter {

        private String letter = "A";

        public String getLetter() {
            return letter;
        }

        public void setLetter(String letter) {
            this.letter = letter;
        }
    }
}

