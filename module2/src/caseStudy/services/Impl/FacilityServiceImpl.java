package caseStudy.services.Impl;

import caseStudy.models.*;
import caseStudy.services.FacilityService;
import caseStudy.utils.RegexData;
import caseStudy.utils.WriteReadFileBinary;
import caseStudy.utils.WriteReadFileText;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    static Scanner scanner = new Scanner(System.in);

    public static final String REGEX_STR="^[A-Z][a-z4-50]+$";
    public static final String REGEX_ID_VILLA="(SVVL)-[//d]{4}";
    public static final String REGEX_ID_HOUSE="(SVHO)-[//d]{4}";
    public static final String REGEX_ID_ROOM="(SVRO)-[//d]{4}";
    public static final String REGEX_AREA="^({3,9})\\d|[1-9]\\d{2,}$";
    public static final String REGEX_INT="^[1-9]|([1][0-9])$";
    public static final String REGEX_AMOUNT="^[1-9]|([1][0-9])|(20)$";
    public static final String REGEX_PHONE="^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$";
    public static final String REGEX_MAIL="\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b";
    static List<Villa> villaArrayList = new ArrayList<>();
    static List<Room> roomArrayList = new ArrayList<>();
    static List<House> houseArrayList = new ArrayList<>();
    static Map<Facility,Integer> facilityIntegerMap=new LinkedHashMap<Facility,Integer>();
//    static WriteReadFileBinary writeReadFileBinary =new WriteReadFileBinary();

    private WriteReadFileText<Villa> villaWriteReadFileText=new WriteReadFileText<>();
    private WriteReadFileText<House> houseWriteReadFileText=new WriteReadFileText<>();
    private WriteReadFileText<Room> roomWriteReadFileText=new WriteReadFileText<>();

    private final String path="D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\caseStudy\\data\\villa.csv";
    private final String path1="D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\caseStudy\\data\\room.csv";
    private final String path2="D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\caseStudy\\data\\house.csv";

    public Villa getVilla(){
        System.out.println("------ ADD NEW VILLA ---------");


        String nameService = inputName();

        String areaRoom = inputArea();

        String inputFee=inputFee();

        String maxPeople = inputAmountPeople();

        String rentalType = inputRentalType();

        String standard = inputStandard();

        String poolArea = inputPool();

        String floor = inputFloor();

        return new Villa(nameService,areaRoom,inputFee,maxPeople,rentalType,standard,poolArea,floor);
    }
    private String inputName(){
        System.out.println("Name Service : ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_STR,"capitalize first letter. Enter again!: ");
    }
    private String inputRentalType(){
        System.out.println("Rental type: ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_STR,"capitalize first letter. Enter again!: ");
    }
    private String inputStandard(){
        System.out.println("Standard room: ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_STR,"capitalize first letter. Enter again!: ");
    }
    private String inputArea(){
        System.out.println("Area room: ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_AREA,"Must be bigger 30. Enter again!: ");
    }
    private String inputPool(){
        System.out.println("Pool area: ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_AREA,"Must be bigger 30. Enter again!: ");
    }
    private String inputFee(){
        System.out.println("Rental fee: ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_INT,"Must be bigger 0. Enter again!: ");
    }
    private String inputFloor(){
        System.out.println("Floor number: ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_INT,"Must be bigger 0. Enter again!: ");
    }
    private String inputAmountPeople(){
        System.out.println("Maximum people: ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_AMOUNT,"Must be < 0 && < 20. Enter again: ");
    }
    public Room getRoom(){
        System.out.println("------ ADD NEW ROOM ---------");
        String nameService = inputName();

        String areaRoom = inputArea();

        String inputFee=inputFee();

        String maxPeople =inputAmountPeople();

        String rentalType =inputRentalType();

        System.out.println("Free service: ");
        String freeService = scanner.nextLine();

        return new Room(nameService,areaRoom,inputFee,maxPeople,rentalType,freeService);
    }
    public House getHouse(){
        System.out.println("------ ADD NEW HOUSE ---------");

        String nameService = inputName();

        String areaRoom = inputArea();

        String fee = inputFee();

        String maxPeople = inputAmountPeople();

        String rentalType = inputRentalType();

        String standard = inputStandard();

        String floor = inputFloor();

        return new House(nameService,areaRoom,fee,maxPeople,rentalType,standard,floor);
    }

    public FacilityServiceImpl() {
        villaArrayList=getAllVilla();
        roomArrayList=getAllRoom();
        houseArrayList=getAllHouse();
    }

    public List<Villa> getAllVilla(){
        List<String> lines=villaWriteReadFileText.readText(path);
        for (String line: lines) {
            String[] arr=line.split(",");
            Villa villa=new Villa(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7]);
            villaArrayList.add(villa);
        }
        return villaArrayList;
    }
    public List<Room> getAllRoom(){
        List<String> lines=roomWriteReadFileText.readText(path1);
        for (String line: lines) {
            String[] arr=line.split(",");
            Room room=new Room(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]);
            roomArrayList.add(room);
        }
        return roomArrayList;
    }
    public List<House> getAllHouse(){
        List<String> lines=houseWriteReadFileText.readText(path2);
        for (String line: lines) {
            String[] arr=line.split(",");
            House house=new House(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6]);
            houseArrayList.add(house);
        }
        return houseArrayList;
    }
    public void show1(List<Villa> villaList){
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s %-20s %-20s%n", "NAME", "AREA ROOM", "RENTAL FEE", "MAX PEOPLE", "RENTAL TYPE", "STANDARD ROOM", "POOL AREA", "FLOOR NUMBER");

        for (Villa villa : villaList) {
            System.out.printf("%-11s %-22s %-21s %-21s %-21s %-21s %-21s %-21s%n", villa.getNameService(), villa.getAreaRoomToUse(), villa.getRentalFee(),
                    villa.getMaxPeople(), villa.getRentalType(), villa.getStandardRoom(),villa.getPoolArea(),villa.getFloorNumber());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");

    }
    public void show2(List<Room> roomList){
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s%n", "NAME", "AREA ROOM", "RENTAL FEE", "MAX PEOPLE", "RENTAL TYPE", "FREE SERVICE");

        for (Room room : roomList) {
            System.out.printf("%-11s %-22s %-21s %-21s %-21s %-21s%n", room.getNameService(), room.getAreaRoomToUse(), room.getRentalFee(),
                    room.getMaxPeople(), room.getRentalType(), room.getFreeService());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");

    }
    public void show3(List<House> houseList){
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s %-20s%n", "NAME", "AREA ROOM", "RENTAL FEE", "MAX PEOPLE", "RENTAL TYPE", "STANDARD ROOM", "FLOOR NUMBER");

        for (House house : houseList) {
            System.out.printf("%-11s %-22s %-21s %-21s %-21s %-21s %-21s%n", house.getNameService(), house.getAreaRoomToUse(), house.getRentalFee(),
                    house.getMaxPeople(), house.getRentalType(), house.getStandardRoom(),house.getFloorNumber());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");

    }
    @Override
    public void displayService() {
//        villaArrayList= (List<Villa>) writeReadFileBinary.readToFile(path);
//        roomArrayList= (List<Room>) writeReadFileBinary.readToFile(path1);
//
//        houseArrayList= (List<House>) writeReadFileBinary.readToFile(path2);

        show1(villaArrayList);
        System.out.println("\n\n\n");
        show2(roomArrayList);
        System.out.println("\n\n\n");
        show3(houseArrayList);
//        facilityIntegerMap= (Map<Facility, Integer>) writeReadFileBinary.readToFile1(path);
//        for (Map.Entry<Facility, Integer> villa: facilityIntegerMap.entrySet()) {
//            System.out.println(villa.getKey()+" Times: "+villa.getValue());
//        }

    }

    @Override
    public void addNew() {


    }

    @Override
    public void edit() {

    }

    @Override
    public void remove() {

    }

    @Override
    public void display() {

    }

    @Override
    public void addNewVilla() {
        Villa villa=getVilla();
        facilityIntegerMap.put(villa,0);
        villaArrayList.add(villa);
//        writeReadFileBinary.writeToFile(villaArrayList,path);
        villaWriteReadFileText.writeText(villaArrayList,path);
        System.out.println("Congratulations. Thanks for believe in");
    }

    @Override
    public void addNewRoom() {
        Room room=getRoom();
        facilityIntegerMap.put(room,0);
        roomArrayList.add(room);
        roomWriteReadFileText.writeText(roomArrayList,path1);
//        writeReadFileBinary.writeToFile(roomArrayList,path1);
//        writeReadFileBinary.writeToFile1( facilityIntegerMap,path);
        System.out.println("Congratulations. Thanks for believe in");

    }

    @Override
    public void addNewHouse() {
        House house=getHouse();
        facilityIntegerMap.put(house,0);
        houseArrayList.add(house);
        houseWriteReadFileText.writeText(houseArrayList,path2);
//        writeReadFileBinary.writeToFile(houseArrayList,path2);
//        writeReadFileBinary.writeToFile1(facilityIntegerMap,path);
        System.out.println("Congratulations. Thanks for believe in");

    }
}
