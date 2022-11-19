package ss14_SortAlthorithm.thuchanh;

import java.util.Arrays;

public class SelectionSort {
    static int[] list = {1, 9, 4, 6, 5, -4};
    public static void main(String[] args) {
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }
    public static void selectionSort(int[] arr){
        int size=arr.length;
        for (int i = 0; i < size-1; i++) {
            int currentMin=arr[i];
            int currentMinIndex=i;
            for (int j = i+1; j < size; j++) {
                if (currentMin<arr[j]){
                    currentMin=arr[j];
                    currentMinIndex=j;
                }
            }
            if (currentMinIndex!=i){
                arr[currentMinIndex]=arr[i];
                arr[i]=currentMin;
            }
        }

    }
}
