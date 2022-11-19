package ss06_Inheritance.btap;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        Triangle triangle1=new Triangle("yellow", false,4,5,2);

        System.out.println(triangle1.toString());
    }
}
