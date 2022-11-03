import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        initializeShapes(shapes);
        drawShapes(shapes);

    }

    public static void initializeShapes(List<Shape> shapes) {

        Shape c = new Circle("Red", 2, 1, 1, 2);
        Shape r = new Rectangle("Blue", 2, 5, 2);
        Shape s = new Square("Green", 2, 4);
        shapes.add(c);
        shapes.add(r);
        shapes.add(s);
    }

    public static void drawShapes(List<Shape> shapes) {
        for(Shape s: shapes) {
            s.draw();
        }
    }
}
