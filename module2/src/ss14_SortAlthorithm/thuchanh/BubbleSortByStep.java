package ss14_SortAlthorithm.thuchanh;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong phan tu: ");
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("phan tu thu "+i+" : ");
            arr[i]=scanner.nextInt();
        }
        System.out.println("Truoc khi sx: "+ Arrays.toString(arr));
        bubbleSortByStep(arr);
        System.out.println("Sau khi sx: "+ Arrays.toString(arr));
    }
    public static void bubbleSortByStep(int[] arr){
        boolean check=true;
        int size=arr.length;
        for (int i = 1; i < size && check; i++) {
            check=false;
            for (int j = 0; j < size-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    check=true;
                }

            }
        }
    }

}
