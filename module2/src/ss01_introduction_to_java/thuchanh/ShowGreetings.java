package ss01_introduction_to_java.thuchanh;

import java.util.Scanner;

public class ShowGreetings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tên: ");
        int n=scanner.nextInt();
//        String name=scanner.nextLine();
//        System.out.println("Chào "+name);
        int sum=0;
        int i;
        for( i=0;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }


    }
}
