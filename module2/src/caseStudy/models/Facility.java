package caseStudy.models;

import java.io.Serializable;

public abstract class Facility implements Serializable {

    public String nameService;
    public String areaRoomToUse;
    public String rentalFee;
    public String maxPeople;
    public String rentalType;

    public Facility() {
    }

    public Facility(String nameService, String areaRoomToUse, String rentalFee, String maxPeople, String rentalType) {
        this.nameService = nameService;
        this.areaRoomToUse = areaRoomToUse;
        this.rentalFee = rentalFee;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getAreaRoomToUse() {
        return areaRoomToUse;
    }

    public void setAreaRoomToUse(String areaRoomToUse) {
        this.areaRoomToUse = areaRoomToUse;
    }

    public String getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(String rentalFee) {
        this.rentalFee = rentalFee;
    }

    public String getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(String maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }
}
