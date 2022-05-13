package ru.geekbrains.lessons.les14.homeWork;

import java.util.Arrays;

/*
2. Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной
четверки или единицы, то метод вернет false; Написать набор тестов для этого метода (по 3-4
варианта входных данных).
[ 1 1 1 4 4 1 4 4 ] -> true
[ 1 1 1 1 1 1 ] -> false
[ 4 4 4 4 ] -> false
[ 1 4 4 1 1 4 3 ] -> false or true?
 */
public class ArrayProcessing {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sliceArray(new int[]{1, 2, 4, 2, 5, 8, 8, 6, 7, 5})));
        System.out.println(Arrays.toString(sliceArray(new int[]{1, 2, 4, 2, 5, 8, 8, 6, 7, 4})));
        System.out.println(hasOneAndFour(new int[] {1,1,1,1,4,4,4,4,1,4,4}));
        System.out.println(hasOneAndFour(new int[] {1,1,1,1}));
        System.out.println(hasOneAndFour(new int[] {4,4,4,4}));
        System.out.println(hasOneAndFour(new int[] {1,1,1,1,4,4,3,4,4,1,4,4}));
    }

    public static int[] sliceArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4)
                return Arrays.copyOfRange(arr, i + 1, arr.length);
        }
        throw new RuntimeException("4 not found");
    }

    public static boolean hasOneAndFour(int[] arr) {
        boolean has1 = false;
        boolean has4 = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                has1 = true;
            else if(arr[i] == 4)
                has4 = true;
            else
                return false;
        }
        return has1 && has4;
    }
}
