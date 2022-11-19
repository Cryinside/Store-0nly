package ss11_DSA_Stack_Queue.btap;

import java.util.Scanner;
import java.util.Stack;

public class DoiThapPhan {
    public static void main(String[] args) {
        System.out.println("Chuong trinh chuyen so thap phan sang so nhi phan");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thap phan can chuyen doi: ");
        int n = scanner.nextInt();
        Stack<Integer> results = new Stack<>();

        while (n != 0) {
            results.push(n % 2);
            n = n/2;
        }

        System.out.println("So nhi phan cua " + n + " : ");
        while (!results.empty()) {
            System.out.print(results.pop());
        }
    }


}
