package ss03_ArrayAndMethod_java.btap;

import java.util.Scanner;

public class TotalDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr;
        int size;
        do {
            System.out.println("nhap kich thuoc cua ma tran vuong(<20): ");
            size=scanner.nextInt();
            if (size > 20) {
                System.out.println("Vui long nhap lai");
            }
        }while (size>20);
        arr=new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("phan tu thu [" + i + "]" + "[" + j + "] :");
                arr[i][j] = scanner.nextInt();

            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        int totalDiagonal1=0;
        int totalDiagonal2=0;
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                if (i==j){
                    totalDiagonal1+=arr[i][j];
                }
                if (j==size-i-1){
                    totalDiagonal2+=arr[i][j];
                }

            }
        }
        System.out.println("Tong duong cheo chinh cua ma tran la: "+totalDiagonal1);
        System.out.println("Tong duong cheo phu cua ma tran la: "+totalDiagonal2);
    }
}
