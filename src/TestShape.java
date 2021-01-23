public class TestShape {
    public static void main(String[] args) {

        // Rectangle test
        double width = 5, length = 7;
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.getArea()
                + "\nResulting perimeter: " + rectangle.getPerimeter() + "\n");

        // Circle test
        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
                + "\nResulting Area: " + circle.getArea()
                + "\nResulting Perimeter: " + circle.getPerimeter() + "\n");

        // Square test
        double side = 4;
        Shape triangle = new Square(side);
        System.out.println("Square sides lengths: " + side
                + "\nResulting Area: " + triangle.getArea()
                + "\nResulting Perimeter: " + triangle.getPerimeter() + "\n");
    }
}