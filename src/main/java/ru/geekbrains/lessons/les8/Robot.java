package ru.geekbrains.lessons.les8;

public class Robot implements Skills {
    private String name;
    private int distanceRun;
    private int distanceJump;

    public Robot(String name, int distanceRun, int distanceJump) {
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
