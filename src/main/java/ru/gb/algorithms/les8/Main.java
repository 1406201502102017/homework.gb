package ru.gb.algorithms.les8;

public class Main {

    public static void main(String[] args) {

        ChainMethod<Integer, String> map = new ChainMethod<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(12,"12");
        map.put(15,"15");

        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.delete(1));
        System.out.println(map.delete(1));
        System.out.println();
        System.out.println(map);
    }
}
