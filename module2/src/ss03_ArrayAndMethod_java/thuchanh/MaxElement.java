package ss03_ArrayAndMethod_java.thuchanh;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.println("nhap kich thuoc mang: ");
            size=scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        }while (size >20);
        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("phan thu thu "+(i+1)+":");
            array[i]=scanner.nextInt();
            i++;
        }
        int max=array[0];
        int index=0;
        for (int j=0;j<array.length;j++){
            if (array[j]>max){
                max=array[j];
                index=j+1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
