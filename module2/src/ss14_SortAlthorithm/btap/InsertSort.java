package ss14_SortAlthorithm.btap;

import java.util.Arrays;

public class InsertSort {
    static int[] list = {1, 9, 4, 6, 5, -4};

    public static void main(String[] args) {
        insertSort(list);
        System.out.println(Arrays.toString(list));
    }
    public static void insertSort(int[] arr){
        int size=arr.length;
        for (int i = 1; i < size; i++) {
            int x=arr[i];
            int pos=i;
            while (pos>0 && x<arr[pos-1]){
                arr[pos]=arr[pos-1];
                pos--;
            }
            arr[pos]=x;
        }
    }
}
