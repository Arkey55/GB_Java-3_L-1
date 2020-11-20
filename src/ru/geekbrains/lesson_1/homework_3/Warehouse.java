package ru.geekbrains.lesson_1.homework_3;

import ru.geekbrains.lesson_1.homework_3.entity.Apple;
import ru.geekbrains.lesson_1.homework_3.entity.Fruit;
import ru.geekbrains.lesson_1.homework_3.entity.Orange;

import java.util.ArrayList;

public class Warehouse {
    public static void main(String[] args) {

        Box<Apple> box1 = new Box<>();
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());

        Box<Orange> box2 = new Box<>();
        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());

        System.out.println("box1 weight: " + box1.getWeight());
        System.out.println("box2 weight: " + box2.getWeight());

        boolean compare = box1.compare(box2);
        System.out.println("compare: " + compare);

        Box<Apple> box3 = new Box<>();
        Box<Orange> box4 = new Box<>();
        rearrange(box1, box3);
        rearrange(box2, box4);
        System.out.println("box1 weight: " + box1.getWeight());
        System.out.println("box2 weight: " + box2.getWeight());
        System.out.println("box3 weight: " + box3.getWeight());
        System.out.println("box4 weight: " + box4.getWeight());


    }

    private static<T extends Fruit> void rearrange (Box <T> boxFrom, Box <T> boxTo){
        ArrayList tempBox = boxFrom.getBox();
        for (int i = 0; i < tempBox.size(); i++) {
            boxTo.add(boxFrom.getBox().get(i));
        }
        boxFrom.getBox().clear();
    }
}
