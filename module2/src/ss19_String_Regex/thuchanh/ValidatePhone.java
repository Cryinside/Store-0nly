package ss19_String_Regex.thuchanh;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    private static final String PHONE_REGEX = "^\\([\\d]{2}\\)-\\(0[\\d]{9}\\)$";
//^\\([0-9]{3}\\)-[0-9]{3}-[0-9]{4}$
//    ^\([//d]{2}\)-\(0[\d]{9,10}\)$
    public ValidatePhone() {
    }

    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name: ");
        String enter = scanner.nextLine();
        boolean isValid = validate(enter);
        if (isValid) {
            System.out.println("successful");
        } else {
            System.out.println("failed");
        }
    }
}
