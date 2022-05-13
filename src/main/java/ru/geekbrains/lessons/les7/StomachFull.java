package ru.geekbrains.lessons.les7;

/*
1. Расширить задачу про котов и тарелки с едой.
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
(например, в миске 10 еды, а кот пытается покушать 15-20).
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту
удалось покушать (хватило еды), сытость = true.
4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть
наполовину сыт (это сделано для упрощения логики программы).
 */

public class StomachFull {

    public static void main(String[] args) {
        Cat cat = new Cat("Пушистик", 40);
        String catName = cat.getName();
        int catAppetite = cat.getAppetite();
        Plate plate = new Plate(90);
        plate.infoBefore();
        cat.eat(plate);
        plate.infoAfter(catName, catAppetite);
        System.out.println("Сытость кошки = " + cat.satietyCat(30) + "\n");

        ArrayCats ac = new ArrayCats();
        ac.plateFood();
        System.out.println();

        plate.addFoodPlate(80);
    }
}
