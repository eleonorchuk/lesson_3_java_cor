package ru.geekbrains.lessons.jc;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;
    public Box() {
        System.out.println("new Box");
        fruits = new ArrayList();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight() {
        if (fruits.isEmpty()) {
            return 0.0;
        }
        double weight = 1.0;

        if (fruits.get(0) instanceof Orange)
            weight = 1.5;

        return fruits.size() * weight;
    }

    public boolean compare(Box box)
    {
        if (getWeight() == box.getWeight())
            return true;

        return false;
    }
}
