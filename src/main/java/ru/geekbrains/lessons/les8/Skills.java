package ru.geekbrains.lessons.les8;
/*
1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти
классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в
консоль).
 */
public interface Skills {
    boolean run(int length);
    boolean jump(int height);
    String getName();
}
