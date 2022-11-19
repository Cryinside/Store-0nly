package baitapngoai;

import java.util.Scanner;

public class MyCalc {
    private static MathCalc mathCalc=new MathCalc();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhap n: ");
        int n=scanner.nextInt();
        System.out.println("giai thua cua "+n+": "+mathCalc.factorial(n));

        if (mathCalc.prime(n)){
            System.out.println(n +" la SNT");
        }else {
            System.out.println(n +" khong phai SNT");
        }
        System.out.println(n+" co "+mathCalc.digits(n)+" chu so");
    }
}
