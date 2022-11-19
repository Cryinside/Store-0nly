package Exam.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    static Scanner scanner = new Scanner(System.in);
    public static final String MA_BENH_AN = "^BA-\\d{3}$";
    public static final String MA_BENH_NHAN = "^BN-\\d{3}$";
    private static final String DATE_FORMAT = "d/M/yyyy";
    public static String regexStr(String temp, String regex, String error){
        boolean check = false;
        do {
            if (Pattern.matches(regex,temp)){
                check=false;
                break;
            }else {
                System.out.print(error);
                temp=scanner.nextLine();
            }
        }while (check);
        return temp;
    }
    public static boolean maBenhAnValidte(String regex) {
        return Pattern.matches(MA_BENH_AN, regex);
    }
    public static boolean maBenhNhanValidte(String regex) {
        return Pattern.matches(MA_BENH_NHAN, regex);
    }

    public static boolean dateValidate(String date) {
        //set là true thì bạn input date string là 31/2/2019 -> nó sẽ tự động hiểu là 3 ngày sau ngày 28/2/2019
        // -> thành ra 3/3/2019
        //Trong trường hợp này bạn sẽ muốn nó bắn về lỗi => setLenient là false
        //Mặc định nếu bạn dùng parse là SimpleDateFormat thì nó là true
        //setLenient không trả về giá trị gì cả
        DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        dateFormat.setLenient(false);

        try{
            dateFormat.parse(date);
        }catch (ParseException e) {
            return false;
        }
        return true;
    }
    public static int compareDate(String date1, String date2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate checkIn = LocalDate.parse(date1,formatter);
        LocalDate checkOut = LocalDate.parse(date2,formatter);

        if(checkIn.compareTo(checkOut) > 0) {
            //checkIn(date1) sau(nhỏ hơn) checkOut(date2)
            return -1;
        }else if(checkIn.compareTo(checkOut) < 0) {
            //checkIn(date1) trước(lớn hơn) checkOut(date2)
            return 1;
        }else {
            //checkIn và checkOut trùng ngày
            return 0;
        }
    }

}
