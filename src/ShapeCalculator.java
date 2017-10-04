public class ShapeCalculator {


    public static double calculateArea(Shape shape) {
        double area = 0;
        if (shape instanceof Rectangle) {
            area = ((Rectangle) shape).getSideA() * ((Rectangle) shape).getSideB();
        }
        if (shape instanceof Circle) {
            area = Math.pow(((Circle) shape).getRadius(), 2) * Math.PI;
        }
        return area;
    }

    public static double calculatePerimeter(Shape shape) {
        double perimeter = 0;
        if (shape instanceof Rectangle) {
            perimeter = ((Rectangle) shape).getSideA() * 2 + ((Rectangle) shape).getSideB() * 2;
        }
        if (shape instanceof Circle) {
            perimeter = 2 * Math.PI * ((Circle) shape).getRadius();
        }
        return perimeter;
    }
}
