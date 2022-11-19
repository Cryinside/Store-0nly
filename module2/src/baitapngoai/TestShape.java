package baitapngoai;

public class TestShape {
    public static void main(String[] args) {
        Square square=new Square(5,true);
        System.out.println(square.toString());
        square.draw();
    }
}
