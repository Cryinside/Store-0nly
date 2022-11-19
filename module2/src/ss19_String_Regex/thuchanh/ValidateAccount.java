package ss19_String_Regex.thuchanh;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    private static final String ACCOUNT_REGEX ="^[A-Z]+[_a-z0-9]{6,}$";
    private static final String ACCOUNT_REGEX1 ="^[CAP]+[\\d]{4}[GHIKLM]$";


    public ValidateAccount() {
    }
    public static boolean validate(String regex){
        Pattern pattern=Pattern.compile(ACCOUNT_REGEX1);
        Matcher matcher=pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter account: ");
        String enter=scanner.nextLine();
        boolean isValid=validate(enter);
        if (isValid){
            System.out.println("successful");
        }else {
            System.out.println("failed");
        }
    }
}
