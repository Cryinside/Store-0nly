package ss02_loop_java.btap;

import java.util.Scanner;

public class BaiDocArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int x = 5;
        int[][] matrix = new int[10][10];
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];

            }
        }
        System.out.println("Sum is " + total);
        for (int column = 0; column < matrix[0].length; column++) {
            int total1=0;
            for (int row = 0; row < matrix.length; row++) {
                total1 += matrix[row][column];

            }
            System.out.println("Sum for column " + column + " is "
                    + total1);
        }


        int maxRow = 0;
        int indexOfMaxRow = 0;

// Get sum of the first row in maxRow
        for (int column = 0; column < matrix[0].length; column++) {
            maxRow += matrix[0][column];
        }
        for (int row = 1; row < matrix.length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++){
                totalOfThisRow += matrix[row][column];
                if (totalOfThisRow > maxRow) {
                    maxRow = totalOfThisRow;
                    indexOfMaxRow = row;
                }
            }
            System.out.println("\nSum for row " + row + " is "
                    + totalOfThisRow);
        }
        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int i1 = (int) (Math.random() * matrix.length);
                int j1 = (int) (Math.random() * matrix[i].length);

                // Swap matrix[i][j] with matrix[i1][j1]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i1][j1];
                matrix[i1][j1] = temp;
                System.out.print(matrix[i1][j1] + " ");
            }
            System.out.println();
        }
    }
}
