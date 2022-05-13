package ru.geekbrains.lessons.les8;

public class Human implements Skills {
    private String name;
    private int distanceRun;
    private int distanceJump;

    public Human(String name, int distanceRun, int distanceJump) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceJump = distanceJump;
    }

    @Override
    public boolean run(int length) {
        return this.distanceRun >= length;
    }

    @Override
    public boolean jump(int height) {
        return this.distanceJump >= height;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
