package ru.geekbrains.lessons.les11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<F extends Fruit> {

    private final List<F> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public Box(List<F> fruit) {
        this.fruits = new ArrayList<>(fruit);
    }

    @SafeVarargs
    public Box(F... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    public void add(F fruit) { // пополнение коробки
        this.fruits.add(fruit);
    }

    public double getWeight() {
        double weight = 0.0;
        for (F fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean equalsBox(Box<F> another) { // сравнение коробок
        return Math.abs(getWeight() - another.getWeight()) < 0.0001;
    }

    public void moveFruits(Box<F> another) { // перемещение фруктов
        if (this == another)
            return;
        another.fruits.addAll(fruits);
        fruits.clear();
    }

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Orange> orangeBox = new Box<>(new Orange(), new Orange(), new Orange());
        System.out.println(appleBox.equalsBox(appleBox));
        System.out.println(orangeBox.getWeight());
    }
}
