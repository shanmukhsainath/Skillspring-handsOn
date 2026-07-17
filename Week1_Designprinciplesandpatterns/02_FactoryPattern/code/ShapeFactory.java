public class ShapeFactory {
    public Shape getShape(String shapeType) {
        // Factory hides object creation logic from the client code.
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            return new Triangle();
        }

        return null;
    }
}
