import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> shapes = initializeShapes();
        drawShapes(shapes);

    }

    public static List<Shape> initializeShapes() {

        List<Shape> shapes = new ArrayList<>();
        Shape c = new Circle("Red", 2, 1, 1, 2);
        Shape r = new Rectangle("Blue", 2, 5, 2);
        Shape s = new Square("Green", 2, 4);
        shapes.add(c);
        shapes.add(r);
        shapes.add(s);
        return shapes;
    }

    public static void drawShapes(List<Shape> shapes) {
        for(Shape s: shapes) {
            s.draw();
        }
    }
}
