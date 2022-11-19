package ss03_ArrayAndMethod_java.btap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1;
        int[] arr2;
        int size;
        do {
            System.out.println("nhap kich thuoc mang(<20): ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Vui long nhap lai");
            }
        } while (size > 20);
        arr1 = new int[size];
        arr2 = new int[size];
        System.out.println("Mang thu nhat!!");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("phan tu thu " + (i + 1) + ": ");
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Mang thu hai!!");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("phan tu thu: " + (i + 1) + ": ");
            arr2[i] = scanner.nextInt();
        }
        int[] arr3 = new int[size + size];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        int h = 0;
        for (int j = arr1.length; j < arr3.length; j++) {
            arr3[j] = arr2[h];
            h++;
        }
        System.out.print("Mang 1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\n");
        System.out.print("Mang 2: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.print("\n");
        System.out.println("Sau khi gop");
        System.out.print("Mang 3: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

    }
}
