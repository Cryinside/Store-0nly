package Exam.utils;

import Exam.models.BenhAn;
import caseStudy.models.Booking;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BenhNhanComparator implements Comparator<BenhAn>, Serializable {
    @Override
    public int compare(BenhAn o1, BenhAn o2) {
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDate1=LocalDate.parse(o1.getNgayNhapVien(),formatter);
        LocalDate startDate2=LocalDate.parse(o2.getNgayNhapVien(),formatter);
        LocalDate endDate1=LocalDate.parse(o1.getNgayRaVien(),formatter);
        LocalDate endDate2=LocalDate.parse(o2.getNgayRaVien(),formatter);
        if (startDate1.compareTo(startDate2)>0){
            return 1;
        }else if (startDate1.compareTo(startDate2)<0){
            return -1;
        }else {
            if (endDate1.compareTo(endDate2)>0){
                return 1;
            }else if (endDate1.compareTo(endDate2)<0){
                return -1;
            }else {
                return 0;
            }
        }
    }
}
