package ru.gb.algorithms.les3;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumber {
    /*
    1. Дан массив из n элементов, начиная с 1. Каждый следующий элемент равен (предыдущий + 1). Но в массиве гарантированно 1 число пропущено. Необходимо вывести на экран пропущенное число.
Примеры:
[1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16] => 11
[1, 2, 4, 5, 6] => 3
[] => 1
(дополнительно). 2. Закольцевать очередь, чтобы после извлечения элементов пустые ячейки переиспользовались.
     */
    public static void main(String[] args) {
        misNum(11, new int[] {1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16});
        misNum(3, new int[] {1, 2, 4, 5, 6});
        misNum(1, new int[] {});
    }

    public static void misNum(int mn, int[] arr) {
        int missingCount = mn - arr.length;
        BitSet bitSet = new BitSet(mn);
        for (int number : arr) {
            bitSet.set(number - 1);
        }
        System.out.printf("Массив пропавшего числа %s, пропавшее число %d\n",
                Arrays.toString(arr), mn);
        int lastMisInd = 0;
        for (int i = 0; i < missingCount; i++) {
            lastMisInd = bitSet.nextClearBit(lastMisInd);
            System.out.println(++lastMisInd);
        }
    }
}
