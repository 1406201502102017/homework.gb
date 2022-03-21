package ru.geekbrains.lessons.les6;

public class Dog extends Animals {

    static int countDog;

    Dog(String animalName) {
        super(animalName);
    }

    @Override
    void run(int distanceRun) {
        countDog++;
        if (distanceRun > 0 & distanceRun <= 500)
            System.out.println("Пёс " + animalName + " пробежал " + distanceRun + " м.");
        else System.out.println("Неверное значение!");
    }

    @Override
    void swim(int distanceSwim) {
        if (distanceSwim > 0 & distanceSwim <= 10)
            System.out.println("Пёс " + animalName + " проплыл " + distanceSwim + " м.");
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
