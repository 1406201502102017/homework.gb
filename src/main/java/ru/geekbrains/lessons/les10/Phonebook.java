package ru.geekbrains.lessons.les10;

import java.util.*;

/*
2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
телефонных номеров. В этот телефонный справочник с помощью метода add() можно
добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не
добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с
пользователем через консоль и т.д). Консоль использовать только для вывода результатов проверки
телефонного справочника.
 */
public class Phonebook {
    
    private static HashMap<String, String> hm = new HashMap<>();

    private static void add(String lastName, String phoneNum) {
        hm.put(lastName, phoneNum);
    }

    public static String[] get(String lastName) {
        List<String> vb = new ArrayList<>();
        for (Map.Entry s : hm.entrySet()) {
            if (lastName.equalsIgnoreCase((String)s.getValue())) {
                vb.add((String)s.getKey());
            }
        }
        if (vb.size() == 0) vb.add("В справочнике такой фамилии нет");
        return vb.toArray(new String[0]);
    }

    public static void printPB() {
        for (Map.Entry<String, String> d : hm.entrySet()) {
            System.out.println(d.getKey() + ": " + d.getValue());
        }
    }

    public static void main(String[] args) {

        add("Петров", "78504564645");
        add("Петров", "75121333845");
        add("Сидоров", "7711564645");
        add("Иванов", "80656467645");
        add("Попов", "75610468645");
        add("Макаров", "0546579845");
        add("Пушкин", "784890154565");
        add("Попов", "797905678745");

        printPB();
    }
}
