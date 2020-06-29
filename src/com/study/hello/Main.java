package com.study.hello;


public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    private void start() {
        String last = "Z";
        Container container = new Container();
        container.setInitial("C");
        another(container, last);
        System.out.println(container.getInitial());
    }

    private void another(Container initialHolder, String newInitial) {
        newInitial.toLowerCase();
        initialHolder.setInitial("B");
        Container container2 = new Container();
        initialHolder = container2;
        System.out.println(initialHolder.getInitial());
        System.out.println(newInitial);
    }
}
