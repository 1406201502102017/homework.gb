package ru.geekbrains.lessons.les10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/*
1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.
 */
public class ArrayWords {

    public static void main(String[] args) {

        String[] arr = new String[]
                        {"Finland", "Sweden", "Norway", "UK", "Russia",
                        "Germany", "Japan", "China", "USA", "Sweden",
                        "Poland", "UK", "Russia", "Canada", "Korea",
                        "Japan", "Brazil", "France", "Spain", "Germany"};

        Set<String> dm = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(dm);

        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }
        System.out.println(hm);
    }
}


