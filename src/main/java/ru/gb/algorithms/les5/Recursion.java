package ru.gb.algorithms.les5;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        raisingNumberRecursion();
        System.out.println(backpackRecursion(recursion.length - 1, MAX_WEIGHT));
    }
    private int weight;
    private int value;
    static final int MAX_WEIGHT = 70;

    public Recursion(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
    public int getWeight() {
        return weight;
    }
    public int getValue() {
        return value;
    }
    static Recursion[] recursion = {
            new Recursion(15, 30),
            new Recursion(30, 90),
            new Recursion(50, 100)
    };

// 1. Написать программу по возведению числа в степень с помощью рекурсии.
    public static int PowA(int x, int n) {
        if (n == 0)
            return 1;
        return PowA(x, n - 1) * x;
    }
    public static void raisingNumberRecursion() {
        System.out.println("Задача №1");
        Scanner sc = new Scanner(System.in);
            System.out.print("x = ");
        int x = sc.nextInt();
            System.out.print("n = ");
        int n = sc.nextInt();
        int pow = PowA(x, n);

            System.out.println("Pow(" + x + ", " + n + ") = " + pow);
        System.out.println("\nЗадача №2");
    }

// 2. Написать программу «Задача о рюкзаке» с помощью рекурсии.
    private static int backpackRecursion(int i, int weight) {
        if (i < 0) {
            return 0;
        }
        if (recursion[i].getWeight() > weight) {
            return backpackRecursion(i - 1, weight);
        }
        else {
            return Math.max(backpackRecursion(i - 1, weight), backpackRecursion(i - 1, weight - recursion[i].getWeight()) + recursion[i].getValue());
        }
    }
}