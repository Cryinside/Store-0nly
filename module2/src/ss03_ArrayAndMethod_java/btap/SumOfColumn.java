package ss03_ArrayAndMethod_java.btap;

import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr;
        int row, col;

        System.out.println("nhap so hang");
        row = scanner.nextInt();
        System.out.println("nhap so cot");
        col = scanner.nextInt();
        arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("phan tu thu [" + i + "]" + "[" + j + "] :");
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }


        int sumOfCol;
        System.out.println("Nhap cot ban muon tinh tong: ");
        sumOfCol = scanner.nextInt();
        int sum = 0;

            for (int rows = 0; rows < arr.length; rows++) {
                sum+=arr[rows][sumOfCol];
            }


        System.out.println("Sum for column " + sumOfCol + " is "
                + sum);
    }
}
