package ss03_ArrayAndMethod_java.thuchanh;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;

        do {
            System.out.println("nhap kich thuoc mang:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("nhap phan tu thu " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int k = 0; k < array.length / 2; k++) {
            int temp = array[k];
            array[k] = array[size - 1 - k];
            array[size - 1 - k] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
