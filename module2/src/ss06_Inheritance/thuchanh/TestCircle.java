package ss06_Inheritance.thuchanh;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);

        Circle circle1=new Circle(7);
        System.out.println(circle1);

        Circle circle2=new Circle(3,"green",false);
        System.out.println(circle2);

        circle2.setRadius(6);
        circle2.setColor("Red");
        circle2.setFilled(true);

        System.out.println(circle2.getRadius()+"\n"+circle2);

    }
}
