package ru.geekbrains.lessons.les7;
/*
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
 */
public class ArrayCats {

    public void plateFood() {
        Cat[] cats = new Cat[3];
            cats[0] = new Cat("Мурзик", 10);
            cats[1] = new Cat("Барсик", 35);
            cats[2] = new Cat("Том", 10);

        Plate plate = new Plate(100);

        for (Cat j : cats) {
            j.eat(plate);
            System.out.println(j);
        }
    }
}
