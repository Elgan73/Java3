package lesson1.arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Arr {

    static <T> ArrayList<T> arrToArrList(T[] arr) {
        ArrayList<T> array = new ArrayList<T>();
        Collections.addAll(array, arr);
        return array;
    }

    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,4,7,1,2,3,8};
        String[] ar = {"a", "b", "c"};
        arrToArrList(ar);
    }
}
