package ru.ls.qa.school.core;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("task 1 - done");
        someMethod();
        System.out.println("Hello");
    }

    private static void someMethod() {
        System.out.println("...2");
    }
}