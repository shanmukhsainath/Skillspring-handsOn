public class Rectangle implements Shape {
    private int length;
    private int breadth;

    public Rectangle() {
        length = 10;
        breadth = 6;
    }

    public void draw() {
        System.out.println("Drawing a rectangle of " + length + " x " + breadth);
    }
}
