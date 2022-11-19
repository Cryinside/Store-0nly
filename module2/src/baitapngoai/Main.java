package baitapngoai;

import java.util.Arrays;
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten: ");
        String str = scanner.nextLine();
        String[] res1 = str.split(" ");
        int index;
        int count[] = new int[256];

        int size = res1.length;
        if (str.contains("van")) {
            System.out.println("co");

            for (int i = 0; i < str.length(); i++) {
                count[str.charAt(i)]++;
            }
            char arr[] = new char[str.length()];
            for (int i = 0; i < str.length(); i++) {
                arr[i] = str.charAt(i);
                int flag = 0;
                for (int j = 0; j <= i; j++) {
                    if (str.charAt(i) == arr[j]) {
                        flag++;
                    }
                }
                if (flag==1){
                    System.out.println("Số lần xuất hiện của " + str.charAt(i)
                            + " trong chuỗi:" + count[str.charAt(i)]);
                }
            }
            for (int i = 0; i < size; i++) {
                if (res1[i].contains("van")) {
                    index = i;
                    System.out.println("ten lot van xuat hien o vi tri index: "+index);
                }
                if (res1[i].contains("hong")) {
                    res1[i] = "hang";
                }
            }
        }

        for (String s : res1) {
            System.out.print(s + " ");
        }


//        int res=res1.indexOf("van");
//        System.out.println(res);

//        int index;
//        System.out.println(Arrays.toString(res));
//        for (int i = 0; i < res.length; i++) {
//            if () {
//                index = i;
//                System.out.println("vi tri xuat hien cua tu van la: "+index);
//            }else {
//                System.out.println("Not found");
//            }
//        }


    }
}
