package caseStudy.models;

public class Villa extends Facility{
    private String standardRoom;
    private String PoolArea;
    private String floorNumber;

    public Villa() {
    }

    public Villa(String nameService, String areaRoomToUse, String rentalFee, String maxPeople, String rentalType, String standardRoom, String poolArea, String floorNumber) {
        super(nameService, areaRoomToUse, rentalFee, maxPeople, rentalType);
        this.standardRoom = standardRoom;
        this.PoolArea = poolArea;
        this.floorNumber = floorNumber;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getPoolArea() {
        return PoolArea;
    }

    public void setPoolArea(String poolArea) {
        PoolArea = poolArea;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return getNameService()+","+getAreaRoomToUse()+","+getRentalFee()+","+getMaxPeople()+","+getRentalType()+","+
                getStandardRoom()+","+getPoolArea()+","+getFloorNumber();
    }
}
