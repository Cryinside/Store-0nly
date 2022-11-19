package caseStudy.models;

import java.io.Serializable;
import java.time.DayOfWeek;

public class Booking implements Serializable {
    private Integer idBooking;
    private String dayStart;
    private String dayEnd;
    private Customer infoCustomer;
    private Facility infoService;

    public Booking() {
    }

    public Booking(Integer idBooking, String dayStart, String dayEnd, Customer infoCustomer, Facility infoService) {
        this.idBooking = idBooking;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.infoCustomer = infoCustomer;
        this.infoService = infoService;
    }

    public Booking(Integer idBooking) {
        this.idBooking=idBooking;
    }

    public Integer getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(Integer idBooking) {
        this.idBooking = idBooking;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public Customer getInfoCustomer() {
        return infoCustomer;
    }

    public void setInfoCustomer(Customer infoCustomer) {
        this.infoCustomer = infoCustomer;
    }

    public Facility getInfoService() {
        return infoService;
    }

    public void setInfoService(Facility infoService) {
        this.infoService = infoService;
    }


    @Override
    public String toString() {
        return "Booking: " +
                "idBooking=" + idBooking +
                ", dayStart='" + dayStart + '\'' +
                ", dayEnd='" + dayEnd + '\'' +
                ", infoCustomer=" + infoCustomer +
                ", infoService=" + infoService ;
    }
}
