package ru.geekbrains.lessons.les6;

public class Cat extends Animals {

    static int countCat;

    Cat(String animalName) {
        super(animalName);
    }

    @Override
    void run(int distanceRun) {
        countCat++;
        if (distanceRun > 0 & distanceRun <= 200)
            System.out.println("Кот " + animalName + " пробежал " + distanceRun + " м.");
        else System.out.println("Неверное значение!");
    }

    @Override
    void swim(int distanceSwim) {
        if (distanceSwim > 0) System.out.println("Кот " + animalName + " не умеет плавать!");
        else System.out.println("Неверное значение!");
    }

    @Override
    public void setDistanceRun(int distanceRun) {
        super.setDistanceRun(distanceRun);
    }

    @Override
    public int getDistanceRun() {
        return super.getDistanceRun();
    }

    @Override
    public void setDistanceSwim(int distanceSwim) {
        super.setDistanceSwim(distanceSwim);
    }

    @Override
    public int getDistanceSwim() {
        return super.getDistanceSwim();
    }
}
