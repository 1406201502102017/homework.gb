package ru.geekbrains.lessons.les9;

public class ArraySizeData {

    static final int INDEX = 4;

    public static int array(String[][] arr) {
        if (arr == null) throw new NullPointerException("Получить ноль!");
        if (arr.length != INDEX) {
            throw new MyArraySizeException("Нужен массив размером 4х4!");
        }
        int s = 0;  // расчёт суммы элементов массива
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != INDEX) {
                throw new MyArraySizeException("Нужен массив размером 4х4!");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    s += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException t) {
                    throw new MyArrayDataException(String.format("Ввести числа [%d][%d]", i + 1, j + 1));
                }
            }
        }
        System.out.println("Результат расчёта суммы: " + s);
        return s;
    }
}
