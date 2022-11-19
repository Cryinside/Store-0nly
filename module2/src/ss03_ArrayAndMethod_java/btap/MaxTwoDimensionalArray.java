package ss03_ArrayAndMethod_java.btap;

import java.util.Scanner;

public class MaxTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr;
        System.out.println("rows: ");
        int row = scanner.nextInt();
        System.out.println("column: ");
        int col = scanner.nextInt();
//        row=new int[a];
//        col=new int[b];
        arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("phan tu thu [" + i + "]" + "[" + j + "] :");
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("phan tu lon nhat trong M2C la: " + max);
    }
}
