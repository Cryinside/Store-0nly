package ss07_AbstractClass_Interface.thuchanh;
import ss06_Inheritance.thuchanh.Circle;
import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(2.2);
        circles[1] = new Circle(5.6);
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator=new CircleComparator();

        Arrays.sort(circles,circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
