public class CalculatorTest {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(20);
        shapes[1] = new Rectangle(10, 10);
        shapes[2] = new Circle(10);

        System.out.println("Pole prostokąta o bokach " + ((Rectangle) shapes[1]).getSideA() + " i " + (((Rectangle)
                shapes[1]).getSideB()) + " wynosi: " + ShapeCalculator.calculateRectangleArea((Rectangle) shapes[1]));
        System.out.println("Obwód prostokąta o bokach " + ((Rectangle) shapes[1]).getSideA() + " i " + (((Rectangle)
                shapes[1]).getSideB()) + " wynosi: " + ShapeCalculator.calculateRectanglePerimeter((Rectangle)
                shapes[1]));

        System.out.println("Pole koła o promieniu: " + ((Circle) shapes[0]).getRadius() + " wynosi: "
                + ShapeCalculator.calculateCircleArea((Circle) shapes[0]));
        System.out.println("Obwód koła o promieniu: " + ((Circle) shapes[0]).getRadius() + " wynosi: "
                + ShapeCalculator.calculateCirclePerimeter((Circle) shapes[0]));

        System.out.println("Pole koła o promieniu: " + ((Circle) shapes[2]).getRadius() + " wynosi: "
                + ShapeCalculator.calculateCircleArea((Circle) shapes[2]));
        System.out.println("Obwód koła o promieniu: " + ((Circle) shapes[2]).getRadius() + " wynosi: "
                + ShapeCalculator.calculateCirclePerimeter((Circle) shapes[2]));
    }
}
