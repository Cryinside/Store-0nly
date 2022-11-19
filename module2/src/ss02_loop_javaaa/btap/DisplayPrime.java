package ss02_loop_java.btap;

import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=2,n=3;
        System.out.println("nhap so SNT can hien thi: ");
        int num=scanner.nextInt();
        System.out.print("2  3");
        while (count<num) {
            n++;
            boolean checkSNT=true;
            for(int i=2; i<n; i++){
                if(n%i==0) {
                    checkSNT =false;
                }
            }
            if(checkSNT) {
//                System.out.print("  "+n);
                System.out.printf("  %d", n);
                count++;
            }
        }
        // %d số, %s chuỗi, %f số thập phân (%5.2f)
        System.out.printf("\nCount = %d, n = %d\n", count, n);
    }
}
