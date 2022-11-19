package ss01_introduction_to_java.thuchanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear equation resolver");
        System.out.println("Given a question as 'a*x+b=c' ,please enter constants: ");
        Scanner scanner=new Scanner(System.in);

        System.out.println("nhap a:");
        double a=scanner.nextFloat();

        System.out.println("nhap b:");
        double b=scanner.nextFloat();

        System.out.println("nhap c:");
        double c=scanner.nextFloat();

        if (a!=0){
            double res=(c-b)/a;
            System.out.printf("Equation pass with x = %f!\n", res);
        }else {
            if (b==c){
                System.out.println("The solution is all x!");
            }else {
                System.out.println("No solution");
            }
        }
    }
}
