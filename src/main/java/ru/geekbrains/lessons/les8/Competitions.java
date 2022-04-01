package ru.geekbrains.lessons.les8;
/*
3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
этот набор препятствий.
4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения
на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он
препятствий не идет.
 */
public class Competitions {
    public static void main(String[] args) {

        System.out.println("     -----Соревнования-----\n");

        Skills[] dt = new Skills[6];
        Let[] ls = new Let[6];

        dt[0] = new Human("Pitt", 10, 12);
        dt[1] = new Cat("Fred", 25, 2);
        dt[2] = new Robot("RX350h",500, 20);
        dt[3] = new Cat("Tom", 55, 5);
        dt[4] = new Human("Frank", 120, 5);
        dt[5] = new Robot("T-1000", 1020, 8);

        ls[0] = new Wall(5);
        ls[1] = new Treadmill(100);
        ls[2] = new Wall(10);
        ls[3] = new Treadmill(1000);
        ls[4] = new Wall(50);
        ls[5] = new Treadmill(10000);

        for(Skills s : dt) {
            for (Let l : ls) {
                if (!l.overcome(s))
                    break;
            }
        }
    }
}
