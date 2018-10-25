package by.epam.training.kimbar.controller;

import by.epam.training.kimbar.model.Task1;
import by.epam.training.kimbar.model.Task2;

public class Main {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1.headsOrTails(20));
        System.out.println(task1.headsOrTails(20));


        System.out.println();
        Task2 task2 = new Task2();
        System.out.println(task2.maxNumber(8749));
        System.out.println(task2.isPalendrome(14));
        System.out.println(task2.isSimple(7));
        System.out.println(task2.getCountDifNumber(222));


    }
}
