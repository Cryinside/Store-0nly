package ss03_ArrayAndMethod_java.btap;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr={10,4,6,7,8,6,0,0,0};
        System.out.println("nhap gia tri can chen: ");
        int value=scanner.nextInt();
        System.out.println("nhap vi tri can chen: ");
        int index=scanner.nextInt();
        int j=1,k=0;
//        int i=arr.length-1;i>index;i--
//        int i=index;i<arr.length;i++
        for (int i=arr.length-1;i>index;i--){
            if (index<=1 && index >= arr.length-1){
                System.out.println("khong chen duoc phan tu");
            }else {
//                arr[i+1]=arr[i];
                arr[i]=arr[i-1];

            }

        }
        arr[index]=value;
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
