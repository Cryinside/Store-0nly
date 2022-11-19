package baitapngoai;

public class Square extends Shape {
    private int side;

    public int getSide() {
        return this.side;
    }

    public void setSide(int size) {
        this.side = size;
    }

    public Square(int side) {
        super();
        this.side = side;
    }

    public Square() {
        super();
        this.side = 1;
    }

    public Square(int size, boolean filled) {
        super(filled);
        this.side = size;
    }

    @Override
    public double calcArea() {
        return this.side * this.side;
    }

    @Override
    public double calcPerimeter() {
        return this.side * 4;
    }

    @Override
    public void draw() {
        System.out.println("Ve hinh Square\n");
        if (this.isFilled()) {
            for (int i = 0; i < this.side; i++) {
                for (int j = 0; j < this.side; j++) {
                    if (i == 0 || j == 0 || i == this.side - 1 || j == this.side - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }else {
            for (int i = 0; i < this.side; i++) {
                for (int j = 0; j < this.side; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }




//        for (int i = 1; i <= this.side; i++){
//            if (i==1 || i==this.side){
//                for (int j = 1; j <= this.side; j++) {
//                    System.out.print("*");
//                }
//
//            }else {
//                System.out.print("*");
//                for (int j = 1; j <= this.side-2 ; j++) {
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//            }
//            System.out.println();
//        }


    }

    @Override
    public String toString() {
        return "SQR: " + this.getName() + " " + this.isFilled() + " " + this.getSide();

    }
}
