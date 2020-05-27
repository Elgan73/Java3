package lesson1.fruits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<A extends Fruit> {

    private List<A> fruits = new ArrayList<>();

    public Box(List<A> fruits) {
        this.fruits.addAll(fruits);
    }

    public Box(A... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }

    public void add(A fruit) {
        fruits.add(fruit);
    }

    public void moveToBox(Box<A> otherBox) {
        for(A fruit: fruits){
            otherBox.add(fruit);
        }

        fruits.clear();
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }

    public double getWeight() {
        double sum = 0.0;

        for(A fruit : fruits) {
            sum += fruit.getWeight();

        }
        return sum;
    }
}
