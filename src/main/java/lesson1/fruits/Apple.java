package lesson1.fruits;

public class Apple implements Fruit {
    @Override
    public String getName() {
        return "Apple";
    }

    @Override
    public double getWeight() {
        return 1.0f;
    }
}
