package ru.geekbrains.lessons.les7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety; // сытость

//    public Cat(String name, int appetite, int satiety) {
//        this.name = name;
//        this.appetite = appetite;
//        this.satiety = satiety;
//    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public Cat() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void eat(Plate p) {
            p.decreaseFood(appetite);
    }

    public boolean satietyCat(int food) {
        System.out.println("Кошка довольна, если в тарелке еды больше 20%"); // "20" условное значение
        if (food >= 20) return satiety = true;
        else return satiety = false;
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name = '" + name + '\'' +
                ", appetite = " + appetite +
                ", satiety = " + satiety +
                '}';
    }
}
