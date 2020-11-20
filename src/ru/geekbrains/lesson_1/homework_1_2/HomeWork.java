package ru.geekbrains.lesson_1.homework_1_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork {
    public static void main(String[] args) {
        String[] stringArray = {"1", "2"};
        Integer[] intArray = {5, 4, 3};
        changePlacesOfElements(stringArray, 0, 1);
        changePlacesOfElements(intArray, 0, 2);
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(intArray));
        List list = castToArrayList(intArray);
        System.out.println(list);
    }

    public static <T> void changePlacesOfElements(T[] array, int index1, int index2){
        T tempElem = array[index1];
        array[index1] = array[index2];
        array[index2] = tempElem;
    }

    public static <T> ArrayList castToArrayList(T[] array){
        return new ArrayList(Arrays.asList(array));
    }
}
