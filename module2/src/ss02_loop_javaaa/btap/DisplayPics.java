package ss02_loop_java.btap;

import java.util.Scanner;

public class DisplayPics {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        String s = "";
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the square");
            System.out.println("2. Draw the rectangle");
            System.out.println("3. Draw the triangle");
            System.out.println("4. Draw the isosceles triangle");

            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Input edge,please!! ");
                int edge = input.nextInt();
                for (int i = 1; i <= edge; i++) {
                    for (int j = 1; j <= edge; j++) {
                        System.out.print(" * ");
                    }
                    System.out.print("\n");
                }

            } else if (choice == 2) {
                System.out.println("Input height,please!! ");
                int height = input.nextInt();
                System.out.println("Input width,please!! ");
                int width = input.nextInt();
                for (int i = 1; i <= width; i++) {
                    for (int j = 1; j <= height; j++) {
                        System.out.print(" * ");
                    }
                    System.out.print("\n");
                }
            } else if (choice == 3) {
                System.out.println("Menu");
                System.out.println("1. Top-left");
                System.out.println("2. Top-right");
                System.out.println("3. Bottom-left");
                System.out.println("4. Bottom-right");
                System.out.println("0. Exit");

                System.out.println("Enter your choice: ");
                choice = input.nextInt();
                System.out.println("Input height,please!! ");
                int height = input.nextInt();
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

            } else if (choice == 4) {
                System.out.println("Input height,please!! ");
                int height = input.nextInt();
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
