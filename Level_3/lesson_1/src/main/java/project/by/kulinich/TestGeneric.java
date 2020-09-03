package project.by.kulinich;

import java.util.ArrayList;
import java.util.Arrays;

public class TestGeneric<T> {

    public static <T> void changeInArray(T[] arr, int i1, int i2) {
        System.out.println("Task 1:" + Arrays.toString(arr));
        T change = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = change;
        System.out.println("Result replace: " + Arrays.toString(arr));
    }

    public static <T> void setArrayList(T[] array) {
        ArrayList<T> arrayList = new ArrayList<T>(Arrays.asList(array));
        System.out.println("Result convert in ArrayList: " + arrayList);
    }
}
