package ru.geekbrains.lessons.les7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
        if (food < 20) System.out.println("Мало еды! Кошка не довольна!"); // "20" условное значение
    }

    public void decreaseFood(int n) {
        if (food >= 0 & food <= 100) food -= n;
        else System.out.println("Неверное значение!");
    }

    public void infoBefore() {
        System.out.println((food >= 0 & food <= 100) ? "В тарелке всего еды: " + food : "Неверное значение!");
    }

    public void infoAfter(String catName, int catAppetite) {
        System.out.println((food >= 0 & food <= 100) & (catAppetite >= 0 & catAppetite <= 100) ? "Кот " + catName + " съел еды: " + catAppetite + "\nВ тарелке осталось еды: " + food : "Неверное значение!");
    }
// 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
    public void addFoodPlate(int x) {
        if (food == 0)
            food += x;
        System.out.println("Если в тарелке нет еды, положить еду в количестве: " + x);
    }
}
