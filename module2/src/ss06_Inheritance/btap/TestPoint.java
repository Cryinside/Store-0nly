package ss06_Inheritance.btap;

public class TestPoint {
    public static void main(String[] args) {
        Point[] points=new Point[5];
        points[0]=new MovePoint();
        points[1]=new MovePoint(5,6,7,8);
        System.out.println(points[1].toString());
    }
}
