package Exam.controllers;

import Exam.services.BNThuongImpl;
import Exam.services.BNVipImpl;
import Exam.utils.UserException;

import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);
    private static BNThuongImpl bnThuong=new BNThuongImpl();
    private static BNVipImpl bnVip=new BNVipImpl();
    public static void main(String[] args) throws UserException {
       displayMainMenu();
    }
    private static void displayMainMenu() throws UserException {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (check) {

            System.out.println("----------------------------");
            System.out.println("1.\tThem moi");
            System.out.println("2.\tXoa");
            System.out.println("3.\tDanh sach cac benh an ");
            System.out.println("4.\tThoat");

            System.out.println("----------------------------");
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("ai dinh dang, nhap lai: ");
                choice = Integer.parseInt(scanner.nextLine());
            }
            switch (choice) {
                case 1:
                    hienThiBNThuong();
                    break;
                case 2:
                    hienThiBNVip();
                    break;
                case 3:
                    bnThuong.danhsach();
                    System.out.println("\n\n\n");
                    bnVip.danhsach();
                    break;
                case 4:
                    System.exit(4);
                    break;
            }
        }
    }
    private static void hienThiBNThuong() throws UserException {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1.\tBenh nhan thuong");
            System.out.println("2.\tBenh nhan vip");
            System.out.println("3\tThoat");
            System.out.print("Chon : ");
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Sai dinh dang, nhap lai: ");
                choice = Integer.parseInt(scanner.nextLine());
            }
            switch (choice) {
                case 1:
                    bnThuong.themMoi();
                    break;
                case 2:
                   bnVip.themMoi();
                    break;
                case 3:
                   backToMenu();
                    break;

            }
        }
    }
    private static void hienThiBNVip() throws UserException{
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1.\tBenh nhan thuong");
            System.out.println("2.\tBenh nhan vip");
            System.out.println("3\tThoat");
            System.out.print("Chon : ");
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Wrong format. Enter again!! ");
                choice = Integer.parseInt(scanner.nextLine());
            }
            switch (choice) {
                case 1:
                    bnThuong.xoa();

                    break;
                case 2:
                    bnVip.xoa();
                    break;
                case 3:
                    backToMenu();
                    break;

            }
        }
    }
    public static void backToMenu() throws UserException {
        System.out.println("Bạn có muốn quay lại menu (Y/N): ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("Y")){
            displayMainMenu();
        } else {
            System.exit(0);
        }
    }
}
