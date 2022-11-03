public class Rectangle extends Shape {

    private int length;
    private int height;

    public Rectangle(String color, int dimension, int length, int height) {
        super(color, 2);
        this.length = length;
        this.height = height;
    }

    @Override
    public void draw() {
        // here we draw the shape
        System.out.println("Draw a Rectangle");
        System.out.println("Color: " + color + ", Length: " + length + ", Height: " + height);

    }
}
