public class Square extends Shape{

    private int length;

    public Square(String color, int dimension, int length) {
        super(color, 2);
        this.length = length;
    }

    @Override
    public void draw() {
        // here we draw the shape
        System.out.println("Draw a Square");
        System.out.println("Color: " + color + ", Length: " + length);
    }
}
