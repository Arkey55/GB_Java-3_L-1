package ru.geekbrains.lesson_1.homework_3;

import ru.geekbrains.lesson_1.homework_3.entity.Fruit;

import java.util.ArrayList;

public class Box<T extends Fruit>{

    private ArrayList<T> box = new ArrayList<>();
    private float fruitWeight;

    public void add(T fruit){
        box.add(fruit);
        fruitWeight = fruit.getWeight();
    }

    public double getWeight (){
        return box.size() * fruitWeight;
    }

    public boolean compare(Box box){
        if (this.getWeight() == box.getWeight()){
            return true;
        }
        return false;
    }

    public ArrayList<T> getBox() {
        return box;
    }
}
