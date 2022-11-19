package caseStudy.services.Impl;

import caseStudy.models.Customer;
import caseStudy.models.Employee;
import caseStudy.services.CustomerService;
import caseStudy.utils.WriteReadFileBinary;
import caseStudy.utils.WriteReadFileText;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    final String COMMA = ",";
    private static List<Customer> customerLinkedList = new LinkedList<>();
    //    static WriteReadFileBinary writeReadFileBinary =new WriteReadFileBinary();
    private final String path = "D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\caseStudy\\data\\customer.csv";


    static Scanner scanner = new Scanner(System.in);
    private WriteReadFileText<Customer> customerWriteReadFileText = new WriteReadFileText<>();


    public CustomerServiceImpl() {
        customerLinkedList = getAll();
    }

    public List<Customer> getAll() {
        customerLinkedList.clear();
        List<String> lines = customerWriteReadFileText.readText(path);
        for (String line : lines) {
            String[] arr = line.split(",");
            Customer customer1 = new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], Integer.parseInt(arr[5]), arr[6], arr[7]);
            customerLinkedList.add(customer1);
        }

        return customerLinkedList;
    }

    public void show(List<Customer> customerList) {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-25s %-30s %-30s %-30s %-30s %-30s%n", "ID Customer", "NAME", "GENDER", "EMAIL", "PHONE", "ID CARD");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Customer customer : customerList) {
            System.out.printf("%-25s %-30s %-30s %-30s %-30s %-30s%n", customer.getIDCustomer(), customer.getName(), customer.getGender(), customer.getEmail(), customer.getPhoneNumber(), customer.getIDCard());
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    public void showListCustomer() {
        show(customerLinkedList);
    }


    @Override
    public void displayService() {
//        customerLinkedList= (List<Customer>) writeReadFileBinary.readToFile(path);
//        for (Customer customer : customerLinkedList) {
//            System.out.println(customer.toString());
//        }

    }

    @Override
    public void addNew() {
        getCustomer(0);
        System.out.println("Create successful ");

//        Customer customer = getCustomer();
//        customerLinkedList.add(customer);
//        writeReadFileBinary.writeToFile(customerLinkedList,path);
//        customerWriteReadFileText.writeText(customerLinkedList, path);
//        try (BufferedWriter bf = new BufferedWriter(new FileWriter("D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\customer.txt", true))) {
//            for (Customer i : customerLinkedList) {
//                bf.newLine();
//                bf.write("Name: " + i.name + COMMA + " Email: " + i.email + COMMA + " Gender: " + i.gender + COMMA +
//                        " ID Customer: " + i.IDCustomer + COMMA + " Phone: " + i.phoneNumber);
//                bf.flush();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }

    public void save(Customer customer) {
        if (customer.getIDCustomer() > 0) {
            int index = customerLinkedList.indexOf(customer)+customer.getIDCustomer();
            customerLinkedList.set(index, customer);
//            customerLinkedList.add(customer);

        } else {
            customer.setIDCustomer(customerLinkedList.size() + 1);
            customerLinkedList.add(customer);
        }
        customerWriteReadFileText.writeText(customerLinkedList, path);
    }

    public void getCustomer(int idCus) {
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("Gender: ");
        String gender = scanner.nextLine();
//        System.out.println("ID Customer: ");
//        String idCustomer = scanner.nextLine();
        System.out.println("Address: ");
        String address = scanner.nextLine();
        System.out.println("Type customer: ");
        String typeMember = scanner.nextLine();
        System.out.print("ID card: ");
        String idCard = scanner.nextLine();
        System.out.println("Phone number: ");
        String phone = scanner.nextLine();

        Customer customer = new Customer(name, idCard, phone, email, gender, idCus, typeMember, address);
        save(customer);
    }


    @Override
    public void edit() {
//        Customer customerFound = null;
        showListCustomer();
        System.out.println("Update by ID Employee");
        System.out.print("Enter the employee ID to edit: ");
        int checkId = Integer.parseInt(scanner.nextLine());
        for (Customer customer : customerLinkedList) {
            if (checkId == customer.getIDCustomer()) {
                getCustomer(checkId);
            }
        }
//        getCustomer(checkId);
        System.out.println("Update successful");

//        for (int i = 0; i < customerLinkedList.size(); i++) {
//            if (customerLinkedList.get(i).getIDCustomer().contains(checkId)) {
//                System.out.println("Input update information");
//                Customer customer = getCustomer();
//                customerLinkedList.set(i, customer);
//            } else {
//                System.out.println("Khong tim thay ma nhan vien: " + checkId);
//            }
    }

    @Override
    public void remove() {
        showListCustomer();
        int del = 0;
        System.out.print("Enter the employee ID to edit: ");
        int checkId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerLinkedList.size(); i++) {
            if (checkId == customerLinkedList.get(i).getIDCustomer()) {
                customerLinkedList.remove(i);
//                del=i;

            }
//            for (int j = 0; j < customerLinkedList.size(); j++) {
//                int index=customerLinkedList.indexOf(del);
//                int index1=customerLinkedList.indexOf(j-1);
//                for (Customer idCus:customerLinkedList) {
//                    if (idCus.getIDCustomer()>index){
//                        customerLinkedList.set(index,idCus);
//                    }else {
//                        customerLinkedList.set(index1,idCus);
//                    }
//
//                }
//            }

        }


//        writeReadFileBinary.writeToFile(customerLinkedList,path);
        customerWriteReadFileText.writeText(customerLinkedList, path);
        System.out.println("successful delete");
    }


    @Override
    public void search() {
        displayService();
        System.out.print("nhap ten can tim: ");
        String tmp1 = scanner.nextLine();
        for (Customer customer:customerLinkedList) {
            if (customer.getName().equals(tmp1)) {
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("%-25s %-30s %-30s %-30s %-30s %-30s%n", "ID Customer", "NAME", "GENDER", "EMAIL", "PHONE", "ID CARD");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("%-25s %-30s %-30s %-30s %-30s %-30s%n", customer.getIDCustomer(), customer.getName(), customer.getGender(), customer.getEmail(), customer.getPhoneNumber(), customer.getIDCard());
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
                break;
            }else {
                System.out.println("not found");
            }
        }
    }
}
