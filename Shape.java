
public abstract class Shape {

    protected String color;
    protected int dimension;

    public Shape(String color, int dimension) {
        this.color = color;
        this.dimension = dimension;
    }

    public abstract void draw();

}
