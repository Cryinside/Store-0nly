package ss04_ClassObject_java.thuchanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        ClassRectangular rectangular=new ClassRectangular();
        ClassRectangular rectangular1=new ClassRectangular(height,width);
        System.out.println("Your Rectangle \n"+ rectangular1.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangular1.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangular1.getArea());
    }
}
