package ss03_ArrayAndMethod_java.thuchanh;

import java.util.Scanner;

public class CountTheNumberOfStudents {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr;
        int size;
        do {
            System.out.println("Enter the size(<30): ");
            size=scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        }while (size>30);
        arr=new int[size];
        int i=0;
        while (i<arr.length){
            System.out.println("Enter a mark for the student "+(i+1)+": ");
            arr[i]=scanner.nextInt();
            i++;
        }
        int count=0;
        System.out.println("List of mark");
        for ( int j=0;j<arr.length;j++){
            System.out.print(arr[j]+"\t");
            if (arr[j] >= 5 && arr[j] <= 10){
                count++;
            }
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
