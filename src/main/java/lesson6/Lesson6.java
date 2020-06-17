package lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


public class Lesson6 {


    public int[] arrayCopyFour(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                index = i;
            }
        }

        if (index != 0) {
            int[] result = new int[arr.length - index - 1];
            System.arraycopy(arr, index + 1, result, 0, arr.length - index - 1);
            return result;
        } else {
            throw new RuntimeException("Массив не содержит цифры 4");
        }
    }

    static int[] arr = {1, 2, 4, 2, 4, 6, 3, 12, 4, 5, 5, 5, 5, 3, 1};
    static int[] arr1 = {2, 2, 6, 3, 12, 5, 5, 5, 5, 3};
    static int[] arr2 = {1, 4, 4, 4, 4, 1, 1, 1, 4, 1, 4, 2, 4, 1, 4};
    static int[] arr3 = {4};

    public boolean arrayContainsOneFour (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 4) {
                for (int j = 0; j < arr.length; j++) {
                    if(arr[j] == 1) {
                        return true;
                    }
                }
            }
        }
        return false;

    }

//    if (list.containsAll(Arrays.asList("A", "B"))) {
//        System.out.println("Hello A and B");
//    }

//    boolean contains = Arrays.stream(values).anyMatch("s"::equals);

}

//2. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
//   Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
//   идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку,
//   иначе в методе необходимо выбросить RuntimeException.
//   Написать набор тестов для этого метода (по 3-4 варианта входных данных). Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].

//3. Написать метод, который проверяет состав массива из чисел 1 и 4.
//   Если в нем нет хоть одной четверки или единицы, то метод вернет false;
//   Написать набор тестов для этого метода (по 3-4 варианта входных данных).