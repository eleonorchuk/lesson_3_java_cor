package ru.geekbrains.lessons.jc;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа); */
        String[] arr = {"abc", "bce", "abd", "cde"};
        System.out.println("arr = " + Arrays.toString(arr));
        swapElements(arr,1,3);
        System.out.println("arr after swap = " + Arrays.toString(arr));

        Integer[] arr1 = {1,2,3,4,5};
        System.out.println("arr1 = " + Arrays.toString(arr1));
        // [1,2,3,4,5]
        swapElements(arr1,1,3);
        System.out.println("arr1 after swap = " + Arrays.toString(arr1));
        // [1,4,3,2,5]

        /*
        Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
        Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку
        нельзя сложить и яблоки, и апельсины; Для хранения фруктов внутри коробки можно использовать ArrayList;
        Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
        вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны); Внутри класса Box сделать метод compare(),
         который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра.
         true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и
        апельсинами;
        Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя
        яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются
        объекты, которые были в первой;
        Не забываем про метод добавления фрукта в коробку.
        */
        Box[] boxes = new Box[3];
        boxes[0] = new Box<Apple>();
        boxes[1] = new Box<Orange>();
        boxes[2] = new Box<Apple>();

        for(int i = 0; i < 6; i++)
            boxes[0].addFruit(new Apple());

        for(int i = 0; i < 4; i++)
            boxes[1].addFruit(new Orange());

        for(int i = 0; i < 10; i++)
            boxes[2].addFruit(new Apple());

        System.out.println("Коробка 0 равна Коробке 1 " + boxes[0].compare(boxes[1]));
        System.out.println("Коробка 0 равна Коробке 2 " + boxes[0].compare(boxes[2]));
        System.out.println("Коробка 1 равна Коробке 2 " + boxes[1].compare(boxes[2]));
    }

    public static void swapElements(Object[] arr, int index1, int index2) {
        Object hand = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = hand;
    }
}
