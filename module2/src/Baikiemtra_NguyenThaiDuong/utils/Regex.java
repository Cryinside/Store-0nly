package Baikiemtra_NguyenThaiDuong.utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_SO_TK="\\d{10}";
    public static final String REGEX_TEN_TK="^[A-Z][a-z]+$";
    public static final String REGEX_SO_DU = "^[0-9][0-9]*$";
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
    public  boolean tenTK(String regex) {
        return Pattern.matches(REGEX_TEN_TK, regex);
    }
    public  boolean inputSoTK(String regex) {
        return Pattern.matches(REGEX_SO_TK, regex);
    }
    public  boolean soDu(String regex) {
        return Pattern.matches(REGEX_SO_DU, regex);
    }
}
