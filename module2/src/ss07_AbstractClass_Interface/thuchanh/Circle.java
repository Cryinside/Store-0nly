package ss07_AbstractClass_Interface.thuchanh;

public class Circle  {
    private double radius=2;
    private String color="Blue";
    private boolean filled=false;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius=radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
}
