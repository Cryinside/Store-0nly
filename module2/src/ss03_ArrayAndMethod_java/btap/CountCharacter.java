package ss03_ArrayAndMethod_java.btap;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao 1 chuoi bat ky");
        String str = scanner.nextLine();
//        System.out.println("Nhap ki tu ban muon dem");
//        char c=scanner.nextLine().charAt(0);
        String txt = "Hello\tWorld!";
//        int count=0;
//        for (int i = 0; i < str.length(); i++){
//            if (c==str.charAt(i)){
//                count++;
//            }
//        }

//        for (int i = 0; i < str.length(); i++){
//            if ((c+"").equalsIgnoreCase(str.charAt(i)+"")){
//                count++;
//            }
//        }

//        boolean isCase= c<97;
//        for (int i = 0; i < str.length(); i++){
//            if (c==str.charAt(i)){
//                count++;
//            }else {
//                if (isCase){
//                    if (c+32==str.charAt(i)){
//                        count++;
//                    }
//                }else {
//                    if (c-32==str.charAt(i)){
//                        count++;
//                    }
//                }
//            }
//        }


        int[] count=new int[26];
        for (int i = 0; i < str.length(); i++){
            char c=str.charAt(i);
            if (c>=65 && c<=90){
                count[str.charAt(i)-65]++;
            }else if (c >= 97 && c <= 122){
                count[str.charAt(i) - 97]++;
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.printf("Ky tu %c xuat hien %d lan\n", (char) (i + 65), count[i]);
            }
        }

//        System.out.println("chu "+c+" xuat hien "+count+" lan");
        System.out.println(txt);


    }
}
