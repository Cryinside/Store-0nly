package ss06_Inheritance.btap;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);

        Cylinder cylinder1=new Cylinder(5,6,"Red");
        System.out.println(cylinder1);
        cylinder1.setColor("Hok be oi");
        System.out.println(cylinder1);
    }
}
