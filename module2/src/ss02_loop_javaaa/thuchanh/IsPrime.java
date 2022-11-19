package ss01_loop_java.thuchanh;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input number(n>0):");
        int n=scanner.nextInt();
        if (n<2){
            System.out.print(n+" isn't the prime");
        }else{
            int i=2;
            boolean kt=true;
            while (i < n){
                if (n%i==0){
                    kt=false;
                    break;
                }
                i++;
            }
            if (kt){
                System.out.println(n+" is the prime");
            }else {
                System.out.println(n+" isn't the prime");
            }
        }




    }
}
