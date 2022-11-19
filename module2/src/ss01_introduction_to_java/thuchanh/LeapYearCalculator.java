package ss01_introduction_to_java.thuchanh;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year=scanner.nextInt();
        boolean isLeapYear=false;
        boolean isDivisibleBy4=year%4==0;
        if (isDivisibleBy4){
            boolean isDivisibleBy100=year%100==0;
            if (isDivisibleBy100){
                    boolean isDivisibleBy400=year%400==0;
                    if (isDivisibleBy400){
                        isLeapYear=true;
                    }
            }else {
                isLeapYear=true;
            }
        }
        if (isLeapYear){
            System.out.printf("%d is the leap year!!", year);
        }else {
            System.out.printf("%d isn't the leap year!!", year);
        }
    }
}
