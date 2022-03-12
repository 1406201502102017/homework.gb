package ru.geekbrains.lessons.les5;

// 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class CoWorkers {
    private String name;
    private String position;
    private String email;
    private String numberPhone;
    private int salary;
    private int age;
// 2. Конструктор класса должен заполнять эти поля при создании объекта.
    public CoWorkers(String name, String position, String email, String numberPhone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.age = age;
    }
// 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public static Object infoEmployee(String name, String position, String email, String numberPhone, int salary, int age) {
        System.out.printf("Имя: %s\nДолжность: %s\nПочта: %s\nНомер телефона: %s\nЗарплата: %d\nВозраст: %d\n", name, position, email, numberPhone, salary, age);
        return null;
    }
// 4. Создать массив из 5 сотрудников.
// 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
    public static void staffArr() {
        CoWorkers[] staffArray = new CoWorkers [5];
        staffArray[0] = new CoWorkers("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        staffArray[1] = new CoWorkers("Petrov Jo", "Doctor", "jopetrov@mail.ru", "891212387", 50000, 41);
        staffArray[2] = new CoWorkers("Sidoroff Vasya", "Developer", "sidVa@gmail.com", "862512312", 100000, 42);
        staffArray[3] = new CoWorkers("Popov Mark", "CEO", "mPopov@yandex.ru", "861413332", 130000, 38);
        staffArray[4] = new CoWorkers("Sokolov Dima", "Manager", "dSokolov@list.ru", "892311594", 60000, 43);
        for (int i = 0; i < staffArray.length; i++) {
            if (staffArray[i].age >= 40) {
                System.out.println(infoEmployee(staffArray[i].name, staffArray[i].position, staffArray[i].email, staffArray[i].numberPhone, staffArray[i].salary, staffArray[i].age) + "\n");
            }
        }
    }

    public static void main(String[] args) {
        staffArr();
    }
}
