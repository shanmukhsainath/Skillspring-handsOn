public class Circle implements Shape {
    private int radius;

    public Circle() {
        radius = 5;
    }

    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}
