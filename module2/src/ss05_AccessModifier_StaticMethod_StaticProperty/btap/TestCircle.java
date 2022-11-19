package ss05_AccessModifier_StaticMethod_StaticProperty.btap;

public class TestCircle {
    public static void main(String[] args) {
        Circle c=new Circle();
        Circle c1=new Circle(5);

        System.out.println(c1.getArea());
        System.out.println(c1.getRadius());

    }
}
