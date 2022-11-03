public class Circle extends Shape{

    private int centerX;
    private int centerY;
    private int radius;


    public Circle(String color, int dimension, int centerX, int centerY, int radius) {
        super(color, 2);
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    @Override
    public void draw() {
        // here we draw the shape
        System.out.println("Draw a Circle");
        System.out.println("Color: " + color + ", Center Point: (" + centerX + "," + centerY + ")," +
                " Radius: " + radius);
    }
}
