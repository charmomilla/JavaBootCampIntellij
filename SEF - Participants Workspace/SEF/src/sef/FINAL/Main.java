package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("What is your age?");
        int age = scanner.nextInt();

        Person p = new Person(name, age);
        System.out.println(p.introduce());
    }

    private static void task2() {
        String name = "Anna";
        Person p = new Person(name, 27);
        Employee em = new Employee("Accenture bootcamp");
        System.out.println(em.introduce(p));
    }

    private static void task3() {
        String name = "Anna";
        Person p = new Person(name, 27);
        Student Student= new Student();
        System.out.println(.introduce(Student));

    }
    // Good afternoon Hafiz! =) Completing the final tasks turned out to be too difficult for me,
    // because I am learning programming from scratch. I've spent many hours writing this and it seems like I'm getting depressed.
    // I seem to have grasped the essence of objects and classes, but many of the nuances of the syntax are still a mystery to me.
    // Thanks for your lectures, I will continue to study Java. The world of programming has struck my imagination =)
}
