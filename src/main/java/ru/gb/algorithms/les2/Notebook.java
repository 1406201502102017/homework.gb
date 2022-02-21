package ru.gb.algorithms.les2;

import java.util.*;

/*
1. Отсортировать массив, состоящий из экземпляров класса Notebook в количестве 10000 штук.
        ??? я не совсем понял, как можно реализовать 10000 шт.???
Условия для сортировки:
1) по цене. От 500 до 2000 долларов с шагом в 50
если цена равная, то
2) по кол-ву оперативной памяти (от 4 до 24 с шагом 4),
если памяти тоже равное количество, то
3) по производителю:
Lenuvo > Asos > MacNote > Eser > Xamiou
 */
public class Notebook implements Comparable {

            public int price;
            public int ram;
            public String brand;

            public Notebook(int notebookPrice, int ram, String brand)
            {
                this.price = notebookPrice;
                this.ram = ram;
                this.brand = brand;
            }

            public int compareTo(Object obj)
            {
                Notebook tmp = (Notebook)obj;
                if (this.price < tmp.price)
                {
                    return -1;
                }
                else if (this.price > tmp.price)
                {
                    return 1;
                }
                return 0;
            }

        public static void main(String[] args)
        {

            Notebook[] notebooks = new Notebook[5];
            notebooks[0] = new Notebook(1000, 8,"Lenuvo");
            notebooks[1] = new Notebook(500,4,"Asos");
            notebooks[2] = new Notebook(1500,16,"MacNote");
            notebooks[3] = new Notebook(2000,24,"Eser");
            notebooks[4] = new Notebook(1550,12,"Xamiou");

            Arrays.sort(notebooks);

            for (int i = 0; i < notebooks.length; i++)
            {
                System.out.println("Фирма: " + notebooks[i].brand + ", " + "Цена: " + notebooks[i].price + ", " + "Количество ОП: " + notebooks[i].ram);
            }
        }
}
