package ss19_String_Regex.thuchanh;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static EmailExample email;
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String EMAIL_REGEX="^[A-Za-z0-9]+[A-Za-z0-9]*@+[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };
    public EmailExample(){
        pattern= Pattern.compile(EMAIL_REGEX);
    }
    public static boolean validate(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        email = new EmailExample();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhap email: ");
//        String enter=scanner.nextLine();
//        boolean isValid=validate(enter);
//        if (isValid){
//            System.out.println("email hop le");
//        }else {
//            System.out.println("khong hop le");
//        }
        for (String email:validEmail) {
            boolean isValid=validate(email);
            System.out.println("Email is " + email +" is valid: "+ isValid);
        }
        for (String email:invalidEmail) {
            boolean isValid=validate(email);
            System.out.println("Email is " + email +" is valid: "+ isValid);
        }
    }
}
