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
    }

    public static void swapElements(Object[] arr, int index1, int index2) {
        Object hand = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = hand;
    }
}
