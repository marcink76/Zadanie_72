public class CalculatorTest {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        rectangle.setSideA(10);
        rectangle.setSideB(10);

        circle.setRadius(10);

        System.out.println(ShapeCalculator.calculateRectangleArea(rectangle));
        System.out.println(ShapeCalculator.calculateRectanglePerimeter(rectangle));

        System.out.println(ShapeCalculator.calculateCircleArea(circle));
        System.out.println(ShapeCalculator.calculateCirclePerimeter(circle));
    }
}
