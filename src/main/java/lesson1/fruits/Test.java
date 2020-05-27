package lesson1.fruits;

public class Test {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println("Weigth apple box is " + appleBox.getWeight());


        appleBox2.add(new Apple());
        System.out.println("Weigth apple box is " + appleBox2.getWeight());

        appleBox.moveToBox(appleBox2);
        System.out.println("Weigth apple box is " + appleBox.getWeight());
        System.out.println("Weigth apple box is " + appleBox2.getWeight());



        System.out.println("Weigth orange box is " + orangeBox.getWeight());

        System.out.println("Compare apples and oranges " + appleBox.compare(orangeBox));
        System.out.println("Compare apples and oranges " + appleBox2.compare(orangeBox));


    }
}
