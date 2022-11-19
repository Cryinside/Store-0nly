package ss06_Inheritance.btap;

class Cylinder extends Circle {
    double height;

    public Cylinder() {
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return getRadius() * getRadius() * height * Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height = " + height +
                ", radius = " + getRadius() +
                ", color= " + getColor() +
                ", Volume = " + getVolume() +
                '}';
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
