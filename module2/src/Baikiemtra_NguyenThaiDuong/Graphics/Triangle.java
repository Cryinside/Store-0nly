package Baikiemtra_NguyenThaiDuong.Graphics;

import java.util.Scanner;

public class Triangle extends Shape{
    private int height;

    public Triangle() {
    }

    public Triangle(boolean filled, int height) {
        super(filled);
        this.height = height;
    }

    public Triangle(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                '}';
    }

    @Override
    public void drawTriangle() {
        super.drawTriangle();
        int choice = -1;
        Scanner input = new Scanner(System.in);
        String s = "";

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
             if (choice == 1) {
                System.out.println("Menu");
                System.out.println("1. Top-left");
                System.out.println("2. Top-right");
                System.out.println("3. Bottom-left");
                System.out.println("4. Bottom-right");
                System.out.println("0. Exit");

                System.out.println("Enter your choice: ");
                choice = input.nextInt();
                if (choice == 3) {
                    for (int i = 1; i <= height; i++) {
                        for (int j = i; j >= 1; j--) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                } else if (choice == 4) {
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height; j++) {
                            if (j <= height - i) {
                                System.out.print("   ");
                            } else {
                                System.out.print(" * ");
                            }

                        }
                        System.out.println("");
                    }
                } else if (choice == 1) {
                    for (int i = 0; i <= height; i++) {
                        for (int j = height - i; j >= 1; j--) {
                            System.out.print(" * ");

                        }
                        System.out.println("");
                    }
                } else if (choice == 2) {
                    for (int i = height; i >= 1; i--) {
                        for (int j = 1; j <= height; j++) {
                            if (j <= height - i) {
                                System.out.print("   ");
                            } else {
                                System.out.print(" * ");
                            }
                        }
                        System.out.println("");
                    }
                } else if (choice == 0) {
                    System.exit(0);
                }

            } else if (choice == 2) {
                for (int i=1;i<=height;i++){
                    for (int j=height;j>i;j--){
                        System.out.print("   ");
                    }
                    for (int k=1;k<=2*i-1;k++){
                        System.out.print(" * ");
                    }
                    System.out.println("  ");
                }
            } else if (choice == 0) {
                System.exit(0);
            } else {
                System.out.println("Bạn đang bấm cái gì đấy. Xin hãy chọn lại");
            }

        }
    }
    }