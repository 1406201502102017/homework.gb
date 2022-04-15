package ru.geekbrains.lessons.les12;

import java.util.Arrays;

public class TwoMethods {

    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        float[] data_1 = fillArrayWithOnes();
        fixTime(() -> runArrayMethod(data_1), "\"runArrayMethod\"");

        float[] data_2 = fillArrayWithOnes();
        fixTime(() -> splitGluingArray(data_2), "\"splitGluingArray\"");

        System.out.println("\nСравнение массивов: " + Arrays.equals(data_1, data_2));
    }
   // 1) Создают одномерный длинный массив
   // 2) Заполняют этот массив единицами
    public static float[] fillArrayWithOnes() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }
        return arr;
    }
    // 4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле
    public static float newValueByFormula(int i, float b) {
        return (float)(b * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
    }
    // Первый метод: просто бежит по массиву и вычисляет значения
    private static void runArrayMethod(float[] data, int set) {
        for (int i = 0; i < data.length; i++) {
            float vel = data[i];
            data[i] = newValueByFormula(i + set, vel);
        }
        //System.out.println(Arrays.toString(data));
    }

    private static void runArrayMethod(float[] data) {
        runArrayMethod(data, 0);
    }

// Второй метод: разбивает массив на два массива, в двух потоках высчитывает новые значения и
// потом склеивает эти массивы обратно в один
    private static void splitGluingArray(float[] data) {
        float[] vol_1 = Arrays.copyOfRange(data, 0, HALF);
        float[] vol_2 = Arrays.copyOfRange(data, HALF, data.length);

        Thread thread_1 = new Thread(() -> runArrayMethod(vol_1, 0));
        Thread thread_2 = new Thread(() -> runArrayMethod(vol_2, 0));

        thread_1.start();
        thread_2.start();

        try {
            thread_1.join();
            thread_2.join();
        } catch (InterruptedException t) {
            System.out.println("Произошло прерывание!");
            t.printStackTrace();
            return;
        }

        System.arraycopy(vol_1, 0, data,0, HALF);
        System.arraycopy(vol_2, 0, data, HALF, HALF);
    }
    // 3) Засекают время выполнения
    // 5) Проверяется время окончания метода System.currentTimeMillis().
    // 6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a)
    private static void fixTime(Runnable time, String timeName) {
        long start = System.currentTimeMillis();
        time.run();
        long finish = System.currentTimeMillis();
        long difference = finish - start;
        System.out.printf("\nМетод %s показывает время разбивки: %d мс", timeName, difference);
    }
}
