package ru.geekbrains.lessons.les9;
/*
1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
ячейке лежит символ или текст вместо числа), должно быть брошено исключение
MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3 В методе main() вызвать полученный метод, обработать возможные исключения
MyArraySizeException и MyArrayDataException и вывести результат расчета.
*/
public class Main {

        public static void main(String[] args) {
                //ArraySizeData.array(new String[4][4]);
                String[][] arr1 = new String[][] {
                        {"28", "26", "-486", "45"},  // верный массив
                        {"47", "13", "85", "74"},
                        {"23", "-8", "5", "56"},
                        {"741", "26", "46", "63"},
                };
                String[][] arr2 = new String[][] {
                        {"xc", "26", "486", "45"},   // присутствует строка
                        {"47", "13", "85", "74"},
                        {"-23", "8", "5", "56"},
                        {"741", "26", "486", "63"},
                };

                String[][] arr3 = new String[][] {
                        {"147", "26", "486", "45"},
                        {"47", "13", "85", "74"},
                        {"23", "8", "5", "56", "896"}, // 5 ячеек
                        {"741", "26", "-486", "63"},
                };

                try {
                        ArraySizeData.array(arr1);
                } catch (MyArrayDataException | MyArraySizeException t) {
                        t.printStackTrace();
                }

                try {
                        ArraySizeData.array(arr2);
                } catch (MyArrayDataException | MyArraySizeException t) {
                        t.printStackTrace();
                }

                try {
                        ArraySizeData.array(arr3);
                } catch (MyArrayDataException | MyArraySizeException t) {
                        t.printStackTrace();
                }
        }
}
