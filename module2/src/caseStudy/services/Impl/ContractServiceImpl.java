package caseStudy.services.Impl;

import caseStudy.models.Booking;
import caseStudy.models.Contract;
import caseStudy.models.Customer;
import caseStudy.services.ContractService;
import caseStudy.utils.WriteReadFileBinary;

import java.util.*;

public class ContractServiceImpl implements ContractService {
    private final WriteReadFileBinary writeReadFileBinary=new WriteReadFileBinary();
    private final String pathContract="D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\caseStudy\\data\\contract.csv";
    static List<Contract> contractList=new ArrayList<>();
    static Scanner scanner=new Scanner(System.in);
    @Override
    public void createContract() {
        Queue<Booking> queue=new LinkedList<>();
        Set<Booking> set=new BookingServiceImpl().getBooking();
        for (Booking booking: set) {
            queue.add(booking);
        }
        Booking booking=queue.poll();
        Customer customer=booking.getInfoCustomer();
        System.out.println("creating a contract for Booking: "+booking.toString());
        System.out.println("creating a contract for Customer: "+customer.name);
        System.out.println("Enter the ID Booking: ");
        int idBooking=Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the ID contract: ");
        int idContract=Integer.parseInt(scanner.nextLine());
        System.out.println("Cash: ");
        Double cash=Double.parseDouble(scanner.nextLine());
        System.out.println("Total payment: ");
        double total=Double.parseDouble(scanner.nextLine());

        Contract contract=new Contract(idBooking,idContract,cash,total);
        contractList.add(contract);
        writeReadFileBinary.writeToFile(contractList,pathContract);



        System.out.println("Successful");




    }
    @Override
    public void displayService() {
        contractList= (List<Contract>) writeReadFileBinary.readToFile(pathContract);
        for (Contract contract: contractList) {
            System.out.println(contract.toString());
        }
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


}
