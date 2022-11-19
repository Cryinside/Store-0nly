package ss03_ArrayAndMethod_java.thuchanh;

import java.util.Scanner;

public class FindElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list={"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.print("Enter a name’s student:");
        String input_name = scanner.nextLine();
        boolean isExit=false;
        for (int i = 0; i < list.length; i++){
            if (list[i].equals(input_name)){
                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
                isExit=true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("Not found" + input_name + " in the list.");
        }
    }
}
