package ss06_Inheritance.btap;

import java.util.Arrays;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D=new Point2D(2,4);
        Point3D point3D=new Point3D(3,4,6);

        System.out.println(point2D);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
