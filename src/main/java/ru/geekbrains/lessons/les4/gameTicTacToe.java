package ru.geekbrains.lessons.les4;

import java.util.Random;
import java.util.Scanner;

public class gameTicTacToe {
/*
1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку.
 */
    public static void main(String[] args) {

        while (true) {
            initialize();
            printField();
            while (true) {
                humanTurn();
                printField();
                if (gameChecks(DOT_HUMAN, "Вы победили"))
                    break;
                aiTurn();
                printField();
                if (gameChecks(DOT_AI, "Победил компьютер!"))
                    break;
            }
            System.out.println("Сыграть еще раз? (Y - да)");
            if (!sc.next().equalsIgnoreCase("Y")) {
                break;
            }
        }
    }

    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = '0';
    static final char DOT_EMPTY = '♣';
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    static char[][] field;
    static int fieldSizeX;
    static int fieldSizeY;

    static void initialize() { // инициализация объектов
        fieldSizeX = 5;
        fieldSizeY = 5;

        field = new char[fieldSizeX][fieldSizeY];
        for (int i = 0; i < fieldSizeX; i++) {
            for (int j = 0; j < fieldSizeY; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }

    static void printField() { // разметка поля
        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            if (i % 2 == 0) {
                System.out.print("-");
            }
            else {
                System.out.printf("%d", i / 2 + 1);
            }
        }
        System.out.println();

        for (int i = 0; i < fieldSizeX; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < fieldSizeY; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        for (int i = 0; i <= fieldSizeX * 2 + 1; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static void humanTurn() {
        int x, y;
        do {
            System.out.println("Ввод координат X и Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (!(isCellValid(x, y) & isCellEmpty(x, y)));
        field[x][y] = DOT_HUMAN;
    }

    static void aiTurn() {
        int x, y;
        do {
            x = rd.nextInt(fieldSizeX);
            y = rd.nextInt(fieldSizeY);
        }
        while (!isCellEmpty(x, y));
        field[x][y] = DOT_AI;
    }

    static boolean isCellEmpty(int x, int y) {
        return  field[x][y] == DOT_EMPTY;
    }

    static boolean isCellValid(int x, int y) {
        return x >= 0 & x < fieldSizeX & y >= 0 & y < fieldSizeY;
    }

    static boolean checkDraw() { // проверка на ничью
        for (int i = 0; i < fieldSizeX; i++) {
            for (int j = 0; j < fieldSizeY; j++) {
                if (isCellEmpty(i, j))
                    return false;
            }
        }
        return false;
    }

//    static boolean checkWin(char c) { // проверка победы
//
//        // по горизонталям
//        if (field[0][0] == c & field[0][1] == c & field[0][2] == c) return true;
//        if (field[1][0] == c & field[1][1] == c & field[1][2] == c) return true;
//        if (field[2][0] == c & field[2][1] == c & field[2][2] == c) return true;
//        // по вертикалям
//        if (field[0][0] == c & field[1][0] == c & field[2][0] == c) return true;
//        if (field[0][1] == c & field[1][1] == c & field[2][1] == c) return true;
//        if (field[0][2] == c & field[1][2] == c & field[2][2] == c) return true;
//        // по диагоналям
//        if (field[0][0] == c & field[1][1] == c & field[2][2] == c) return true;
//        if (field[0][2] == c & field[1][1] == c & field[2][0] == c) return true;
//
//        return false;
//    }

/*
2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
 */
    static boolean checkWin(char dot, int length) { // проверка победы (переделка)
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (checkLine(x, y, 1, 0, length, dot)) // проверка по +х
                    return true;
                if (checkLine(x, y, 1, 1, length, dot)) // проверка по диагонали +х +у
                    return true;
                if (checkLine(x, y, 0, 1, length, dot)) // проверка по +у
                    return true;
                if (checkLine(x, y, 1, -1, length, dot)) // проверка по диагонали +х -у
                    return true;
            }
        }
        return false;
    }

    static boolean checkLine(int x, int y, int incrX, int incrY, int len, char dot) { // проверка линии
        int endXLine = x + (len - 1) * incrX;
        int endYLine = y + (len - 1) * incrY;
        if (!isCellValid(endYLine, endXLine))
            return false;
        for (int i = 0; i < len; i++) {
            if (field[y + i * incrY][x + i * incrX] != dot)
                return false;
        }
        return true;
    }

    static boolean gameChecks(char dot, String s) {
        // проверка победы игрока
        if (checkWin(dot, field.length)) {
            System.out.println(s);
            return true;
        }
        // проверка на ничью
        if (checkDraw()) {
            System.out.println("Ничья!");
            return true;
        }
        return false; // продолжаем игру
    }
}
