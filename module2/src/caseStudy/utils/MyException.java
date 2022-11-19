package caseStudy.utils;

import caseStudy.models.Employee;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.SimpleFormatter;

public class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
