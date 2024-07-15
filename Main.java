import jdk.jfr.Frequency;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//          Before
        Shape shape = new Shape();
        System.out.println(shape);

//          After
        shape.setColor("Black");
        shape.setFilled(false);
        System.out.println(shape);
        System.out.println("=====================================");


//          Before
        Circle circle = new Circle();
        System.out.println(circle);

//          After
        circle.setColor("Red");
        circle.setFilled(false);
        circle.setRadius(10);
        System.out.println(circle);
        System.out.println(" Area: " + circle.getArea());
        System.out.println(" Perimeter: " + circle.getPerimeter());
        System.out.println("=====================================");


//          Before
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

//          After
        rectangle.setColor("Purple");
        rectangle.setFilled(true);
        rectangle.setLength(4.0);
        rectangle.setWidth(3.0);
        System.out.println(rectangle);
        System.out.println(" Area: " + rectangle.getArea());
        System.out.println(" Perimeter: " + rectangle.getPerimeter());
        System.out.println("=====================================");

//        Before
        Square square = new Square();
        System.out.println(square);


//        After
        square.setColor("White");
        square.setFilled(false);
        square.setSide(6.0);
        System.out.println(square);
        System.out.println(" Area: " + square.getArea());
        System.out.println(" Perimeter: " + square.getPerimeter());
        System.out.println("=====================================");

    }
}