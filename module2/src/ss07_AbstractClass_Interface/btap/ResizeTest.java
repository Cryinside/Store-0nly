package ss07_AbstractClass_Interface.btap;

public class ResizeTest {
    public static void main(String[] args) {
        //change circle percent
        Circle c1=new Circle(5,"green",true);
        c1.resize(30);
        System.out.println(c1.display());

        //change rectangle percent
        Rectangle r1=new Rectangle(5,7);
        r1.resize(60);
        System.out.println(r1.display());

        //change square percent
        Square s1=new Square(7);
        s1.resize(19);
        System.out.println(s1.display());
    }
}

