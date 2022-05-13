package ru.geekbrains.lessons.les6;

/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина
препятствия. Результатом выполнения действия будет печать в консоль. (Например,
dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание:
кот не умеет плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.
 */

public class Animals {

    protected String animalName;
    private int distanceRun;
    private int distanceSwim;

    public int getDistanceRun() {
        return distanceRun;
    }

    public void setDistanceRun(int distanceRun) {
        this.distanceRun = distanceRun;
    }

    public int getDistanceSwim() {
        return distanceSwim;
    }

    public void setDistanceSwim(int distanceSwim) {
        this.distanceSwim = distanceSwim;
    }

    Animals(String animalName) {
        this.animalName = animalName;
    }

    void run(int distanceRun) {
        System.out.println("Животное бежит!");
    }

    void swim(int distanceSwim) {
        System.out.println("Животное плывет!");
    }
}



