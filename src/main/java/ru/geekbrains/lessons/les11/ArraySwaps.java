package ru.geekbrains.lessons.les11;

import java.util.ArrayList;
/*
1. Написать метод, который меняет два элемента массива местами (массив может быть любого
ссылочного типа);
2. Написать метод, который преобразует массив в ArrayList;
 */
public class ArraySwaps {

    public static void twoElements(String[] args, int a, int b) {
        String t = args[a];
        args[a] = args[b];
        args[b] = t;
        System.out.println(args[a] + " " + args[b] + " " + t);
    }

    public static <String> ArrayList<String> arrayList(String[] arr) {
        ArrayList<String> method = new ArrayList<String>(arr.length);
        for (String n : arr) {
            method.add(n);
        }
        return method;
    }

    public static void main(String[] args) {
        twoElements(new String[] {"A", "B", "C"}, 0, 0);
        System.out.println(arrayList(new String[] {"XX, ZZ"}));
    }
}
