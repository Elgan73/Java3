package lesson1.replace;

import java.util.Arrays;

public class RePlace<F> {

    static <T> T[] arrSwapElement(T[] arr) {
        T tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
        return arr;
    }

    public static void main(String[] args) {
        String[] array = {"Hello", "World!"};
        System.out.println(Arrays.toString(array));
        arrSwapElement(array);
        for(String a : array) {
            System.out.println(a);
        }
    }


}
