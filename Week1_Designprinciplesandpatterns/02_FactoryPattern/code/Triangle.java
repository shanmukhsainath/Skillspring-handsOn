public class Triangle implements Shape {
    private int sides;

    public Triangle() {
        sides = 3;
    }

    public void draw() {
        System.out.println("Drawing a triangle with " + sides + " sides");
    }
}
