import java.util.ArrayList;
import java.util.List;
public class App {
public static void main(String[] args) {
    List<Shape> shapes = new ArrayList<>();
    List<Shape> shapesCopy = new ArrayList<>();

    Circle circle = new Circle();
    circle.x = 50;
    circle.y = 30;
    circle.radius = 20;
    circle.color = "Blue";
    shapes.add(circle);

    Circle anotherCircle = (Circle) circle.clone();
    shapes.add(anotherCircle);

    Rectangle rectangle = new Rectangle();
    rectangle.width = 60;
    rectangle.height = 30;
    rectangle.color = "Red";
    shapes.add(rectangle);

    cloneAndCompare(shapes, shapesCopy);
}
private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
    for (Shape shape : shapes) {
    shapesCopy.add(shape.clone());
    }
    for (int i = 0; i < shapes.size(); i++) {
    if (shapes.get(i) != shapesCopy.get(i)) {
    System.out.println(i + ": Shapes are different objects (yay!)");
    if (shapes.get(i).equals(shapesCopy.get(i))) {
    System.out.println(i + ": And they are identical (yay!)");
    } 
    else {
        System.out.println(i + ": But they are not identical (booo!)");}
    } 
    else {
    System.out.println(i + ": Shape objects are the same (booo!)");}
    }
 }
}