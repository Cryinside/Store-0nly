package ss03_ArrayAndMethod_java.btap;

public class MinimumElement {
    public static void main(String[] args) {
        int[] arr={0, 12, 7, 8, 1, 6, 9};
        int index=minArr(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);

    }
    static int minArr(int[] arr){
        int index=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<arr[index]){
                index=i;
            }
        }
        return index;
    }
}
