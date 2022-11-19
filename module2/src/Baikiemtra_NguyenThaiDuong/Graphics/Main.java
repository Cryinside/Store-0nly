package Baikiemtra_NguyenThaiDuong.Graphics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean check = true;
        int choice = 0;
        int size = 0;
        int radius = 0;
        int height = 0;
        boolean filled = false;
        int chooseFilled = 0;
        while (check) {

            System.out.println("----------------------------");
            System.out.println("1.\tHinh vuong");
            System.out.println("2.\tHinh tron");
            System.out.println("3.\tHinh tam giac");
            System.out.println("4.\tHinh tron rong");
            System.out.println("5.\tHinh tam giac nguoc");
            System.out.println("6.\tExit");
            System.out.println("----------------------------");
            
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Sai dinh dang. Nhap lai!! ");
                choice = Integer.parseInt(scanner.nextLine());

            }
            switch (choice) {
                case 1:
                    System.out.println("nhap size");
                    size=Integer.parseInt(scanner.nextLine());
                    System.out.println(" chon filled: 1. true  2. false  3. exit" );
                    chooseFilled=Integer.parseInt(scanner.nextLine());
                    Square square;
                    switch (chooseFilled){
                        case 1:

                            square = new Square(size, true);
                            square.drawSquare();
                            break;
                        case 2:
                            square = new Square(size, false);
                            square.drawSquareEmpty();
                            break;
                        case 3:
                            System.exit(3);
                            break;
                            
                        default:
                            System.out.println(" ban chua nhap");
                            break;

                    }

                    break;
                case 2:
                    System.out.println("nhap size");
                    radius=Integer.parseInt(scanner.nextLine());
                    System.out.println(" chon filled: 1. true  2. false  3. exit" );
                    chooseFilled=Integer.parseInt(scanner.nextLine());
                    Circle circle;
                    switch (chooseFilled) {
                        case 1:

                            circle = new Circle(true, radius);
                            circle.drawCircle();
                            break;
                        case 2:
                            circle = new Circle(false, radius);
                            circle.drawCircleEmpty();
                            break;
                        case 3:
                            System.exit(3);
                            break;
                        default:
                            System.out.println(" ban chua nhap");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("nhap height");
                    height=Integer.parseInt(scanner.nextLine());
                    Triangle triangle=new Triangle(height);
                    triangle.drawTriangle();
                    break;
                    
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.exit(6);
                    break;

            }

        }
    }

//        System.out.print("nhap canh: ");
//        int size=scanner.nextInt();
//        Square square = new Square(size);
//        square.draw();

}
