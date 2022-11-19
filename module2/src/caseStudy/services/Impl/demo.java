package caseStudy.services.Impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class demo {
    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("nhap ngay sinh");
//        String date=scanner.nextLine();
    }
}
