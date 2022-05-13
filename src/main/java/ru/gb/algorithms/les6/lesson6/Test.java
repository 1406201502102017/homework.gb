package ru.gb.algorithms.les6.lesson6;

import java.util.Random;

public class Test {
    public static void main(String[] args) {

        Random random = new Random();

        Tree<Integer> tree = new TreeImpl<>();

        tree.add(random.nextInt(50) - 25);
        tree.add(random.nextInt(50) - 25);
        tree.add(random.nextInt(50) - 25);
        tree.add(random.nextInt(50) - 25);
        tree.add(random.nextInt(50) - 25);
        tree.add(random.nextInt(50) - 25);
        tree.add(random.nextInt(50) - 25);
        tree.add(random.nextInt(50) - 25);
        tree.add(random.nextInt(50) - 25);
        tree.add(random.nextInt(50) - 25);
        tree.add(random.nextInt(50) - 25);
        tree.add(random.nextInt(50) - 25);
        tree.add(random.nextInt(50) - 25);
        tree.add(random.nextInt(50) - 25);
        tree.add(random.nextInt(50) - 25);
        tree.add(random.nextInt(50) - 25);
        tree.add(random.nextInt(50) - 25);
        tree.add(random.nextInt(50) - 25);
        tree.add(random.nextInt(50) - 25);
        tree.add(random.nextInt(50) - 25);

        tree.display();

        tree.traverse(Tree.TraversMode.IN_ORDER);
        tree.traverse(Tree.TraversMode.PRE_ORDER);
        tree.traverse(Tree.TraversMode.POST_ORDER);

    }
}

