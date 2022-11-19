package ss03_ArrayAndMethod_java.btap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 4, 2, 7, 8, 2, 0, 2, 1};
        int[] arr1 = new int[arr.length - 1];
        System.out.println("nhap phan tu can xoa: ");
        int x = scanner.nextInt();
        int index_del = -1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                count++;
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                i--;
//                index_del = i;
//                break;
                arr[arr.length - count] = 0;
            }
        }
        for (int i = 1; i <= count; i++) {
            arr[arr.length - i] = 0;
        }
        System.out.println(Arrays.toString(arr));
//        int j = 0;
//        int k = 1;
//        if (index_del != -1) {
//            for (int i = index_del; i < arr.length - 1; i++) {
//                arr[index_del + j] = arr[index_del + k];
//                j++;
//                k++;
//            }
//            for (int i = arr.length - 1; i < arr.length; i++) {
//                arr[i] = 0;
//            }
//
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + " ");
//
//            }
//        } else {
//            System.out.println("Ko thaays");
//        }
    }
}
