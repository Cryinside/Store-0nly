package ss13_SearchAlthorithm.thuchanh;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("nhap so ban can tim trong mang: ");
//        int n=scanner.nextInt();
//        System.out.println("Vi tri cua "+n+" : "+binarySearch(list,n));

    }
    static int binarySearch(int[] arr, int key){
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if (key<arr[mid]){
                high=mid-1;
            }else if (key>arr[mid]){
                low=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}

