package ss05_AccessModifier_StaticMethod_StaticProperty.btap;

public class Circle {
    private double radius=1.0;
    private String color="Red";
    private final double PI=3.14;
    public Circle(){};
    public Circle(double radius){
        this.radius=radius;
    };

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return PI*radius*radius;
    }

}
