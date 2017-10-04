public class ShapeCalculator {
    public static double calculateRectanglePerimeter(Rectangle rectangle) {
        double perimeter = rectangle.getSideA() * 2 + rectangle.getSideB() * 2;
        return perimeter;
    }

    public static double calculateRectangleArea(Rectangle rectangle) {
        double area = rectangle.getSideA() * rectangle.getSideB();
        return area;
    }

    public static double calculateCirclePerimeter(Circle circle) {
        double perimeter = 2 * Math.PI * circle.getRadius();
        return perimeter;
    }

    public static double calculateCircleArea(Circle circle) {
        double area = Math.PI * Math.pow(circle.getRadius(), 2);
        return area;
    }

}
