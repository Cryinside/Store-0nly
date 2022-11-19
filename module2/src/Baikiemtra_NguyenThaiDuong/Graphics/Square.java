package Baikiemtra_NguyenThaiDuong.Graphics;

public class Square extends Shape{
    private int size;

    public Square() {
    }

    public Square( int size) {
        this.size = size;
    }

    public Square( int size, boolean filled) {
        super(filled);
        this.size = size;

    }

    @Override
    public void drawSquare() {
        super.drawSquare();
        if (isFilled()){
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                        System.out.print(" * ");
                    }
                System.out.println();
            }
        }


    }

    @Override
    public void drawSquareEmpty() {
        super.drawSquareEmpty();
        if (!isFilled()){
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i==0 || i==size-1 ||j==0 || j==size-1){
                        System.out.print(" * ");
                    }else {
                        System.out.print("   ");
                    }

                }
                System.out.println();
            }
        }
    }
}
