package ss14_SortAlthorithm.thuchanh;

import java.util.Arrays;

public class BubleSort {
    static int arr[]={2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void main(String[] args) {
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubbleSort(int[] list){
        boolean needNextPass=true;
        int n=list.length;
        for (int i = 1; i < n && needNextPass; i++) {
            needNextPass=false;
            for (int j = 0; j < n-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    needNextPass=true;
                }
            }
        }
    }
}
