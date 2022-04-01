package ru.geekbrains.lessons.les8;

public class Wall implements Let {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Skills skills) {
        if (skills.jump(this.height)) {
            System.out.printf("Участник %s перепрыгнул стену %d метров.\n", skills.getName(), height);
            return true;
        }
        else System.out.printf("Участник %s не смог перепрыгнуть стену %d метров.\n", skills.getName(), height);
        return false;
    }
}
