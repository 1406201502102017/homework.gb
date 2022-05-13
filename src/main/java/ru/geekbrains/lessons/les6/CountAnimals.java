package ru.geekbrains.lessons.les6;

public class CountAnimals {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Лохматый");
        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Тузик");
        Dog dog3 = new Dog("Рекс");
        System.out.println("------Кошки------");
        cat1.run(199);
        cat1.swim(0);
        cat2.run(201);
        cat2.swim(2);
        System.out.println("-----Собаки-----");
        dog1.run(501);
        dog1.swim(8);
        dog2.run(450);
        dog2.swim(11);
        dog3.run(500);
        dog3.swim(10);
        System.out.println();
        int sum = Cat.countCat + Dog.countDog;
        System.out.printf("Итого кошек: %d\nИтого собак: %d\nВсего животных: %d", Cat.countCat, Dog.countDog, sum);
        System.out.println();
    }
}
