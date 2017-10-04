public class CalculatorTest {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(20);
        shapes[1] = new Rectangle(10, 10);
        shapes[2] = new Circle(10);

        System.out.println("Wynik z metody ogólnej. Pole prostokąta: " + ShapeCalculator.calculateArea(shapes[1]));
        System.out.println("Wynik z metody ogólnej. Pole koła: " + ShapeCalculator.calculateArea(shapes[0]));

        System.out.println("Wynik z metody ogólnej. Obwód prostokąta: " + ShapeCalculator.calculatePerimeter
                (shapes[1]));
        System.out.println("Wynik z metody ogólnej. Obwód koła: " + ShapeCalculator.calculatePerimeter(shapes[0]));
    }
}
