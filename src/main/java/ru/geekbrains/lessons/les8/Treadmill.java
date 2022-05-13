package ru.geekbrains.lessons.les8;

public class Treadmill implements Let {
    private final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Skills skills) {
        if (skills.run(this.length)) {
            System.out.printf("Участник %s пробежал по дорожке %d метров.\n", skills.getName(), length);
            return true;
        }
        else System.out.printf("Участник %s не смог пробежать по дорожке %d метров.\n", skills.getName(), length);
        return false;
    }
}
