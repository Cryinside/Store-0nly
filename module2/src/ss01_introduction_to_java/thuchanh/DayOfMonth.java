package ss01_introduction_to_java.thuchanh;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("which month that you want to counts day?");
        int month=scanner.nextInt();
        String s;
        switch (month){
            case 2:
                s="28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                s="31 ngày!!";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                s="30 ngày!!";
                break;
            default:
                s="";

        }
        if (!s.equals("")){
            System.out.printf("the month '%d' has %s days!",month,s);
        }else {
            System.out.print("Invalid input!");
        }
    }
}
