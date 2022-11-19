package Baikiemtra_NguyenThaiDuong.controller;

import Baikiemtra_NguyenThaiDuong.model.service.Impl.BankAccountService;
import Java_NguyenTrungHieu.nganhang.BankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static BankAccountService bankAccountService = new BankAccountService();
    private static List<BankAccount> bankAccountList = new ArrayList<>();

    static {
//        tao so du ngau nhien roi truyen vao tung doi tuong
        Double soDu1 = (Math.random()) * ((2000 - 1000) + 1);
        Double soDu2 = (Math.random()) * ((2000 - 1000) + 1);
        Double soDu3 = (Math.random()) * ((2000 - 1000) + 1);
        Double soDu4 = (Math.random()) * ((2000 - 1000) + 1);

        BankAccount bankAccount1 = new BankAccount("khai", "3234235423", soDu1);
        bankAccountList.add(bankAccount1);
        BankAccount bankAccount2 = new BankAccount("hieu", "2533123423", soDu2);
        bankAccountList.add(bankAccount2);
        BankAccount bankAccount3 = new BankAccount("quynh", "1114123423", soDu3);
        bankAccountList.add(bankAccount3);
        BankAccount bankAccount4 = new BankAccount("hung", "2456123423", soDu4);
        bankAccountList.add(bankAccount4);


//        Double sum = bankAccount1.getSoDu();
//        if (sum == null) {
//            System.out.println("so tien hien tai la 0");
//        } else {
//            System.out.println("So tien trong TK: " + bankAccount1.getSoDu());
//            System.out.println("So tien nap: ");
//            nap = (Math.random()) * ((200 - 100) + 1) + 500;
//
//            sum += nap;
//            bankAccount1.setSoDu(sum);
//            System.out.println("nap thanh cong");
//        }
    }

    public static void main(String[] args) {
//        List<BankAccount> bankAccountList=new ArrayList<>();
//        Double soDu1=(Math.random()) * ((2000-1000) + 1);
//        Double nap;
//        Double rut=(Math.random()) * ((2000-1000) + 1) ;
//        BankAccount bankAccount1=new BankAccount("khai", "3234235423",22.0);
//        bankAccountList.add(bankAccount1);
//        BankAccount bankAccount2=new BankAccount("hieu", "2533123423",1.0);
//        bankAccountList.add(bankAccount2);
//        BankAccount bankAccount3=new BankAccount("quynh", "1114123423",1.0);
//        bankAccountList.add(bankAccount3);
//        BankAccount bankAccount4=new BankAccount("hung", "2456123423",1.0);
//        bankAccountList.add(bankAccount4);
//        Double sum = bankAccount1.getSoDu();


//        if (sum == null) {
//            System.out.println("so tien hien tai la 0");
//        } else {
//            System.out.println("So tien trong TK: " + bankAccount1.getSoDu());
//            System.out.println("So tien nap: ");
//            nap=(Math.random()) * ((200-100) + 1) + 500;
//
//            sum += nap;
//            bankAccount1.setSoDu(sum);
//            System.out.println("nap thanh cong");
//        }



//        ham nap ngau nhien
        napRandom("khai");
        napRandom("hieu");
        napRandom("quynh");
        napRandom("hung");

        //        ham rut ngau nhien
        rutRandom("khai");
        rutRandom("hieu");
        rutRandom("quynh");
        rutRandom("hung");


//        in ra tong so du con lai cua tat ca tai khoan
        Double sum = 0.0;
        for (int i = 0; i < bankAccountList.size(); i++) {
            sum+=bankAccountList.get(i).getSoDu();
        }
        System.out.println("So tien con lai cua tat ca tai khoan: "+sum);

//        nay la khong dung ngau nhien
//        displayMenu();


    }

    public static void displayMenu() {
        boolean check = true;

        int choice = 0;
        while (check) {

            System.out.println("----------------------------");
            System.out.println("1.\tNhap tk");
            System.out.println("2.\tXuat tk");
            System.out.println("3.\tNap tien");
            System.out.println("4.\tRut tien");
            System.out.println("5.\tTinh tong cac tk");
            System.out.println("6.\tExit");
            System.out.println("----------------------------");
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Wrong format. Enter again!! ");
                choice = Integer.parseInt(scanner.nextLine());
            }
            switch (choice) {
                case 1:
                    bankAccountService.nhap();
                    break;
                case 2:
                    bankAccountService.xuat();
                    break;
                case 3:
                    bankAccountService.nap();
                    break;
                case 4:
                    bankAccountService.rut();
                    break;
                case 5:
                    bankAccountService.tinhTong();
                    break;
                case 6:
                    System.exit(5);
                    break;

            }

        }
    }

    public static void napRandom(String name) {

        Double napTien;
        Double sum;
        for (int i = 0; i < bankAccountList.size(); i++) {
            if (name.equalsIgnoreCase(bankAccountList.get(i).getTenTK())) {
                System.out.println("--------------------------------------");
                System.out.println(name);
                sum = bankAccountList.get(i).getSoDu();
                System.out.println("So tien trong TK: " + bankAccountList.get(i).getSoDu());

                napTien = (Math.random()) * ((200 - 100) + 1) + 500;
                System.out.println("So tien nap: "+napTien);
//                    napTien = Double.parseDouble(scanner.nextLine());
                sum += napTien - (sum * 0.01);
                bankAccountList.get(i).setSoDu(sum);
                System.out.println("nap thanh cong");
                System.out.println("--------------------------------------");
            }

        }


    }

    public static void rutRandom(String name) {

        Double rutTien;
        Double phiRutTien;
        Double sum;
        for (int i = 0; i < bankAccountList.size(); i++) {
            if (name.equalsIgnoreCase(bankAccountList.get(i).getTenTK())) {
                System.out.println("--------------------------------------");
                System.out.println(name);
                sum = bankAccountList.get(i).getSoDu();
                System.out.println("So tien trong TK: " + bankAccountList.get(i).getSoDu());

                rutTien = (Math.random()) * ((2000 - 1000) + 1);
                System.out.println("So tien rut: "+rutTien);
                while (rutTien + (sum * 0.01) > bankAccountList.get(i).getSoDu()) {
                    System.out.println("So du trong tk khong du de rut. Vui long nhap lai: ");
                    rutTien = (Math.random()) * ((2000 - 1000) + 1);
//                rutTien = Double.parseDouble(scanner.nextLine());
                }
                phiRutTien = (rutTien * 1) / 100;
                sum -= rutTien + phiRutTien;
                bankAccountList.get(i).setSoDu(sum);
                System.out.println("Phi rut tien cua ban la: " + phiRutTien);
                System.out.println("Rut thanh cong. Xin cam on quy khach");
                System.out.println("--------------------------------------");
            }
        }
    }
}
