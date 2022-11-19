package ss04_ClassObject_java.btap;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PTB2 co dang: ax^2 + bx = c");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b:");
        double b = scanner.nextDouble();
        System.out.print("c:");
        double c = scanner.nextDouble();
        ClassQuadraticEquation classQuadraticEquation = new ClassQuadraticEquation();
        ClassQuadraticEquation classQuadraticEquation1 = new ClassQuadraticEquation(a, b, c);
        if (classQuadraticEquation1.getDiscriminant() > 0) {
            System.out.println("The equatipn has two roots " + classQuadraticEquation1.getRoot1() + " and " + classQuadraticEquation1.getRoot2());
        } else if (classQuadraticEquation1.getDiscriminant() == 0) {
            System.out.println("The equatipn has one root " + classQuadraticEquation1.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }

}
