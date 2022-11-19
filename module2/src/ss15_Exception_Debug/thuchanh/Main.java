package ss15_Exception_Debug.thuchanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int n = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + n + " là " + arr[n]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
