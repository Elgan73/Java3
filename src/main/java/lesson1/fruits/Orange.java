package lesson1.fruits;

public class Orange implements Fruit {
    @Override
    public String getName() {
        return "Orange";
    }

    @Override
    public double getWeight() {
        return 1.5f;
    }
}
