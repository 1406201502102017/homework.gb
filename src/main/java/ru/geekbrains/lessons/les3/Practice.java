package ru.geekbrains.lessons.les3;

import java.util.Random;
import java.util.Scanner;

public class Practice {

    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        randomNum(3);
    }
// 1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю даётся 3 попытки угадать это число. При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    public static void randomNum(int n) {
        while (true) {
            System.out.println("Ввод числа в пределах границы от 0 до 9");
            int r = random.nextInt(10);
            boolean playWin = false;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (r == x) {
                    System.out.println("Число угадано\n");
                    playWin = true;
                    break;
                }
                else if (r > x) {
                    System.out.printf("Загаданное число > указанного %d\n", x);
                }
                else {
                    System.out.printf("Загаданное число < указанного %d\n", x);
                }
            }
            if(!playWin)
                System.out.println("Игра окончена");
            System.out.println("Повторить игру еще раз? 1 (да) или 0 (нет)");
            if (!sc.next().equals("1"))
                break;
        }
    }
}
// 2. * Создать массив из слов
//String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
//При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
//apple – загаданное
//apricot - ответ игрока
//ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//Для сравнения двух слов посимвольно можно пользоваться:
//String str = "apple";
//char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//Играем до тех пор, пока игрок не отгадает слово.
//Используем только маленькие буквы.


// Постараюсь решить 2ю задачу к пятнице!!!!!