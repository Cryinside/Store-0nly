package ss19_String_Regex.thuchanh;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    private static final String NAME_CLASS_REGEX = "^[C|P|A]+[\\d]{4}[GHIKLM]$";

    public ValidateNameClass() {
    }

    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(NAME_CLASS_REGEX);
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
