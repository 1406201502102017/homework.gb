package ru.geekbrains.lessons.les1;

import java.util.Scanner;

public class Methods {
// 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public static void main(String[] args) { // задача 1
        typesVariables(); // задача 2
        System.out.printf("%.2f" + "\n", expressionEvaluation(5.641f, 6.1778f, 4.4178f, 9.778f)); // задача 3
        System.out.println(sumOfNumbers(10, 0)); // задача 4
        positiveOrNegativeNumber(0); // задача 5
        System.out.println(trueOrFalse(4)); // задача 6
        helloName("checking person"); // задача 7
        leapYear(2022); // задача 8
    }

// 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
    public static void typesVariables() {
        byte by = 15;
        short sh = 104;
        int in = 48;
        long lg = 71L;
        float fl = 1.57f;
        double db = 3.14;
        char ch = 105;
        boolean bl = by < sh;
        String str = "Java Core";
    System.out.println(by + "\n" + sh + "\n" + in + "\n" + lg + "\n" + fl + "\n" + db + "\n" + ch + "\n" + bl + "\n" + str);
    }
// 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float expressionEvaluation(float a, float b, float c, float d) {
        float e = a * (b + (c / d));
        return e;
    }
// 4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean sumOfNumbers(int a, int b) {
        int sum = a + b;
        if (sum >= 10 & sum <= 20) {
            return true;
        }
        else {
            return false;
        }
    }
// 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void positiveOrNegativeNumber(int a) {
        if (a >= 0) {
            System.out.println("The number \"a\" is positive");
        }
        else {
            System.out.println("The number \"a\" is negative");
        }
    }
// 6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false, если положительное.
    static boolean trueOrFalse(int a) {
        if (a < 0) {
            return true;
        }
        else {
            return false;
        }
    }
// 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void helloName(String name) {
        System.out.println("Привет, " + name + "!");
    }
// 8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void leapYear(int y) {
        if (y % 4 == 0 | (y % 400 == 0 & y % 100 == 0)) {
            System.out.println("Год " + "<<" + y + ">>" + " является високосным!");
        }
        else {
            System.out.println("Год " + "<<" + y + ">>" + " не является високосным!");
        }
    }
}
