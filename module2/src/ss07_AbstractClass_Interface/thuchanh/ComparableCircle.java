package ss07_AbstractClass_Interface.thuchanh;
import ss06_Inheritance.thuchanh.Circle;

import java.util.Comparator;
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }


    @Override
    public int compareTo(ComparableCircle object) {
        if (getRadius() > object.getRadius()) {
            return 1;
        } else if (getRadius() < object.getRadius()) return -1;
        else return 1;
    }
    //(getRadius() > o.getRadius()) ? 1: (getRadius() < o.getRadius()) ? -1:0;
}
