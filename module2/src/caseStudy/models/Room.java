package caseStudy.models;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String nameService, String areaRoomToUse, String rentalFee, String maxPeople, String rentalType, String freeService) {
        super(nameService, areaRoomToUse, rentalFee, maxPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return getNameService()+","+getAreaRoomToUse()+","+getRentalFee()+","+getMaxPeople()+","+getRentalType()+","+getFreeService();
    }
}

