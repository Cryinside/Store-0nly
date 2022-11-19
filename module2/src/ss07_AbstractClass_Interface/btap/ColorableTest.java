package ss07_AbstractClass_Interface.btap;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle(5,"red",true);
        shapes[1]=new Rectangle(7,6);
        shapes[2]=new Square(7);

        for (Shape i : shapes){
            if (i instanceof Square){
                ((Square) i).howToColor();
            }else {
                System.out.println(i.getArea());
            }
        }
    }
}
