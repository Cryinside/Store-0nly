package caseStudy.services.Impl;

import caseStudy.models.*;
import caseStudy.services.BookingService;
import caseStudy.utils.BookingComparator;
import caseStudy.utils.MyException;
import caseStudy.utils.WriteReadFileBinary;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner scanner = new Scanner(System.in);

    //    static WriteReadFileBinary writeReadFileBinaryStatic =new WriteReadFileBinary();
    static WriteReadFileBinary writeReadFileBinary = new WriteReadFileBinary();
//    private final WriteReadFileBinary writeReadFileBinary = new WriteReadFileBinary();

    private final String pathBooking = "D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\caseStudy\\data\\booking.csv";
    private static final String pathCustomer = "D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\caseStudy\\data\\customer.csv";
    private static final String pathVilla = "D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\caseStudy\\data\\villa.csv";
    private static final String pathRoom = "D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\caseStudy\\data\\room.csv";
    private static final String pathHouse = "D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\caseStudy\\data\\house.csv";

    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

    static List<Villa> villaList = new ArrayList<>();
    static List<Room> roomArrayList = new ArrayList<>();
    static List<House> houseArrayList = new ArrayList<>();
    static List<Customer> customerList = new ArrayList<>();

    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<Facility, Integer>();


    static {

//        customerList.add(new Customer("hieu",1132,"09123","hieu123@",
//                "nam","hieupro132","vjp","ngo quyen"));
//        customerList.add(new Customer("khai",3122,"094","khai321@",
//                "nu","khaingok33","bth","ngo quyen"));
//        customerList.add(new Customer("trung",3243,"31314","trunghe23@",
//                "nu","trungga99","ngheo","hai chau"));
//        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\customer.txt"));) {
//            String line=null;
//            line=reader.readLine();
//            while ((line = reader.readLine()) != null){
//                System.out.println(line);
//
//            }
//            reader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        facilityIntegerMap.put(new Villa("vl01", "230m2", 1000, 5,
//                "thang", "vjp", "40", 4), 0);
//        facilityIntegerMap.put(new Villa("vl03", "77m2", 2000, 15,
//                "ngay", "vjp", "34", 3), 0);
//        facilityIntegerMap.put(new Villa("vl33", "100m2", 2500, 20,
//                "nam", "vjp", "23", 2), 0);


    }

    public Set<Booking> getBooking() {
        return bookingSet;
    }

    @Override
    public void displayService() {
//        facilityIntegerMap= (Map<Facility, Integer>) writeReadFileBinary.readToFile(path);
        bookingSet = (Set<Booking>) writeReadFileBinary.readToFile(pathBooking);
        for (Booking booking : bookingSet) {
            System.out.println(booking.toString());
        }
    }

    @Override
    public void addNew() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Start date: ");
        String startDate = scanner.nextLine();
        System.out.println("End date: ");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(id, startDate, endDate, customer, facility);

        bookingSet.add(booking);
        writeReadFileBinary.writeToFile(bookingSet, pathBooking);
        System.out.println("Congratulations on your successful booking");


    }

    @Override
    public void edit() {

    }

    @Override
    public void remove() {

    }

    public static Customer chooseCustomer() {

        System.out.println("List the customer");
//        customerList = (List<Customer>) WriteReadFileBinary.readToFileStatic(pathCustomer);
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.showListCustomer();
//        for (Customer i : customerList) {
//            System.out.println(i.toString());
//        }
        System.out.println("Enter the ID Customer: ");
        int idCustomer = scanner.nextInt();
        boolean check = true;
        while (true) {
            for (Customer customer : customerList) {
                if (idCustomer == customer.getIDCustomer()) {
                    check = false;
                    return customer;
                }
            }
            if (check) {
                System.out.println("khong tim thay " + idCustomer + ". Vui long nhap lai: ");
                idCustomer = scanner.nextInt();
            }
        }

    }

    public static Facility chooseFacility() {

        System.out.println("List the facility");
//        facilityIntegerMap= writeReadFileBinary.readToFile1(pathFacility);
//        bookingSet= (Set<Booking>) writeReadFileBinary.readToFile(pathFacility);
//        for (Booking booking : bookingSet) {
//            System.out.println(booking.toString());
//        }
//        for (Map.Entry<Facility, Integer> i : facilityIntegerMap.entrySet()) {
//            System.out.println(i.getKey().toString());
//        }
        villaList = (List<Villa>) WriteReadFileBinary.readToFileStatic(pathVilla);
        roomArrayList = (List<Room>) WriteReadFileBinary.readToFileStatic(pathRoom);

        houseArrayList = (List<House>) WriteReadFileBinary.readToFileStatic(pathHouse);
        for (Villa i : villaList) {
            System.out.println(i.toString());
        }
        for (Room room : roomArrayList) {
            System.out.println(room.toString());
        }
        for (House house : houseArrayList) {
            System.out.println(house.toString());
        }
        System.out.println("Enter the name Facility: ");
        String nameService = scanner.nextLine();
        boolean check = true;
        while (true) {
            for (Villa villa : villaList) {
                if (nameService.equals(villa.nameService)) {
                    check = false;
                    return villa;
                }
            }
            for (Room room : roomArrayList) {
                if (nameService.equals(room.nameService)) {
                    check = false;
                    return room;
                }
            }
            for (House house : houseArrayList) {
                if (nameService.equals(house.nameService)) {
                    check = false;
                    return house;
                }
            }

//            for (Map.Entry<Facility, Integer> i : facilityIntegerMap.entrySet()) {
//                if (idService.equals(i.getKey().nameService)) {
//                    check = false;
//                    return i.getKey();
//                }
//            }
            if (check) {
                System.out.println("khong tim thay " + nameService + ". Vui long nhap lai: ");
                nameService = scanner.nextLine();
            }
        }

    }


}
