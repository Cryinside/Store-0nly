package ss07_AbstractClass_Interface.btap;

public class Square extends Shape implements Resizeable, Colorable {
    private double side=5;

    public Square() {
    }

    public Square(int side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public void resize(double percent) {
        this.side = side + side*percent/100;
    }

    @Override
    public String display() {
        return "Side = "+side;
    }

    @Override
    public String howToColor() {
        return "Color all four sides..";
    }
}
