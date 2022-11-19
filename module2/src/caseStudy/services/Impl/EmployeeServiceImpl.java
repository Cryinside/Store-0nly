package caseStudy.services.Impl;

import caseStudy.models.*;
import caseStudy.services.EmployeeService;
import caseStudy.utils.MyException;
import caseStudy.utils.WriteReadFileText;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employeeArrayList = new ArrayList<Employee>();
    //    static WriteReadFileBinary writeReadFileBinary =new WriteReadFileBinary();
    private WriteReadFileText<Employee> employeeWriteReadFileText = new WriteReadFileText<>();
    private final String path = "D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\caseStudy\\data\\employee.csv";

    static Scanner scanner = new Scanner(System.in);

    public EmployeeServiceImpl() {
        employeeArrayList = getAll();
    }

    public static void show(List<Employee> employeeList) {
//        Employee employee1=new Employee();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-25s %-30s %-30s %-30s %-30s %-30s%n", "ID", "NAME", "GENDER", "EMAIL", "PHONE", "ID CARD");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Employee employee : employeeList) {
            System.out.printf("%-25s %-30s %-30s %-30s %-30s %-30s%n", employee.getIDEmployee(), employee.getName(), employee.getGender(), employee.getEmail(), employee.getPhoneNumber(), employee.getIDCard());
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    @Override
    public void displayService() {
//        employeeArrayList= (List<Employee>) writeReadFileBinary.readToFile(path);
//        for (Employee employee : employeeArrayList) {
//            System.out.println(employee.toString());
//        }
        show(employeeArrayList);
    }

    @Override
    public void addNew() {
        getEmployee(0);

//        Employee employee = getEmployee();
//        employeeArrayList.add(employee);
        System.out.println("Create successful!");
//        writeReadFileBinary.writeToFile(employeeArrayList,path);
    }


    public List<Employee> getAll() {
        employeeArrayList.clear();
        List<String> lines = employeeWriteReadFileText.readText(path);
        for (String line : lines) {
            String[] arr = line.split(",");
            Employee employee1 = new Employee(arr[0], arr[1], arr[2], arr[3], arr[4], Integer.parseInt(arr[5]), arr[6], arr[7], Integer.parseInt(arr[8]));
            employeeArrayList.add(employee1);
        }
        return employeeArrayList;
    }

    public void save(Employee employee) {

        if (employee.getIDEmployee() > 0) {
            int index = employeeArrayList.indexOf(employee) + employee.getIDEmployee();
            if (index < employeeArrayList.size()) {
                employeeArrayList.set(index, employee);
            }
//            customerLinkedList.add(customer);
        } else {
            employee.setIDEmployee(employeeArrayList.size() + 1);
            employeeArrayList.add(employee);
        }

        employeeWriteReadFileText.writeText(employeeArrayList, path);
    }


    public void getEmployee(int idEmployee) {

        System.out.println("------ ADD NEW EMPLOYEE ---------");

        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("Gender: ");
        String gender = scanner.nextLine();
        System.out.println("Level: ");
        String level = scanner.nextLine();
        System.out.println("Position: ");
        String position = scanner.nextLine();
        System.out.print("ID card: ");
        String idCard = scanner.nextLine();
        System.out.println("Phone number: ");
        String phone = scanner.nextLine();
        System.out.println("Salary: ");
        int salary = Integer.parseInt(scanner.nextLine());
//        Employee employee=new Employee(name,idCard,phone,email,gender,idEmployee,level,position,salary);
//        employeeArrayList.add(employee);

        Employee employee = new Employee(name, idCard, phone, email, gender, idEmployee, level, position, salary);
        save(employee);
//        return employee;
    }

    @Override
    public void remove() {
        displayService();
        System.out.print("Enter the employee ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean checkId = false;
        for (int i = 0; i < employeeArrayList.size(); i++) {
            if (id == employeeArrayList.get(i).getIDEmployee()) {
                employeeArrayList.remove(i);
                System.out.println("successful delete");
                checkId = true;
            }
            employeeWriteReadFileText.writeText(employeeArrayList, path);
        }
        if (!checkId) {
            System.out.println("not found");
            remove();
        }

//        writeReadFileBinary.writeToFile(employeeArrayList,path);


    }

    @Override
    public void edit() {

        Scanner scanner = new Scanner(System.in);
        displayService();
        System.out.println("Update by ID Employee");
        System.out.print("Enter the employee ID to edit: ");

        int id = Integer.parseInt(scanner.nextLine());
        boolean checkId = false;
        for (Employee employee : employeeArrayList) {
            if (employee.getIDEmployee() == id) {
                checkId = true;
                getEmployee(id);
                System.out.println("Chỉnh sửa thành công");
            }
            employeeWriteReadFileText.writeText(employeeArrayList, path);

        }
        if (!checkId) {
            System.out.println("not found");
            edit();
        }


//        for (int i = 0; i < employeeArrayList.size(); i++) {
//            if (checkId == employeeArrayList.get(i).getIDEmployee()) {
//                System.out.println("Input update information");
////                Employee employee = getEmployee(0);
////                employeeArrayList.set(i, employee);
//                getEmployee(0);
//            } else {
//                System.out.println("Employee is not found");
//            }


//        employeeWriteReadFileText.writeText(employeeArrayList,path);


    }

    @Override
    public void search() {
//        boolean check=true;
//        int tmp;
//        do {
//            System.out.println("Enter ID need to search: ");
//             tmp=Integer.parseInt(scanner.nextLine());
//            for (Employee employee:employeeArrayList){
//                if (tmp==employee.getIDEmployee()){
//                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
//                    System.out.printf("%-25s %-30s %-30s %-30s %-30s %-30s%n", "ID", "NAME", "GENDER", "EMAIL", "PHONE", "ID CARD");
//                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
//                    System.out.printf("%-25s %-30s %-30s %-30s %-30s %-30s%n", employee.getIDEmployee(), employee.getName(), employee.getGender(), employee.getEmail(), employee.getPhoneNumber(), employee.getIDCard());
//                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

//                    check=false;
//                    break;
//                }
//                else {
//                    System.out.println("Not found. Enter again: ");
//                     tmp=Integer.parseInt(scanner.nextLine());
//                }
//            }
//        }while (check);

        displayService();
        boolean check = false;
        System.out.print("nhap ten can tim: ");
        String tmp1 = scanner.nextLine();
        for (Employee employee : employeeArrayList) {
            if (employee.getName().equalsIgnoreCase(tmp1)) {
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("%-25s %-30s %-30s %-30s %-30s %-30s%n", "ID", "NAME", "GENDER", "EMAIL", "PHONE", "ID CARD");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("%-25s %-30s %-30s %-30s %-30s %-30s%n", employee.getIDEmployee(), employee.getName(), employee.getGender(), employee.getEmail(), employee.getPhoneNumber(), employee.getIDCard());
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
                check = true;
            }
            employeeWriteReadFileText.writeText(employeeArrayList, path);
        }
        if (!check) {
            System.out.println("not found");
            search();
        }
    }
    public void sortName(){
        Collections.sort(employeeArrayList,Comparator.comparing(Employee::getName));
        displayService();
        System.out.println("Sorted successful");
    }
    public void sortSalary(){
        employeeArrayList.sort(new Employee.SortSalary());
        displayService();
        System.out.println("Sorted successful");
    }
    public void sortNameLength(){
        Collections.sort(employeeArrayList,Comparator.<Employee>
                comparingInt((employee1)->{
            return employee1.getName().length();
        }).thenComparingInt((employee2)->employee2.getName().length()));
        displayService();
        System.out.println("Sorted successful");
    }
    public void checkDate(String dateOfBirth) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date birthday = null;
        try {
            birthday = simpleDateFormat.parse(dateOfBirth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            checkDate(birthday);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public static boolean checkDate(Date birthday) throws MyException {
        if (birthday.before(new Date())) {
            return true;
        }

        throw new MyException("Ngay sinh lon hon ngay hien tai ");
    }

    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }

    }

}




