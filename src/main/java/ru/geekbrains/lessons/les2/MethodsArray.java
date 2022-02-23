package ru.geekbrains.lessons.les2;

import java.util.Arrays;

public class MethodsArray {
    public static void main(String[] args) {
        zeroAndOne(); // задача №1
        arrayEight(8, 3); // задача №2
        arrayMultiplySix(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}); // задача №3
        diagonalElement(10, 10); // задача №4
        minMaxElement(); // задача №5
        System.out.println(checkBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1})); // задача №6
    }

    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void zeroAndOne() {
        int[] arr = {0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            //System.out.print(arr[i] + " ");
        }
        System.out.print(Arrays.toString(arr) + "\n" + "Всего элементов: " + arr.length + "\n");
    }

    // 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void arrayEight(int n, int x) {
        System.out.println();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * x;
            System.out.print(arr[i] + " ");
        }
    }

    // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void arrayMultiplySix(int[] arr) {
        System.out.println("\n");
        //int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void diagonalElement(int x, int y) {
        System.out.println("\n");
        int[][] arr = new int[x][y];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j | i + j == arr.length - 1) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 5. ** Задать одномерный массив и найти в нём минимальный и максимальный элементы (без помощи интернета);
    public static void minMaxElement() {
        System.out.println();
        int[] arr = {10, 148, 5, 9, 7, 23, 4, 8, 61, -45};
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.printf("Min element: %d, " + "Max element: %d\n", min, max);
    }

    // 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
    static boolean checkBalance(int[] arr) {
        System.out.println();
        int sumArr = 0;
        int sum = 0;
        for (int j : arr) {
            sumArr += j;
        }
        for (int i = 0; i < arr.length - 1 & sum < sumArr - sum; i++) {
            sum += arr[i];
        }
        return sum == sumArr - sum;
    }

// 7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.

}
