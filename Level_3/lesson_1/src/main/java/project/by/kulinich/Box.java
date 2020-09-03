package project.by.kulinich;

import project.by.kulinich.fruit.Fruit;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private T[] obj;

    public Box(T ... obj) {
        this.obj = obj;
        ArrayList<T> arrayList = new ArrayList<T>(Arrays.asList(obj));
    }

    public float getWeight(Box box) {
        float weight = 0.0f;

        for (T o: box
             ) {
            weight += o.getWeight;
        }
        return weight;
    }
}
