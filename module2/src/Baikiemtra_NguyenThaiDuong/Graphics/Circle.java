package Baikiemtra_NguyenThaiDuong.Graphics;

public class Circle extends Shape {
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(boolean filled, int radius) {
        super(filled);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void drawCircle() {
        super.drawCircle();
        if (isFilled()){
            for (int i = 0; i < radius; i++) {
                for (int j = 0; j < radius; j++) {
                    if (i==0 || i==radius-1 || j==0 || j==radius-1){
                        System.out.print("  ");
//                        System.out.print(" * ");
//                        System.out.print(" * ");
//                        for (int k = 0; k < radius-2; k++) {
//                            System.out.print(" * ");
//                        }

                    }else {
                        System.out.print(" * ");
                    }

                }
                System.out.println();
            }
        }
    }

    @Override
    public void drawCircleEmpty() {
        super.drawCircleEmpty();
    }
}
