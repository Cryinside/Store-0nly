package Baikiemtra_NguyenThaiDuong.model.service.Impl;

import Baikiemtra_NguyenThaiDuong.model.bean.BankAccount;
import Baikiemtra_NguyenThaiDuong.model.service.IBankAccountService;
import Baikiemtra_NguyenThaiDuong.utils.Regex;
import caseStudy.utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountService implements IBankAccountService {
    public static final String REGEX_SO_TK = "\\d{10}";
    public static final String REGEX_TEN_TK = "^[A-Z][a-z]+$";

    private static List<BankAccount> bankAccountArrayList = new ArrayList<>();
    public BankAccount bankAccount = new BankAccount();
    public static final Scanner scanner = new Scanner(System.in);
    public Regex regex = new Regex();

    @Override
    public void nhap() {
        bankAccount = getBankAccount();
        if (bankAccount.getSoDu() == null){
            System.out.println("nhap that bai");
        }else {
            bankAccountArrayList.add(bankAccount);
            System.out.println("nhap thanh cong");
        }

    }

    @Override
    public void xuat() {
        System.out.println("nhap ten tk");
        String nameTK = scanner.nextLine();
        for (BankAccount i : bankAccountArrayList) {
            if (nameTK.equalsIgnoreCase(i.getTenTK())) {
                System.out.println("So tien trong TK: " + i.getSoDu());
            }else {
                System.out.println("tai khoan "+nameTK+" hien khong co");
            }
        }
    }

    @Override
    public BankAccount getBankAccount() {
        System.out.println("Ten tk: ");
        String tenTK = scanner.nextLine();
        while (!regex.tenTK(tenTK)) {
            System.out.println("nhap lai (chu cai dau phai viet hoa): ");
            tenTK = scanner.nextLine();
        }
        System.out.println("So tk: ");
        String soTK = scanner.nextLine();
        while (!regex.inputSoTK(soTK)) {
            System.out.println("nhap lai (STK phai la 10 chu so): ");
            soTK = scanner.nextLine();
        }

//        System.out.println("nhap so du: ");
//        soDu = Double.parseDouble(scanner.nextLine());
//        while (!regex.soDu(soDu)) {
//            System.out.println("nhap lai (STK phai la 10 chu so): ");
//            soTK = scanner.nextLine();
//        }
        Double soDu = null;
        try {
            do {
                System.out.println("nhap so du: ");
                soDu = Double.parseDouble(scanner.nextLine());
                if (soDu <= 0) {
                    System.out.println("nhap lai ( so du phai lon hon 0 ): ");
                    soDu = Double.parseDouble(scanner.nextLine());
                }
            } while (soDu <= 0);
        }catch (NumberFormatException e){
            System.err.println("So du phai la so");
        }


        return new BankAccount(tenTK, soTK, soDu);
    }

    @Override
    public String inputSoTK() {
        System.out.println("So tk: ");
        return regex.regexData(scanner.nextLine(), REGEX_SO_TK, "nhap lai (STK phai la 10 chu so): ");
    }

    @Override
    public void nap() {
        Double sum = bankAccount.getSoDu();
        System.out.println("nhap ten tk");
        String nameTK = scanner.nextLine();
        Double napTien;
        for (BankAccount i : bankAccountArrayList) {
            if (sum == null) {
                System.out.println("so tien hien tai la 0");
            } else {
                if (nameTK.equalsIgnoreCase(i.getTenTK())) {
                    System.out.println("So tien trong TK: " + i.getSoDu());
                    System.out.println("So tien nap: ");
                    napTien = Double.parseDouble(scanner.nextLine());
                    sum += napTien;
                    i.setSoDu(sum);
                    System.out.println("nap thanh cong");
                }

            }
        }
    }

    @Override
    public void napRandom(String name, List<BankAccount> accountList) {

        Double napTien;
        Double sum ;
            for (int i = 0; i < accountList.size(); i++) {
                if (name.equalsIgnoreCase(accountList.get(i).getTenTK())){
                     sum = accountList.get(i).getSoDu();
                    System.out.println("So tien trong TK: " + accountList.get(i).getSoDu());
                    System.out.println("So tien nap: ");
                    napTien = (Math.random()) * ((200 - 100) + 1) + 500;
//                    napTien = Double.parseDouble(scanner.nextLine());
                    sum += napTien - (sum * 0.01);
                    accountList.get(i).setSoDu(sum);
                    System.out.println("nap thanh cong");
                }

            }


    }

    @Override
    public void rutRandom(String name,List<BankAccount> accountList) {

        Double rutTien;
        Double phiRutTien;
        Double sum ;
        for (int i = 0; i < accountList.size(); i++) {
            if (name.equalsIgnoreCase(accountList.get(i).getTenTK())){
                sum = accountList.get(i).getSoDu();
                System.out.println("So tien trong TK: " + accountList.get(i).getSoDu());
                System.out.println("So tien rut: ");
                rutTien=(Math.random()) * ((2000 - 1000) + 1);
                while (rutTien + (sum * 0.01) > accountList.get(i).getSoDu()) {
                    System.out.println("So du trong tk khong du de rut. Vui long nhap lai: ");
                    rutTien=(Math.random()) * ((2000 - 1000) + 1);
//                rutTien = Double.parseDouble(scanner.nextLine());
                }
                phiRutTien = (rutTien * 1) / 100;
                sum -= rutTien + phiRutTien;
                bankAccount.setSoDu(sum);
                System.out.println("Phi rut tien cua ban la: " + phiRutTien);
                System.out.println("Rut thanh cong. Xin cam on quy khach");
            }

        }
//            System.out.println("So tien trong TK: " + bankAccount.getSoDu());
//            System.out.println("So tien rut: ");
//            rutTien=(Math.random()) * ((2000 - 1000) + 1);
//            while (rutTien + (sum * 0.01) > bankAccount.getSoDu()) {
//                System.out.println("So du trong tk khong du de rut. Vui long nhap lai: ");
//                rutTien=(Math.random()) * ((2000 - 1000) + 1);
////                rutTien = Double.parseDouble(scanner.nextLine());
//            }
//            phiRutTien = (rutTien * 1) / 100;
//            sum -= rutTien + phiRutTien;
//            bankAccount.setSoDu(sum);
//            System.out.println("Phi rut tien cua ban la: " + phiRutTien);
//            System.out.println("Rut thanh cong. Xin cam on quy khach");

    }

    @Override
    public void rut() {
        Double tong = bankAccount.getSoDu();
        Double rutTien;
        Double phiRutTien;
        System.out.println("nhap ten tk");
        String nameTK = scanner.nextLine();
        for (BankAccount i : bankAccountArrayList) {
            if (tong == null) {
                System.out.println("so tien hien tai la 0");
            } else {
                if (nameTK.equalsIgnoreCase(i.getTenTK())) {
                    System.out.println("So tien trong TK: " + i.getSoDu());
                    System.out.println("So tien rut: ");
                    rutTien = Double.parseDouble(scanner.nextLine());
                    while (rutTien > i.getSoDu()) {
                        System.out.println("So du trong tk khong du de rut. Vui long nhap lai: ");
                        rutTien = Double.parseDouble(scanner.nextLine());
                    }
                    phiRutTien = (rutTien * 1) / 100;
                    tong -= rutTien + phiRutTien;
                    i.setSoDu(tong);
                    System.out.println("Phi rut tien cua ban la: " + phiRutTien);
                    System.out.println("Rut thanh cong. Xin cam on quy khach");
                }
            }

        }
    }

    @Override
    public void tinhTong() {
        Double tongSoDu = 0.0;
        for (BankAccount i : bankAccountArrayList) {

            if (i.getSoDu() > 0) {
                tongSoDu += i.getSoDu();
            }
        }
        System.out.println("Tong: " + tongSoDu);
    }

}