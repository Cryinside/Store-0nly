package Exam.utils;

import caseStudy.utils.MyException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BirthDay extends Exception {
    public BirthDay() {

    }

    public BirthDay(String message) {
        super(message);
    }

    public void checkDate(String dateOfBirth) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date birthday = null;
        try {
            birthday = format.parse(dateOfBirth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            checkDate(birthday);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
    public static boolean checkDate(Date birthday) throws MyException {
        if (birthday.before(new Date())) {
            return true;
        }

        throw new MyException("Ngay sinh lon hon ngay hien tai ");
    }
}
