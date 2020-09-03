package project.by.kulinich;

import project.by.kulinich.fruit.Fruit;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private T[] obj;
    ArrayList<T> arrayList = new ArrayList<T>();

    public Box(T... obj) {
        this.obj = obj;
        arrayList.addAll(Arrays.asList(obj));
    }

    public ArrayList<T> putInBox(T obj) {
        arrayList.add(obj);
        return arrayList;
    }

    public float getWeight(Box box) {
        float weight = 0.0f;
/*
        for (T o: box
             ) {
            weight += o.getWeight; //не видит getWeight
        }
*/
        return weight;
    }
}
