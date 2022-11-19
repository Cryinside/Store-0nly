package baikiemtra.Java_NguyenThaiDuong.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexAccount {
    static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_SO_TK="\\d{10}";
    public static final String REGEX_TEN_TK="^[A-Z][a-z]+$";
    public static String regexData(String temp, String regex, String error){
        boolean check = false;
        do {
            if (temp.matches(regex)){
                check=false;
                break;
            }else {
                System.out.print(error);
                temp=scanner.nextLine();
            }
        }while (check);
        return temp;
    }
    public static boolean tenTK(String regex) {
        return Pattern.matches(REGEX_TEN_TK, regex);
    }
    public static boolean inputSoTK(String regex) {
        return Pattern.matches(REGEX_SO_TK, regex);
    }
}
