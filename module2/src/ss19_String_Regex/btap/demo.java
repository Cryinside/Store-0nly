package ss19_String_Regex.btap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String date1 = "09/20/2021";
        String date2 = "09/22/2021";
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date bod=formatter.parse(date1);
        Date bod1=formatter.parse(date2);
        if (bod1.after(bod)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
