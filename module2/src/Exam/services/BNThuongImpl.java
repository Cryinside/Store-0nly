package Exam.services;

import Exam.models.BenhNhanThuong;
import Exam.utils.BirthDay;
import Exam.utils.Regex;
import Exam.utils.WriteReadCSV;
import caseStudy.models.Customer;
import caseStudy.utils.MyException;
import caseStudy.utils.RegexData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BNThuongImpl implements DichVuBNThuong {
    private static List<BenhNhanThuong> benhNhanThuongLinkedList = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);
    private final String path = "D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\Exam\\data\\benhNhanhThuong.csv";
    private WriteReadCSV<BenhNhanThuong> benhNhanThuongWriteReadCSV = new WriteReadCSV<>();

    public static final String REGEX_STR="^[A-Z][a-z4-50]+$";
    public static final String REGEX_ID_VILLA="(SVVL)-[//d]{4}";
    public static final String REGEX_ID_HOUSE="(SVHO)-[//d]{4}";
    public static final String REGEX_ID_ROOM="(SVRO)-[//d]{4}";
    public static final String REGEX_AREA="^({3,9})\\d|[1-9]\\d{2,}$";
    public static final String REGEX_INT="^[1-9]|([1][0-9])$";
    public static final String REGEX_AMOUNT="^[1-9]|([1][0-9])|(20)$";
    public static final String REGEX_PHONE="^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$";
    public static final String REGEX_MAIL="\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b";
    public static final String REGEX_MA_BA="^BA-\\d{3}$";
    public static final String REGEX_MA_BN="^BN-\\d{3}$";
    public BNThuongImpl() {
        benhNhanThuongLinkedList = getAll();
    }

    public List<BenhNhanThuong> getAll() {
        benhNhanThuongLinkedList.clear();
        List<String> lines = benhNhanThuongWriteReadCSV.readText(path);
        for (String line : lines) {
            String[] arr = line.split(",");
            BenhNhanThuong benhNhanThuong = new BenhNhanThuong(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7]);
            benhNhanThuongLinkedList.add(benhNhanThuong);
        }

        return benhNhanThuongLinkedList;
    }


    public void getBenhNhanThuong(int idCus) {

//        System.out.println("Nhập mã bệnh án ");
//        String maBenhAn = scanner.nextLine();
//        while(!Regex.maBenhAnValidte(maBenhAn)) {
//            System.out.println("Nhập lại");
//            maBenhAn = scanner.nextLine();
//        }
//
//        System.out.println("Nhập mã bệnh nhan ");
//        String maBenhNhan = scanner.nextLine();
//        while(!Regex.maBenhNhanValidte(maBenhNhan)) {
//            System.out.println("Nhập lại");
//            maBenhNhan = scanner.nextLine();
//        }

        String maBenhAn = inputMaBenhAn();

        String maBenhNhan = inputMaBenhNhan();

        String ten = inputTen();

        System.out.print("Ngay nhap vien ");
        String batDau = scanner.nextLine();
        while (!Regex.dateValidate(batDau)){
            System.out.println("nhap lai: ");
            batDau=scanner.nextLine();
        }
        System.out.print("Ngay ra vien: ");
        String ketThuc = scanner.nextLine();
        checkDate(ketThuc);
        System.out.print("Phi nhap vien: ");
        String phi = scanner.nextLine();
        System.out.print("Ly do: ");
        String lyDo = scanner.nextLine();
        BenhNhanThuong benhNhanThuong = new BenhNhanThuong(idCus, maBenhAn, maBenhNhan, ten, batDau, ketThuc, phi, lyDo);

        luu(benhNhanThuong);
    }
    private String inputTen(){
        System.out.print("Ten : ");
        return Regex.regexStr(scanner.nextLine(),REGEX_STR,"Viet hoa chu cai dau: ");
    }
    private String inputMaBenhAn(){
        System.out.print("Ma benh an : ");
        return Regex.regexStr(scanner.nextLine(),REGEX_MA_BA,"BA-XXX, X la so: ");
    }
    private String inputMaBenhNhan(){
        System.out.print("Ma benh nhan : ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_MA_BN,"BN-XXX, X la so: ");
    }

    public void checkDate(String dateOfBirth) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date birthday = null;
        try {
            birthday = format.parse(dateOfBirth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            checkDate(birthday);
        } catch ( BirthDay e) {
            e.printStackTrace();
        }
    }
    public static boolean checkDate(Date birthday) throws BirthDay {
        if (birthday.before(new Date())) {
            return true;
        }

        throw new BirthDay("Ngay ket thuc phai >= ngay bat dau ");
    }


    @Override
    public void themMoi() {
        getBenhNhanThuong(0);
        System.out.println("Them moi thanh cong");
    }

    @Override
    public void sua() {

    }

    @Override
    public void xoa() {
        boolean check=false;
        danhsach();
        System.out.print("nhap ma benh an: ");
        String maBenhan=scanner.nextLine();
        for (int i = 0; i < benhNhanThuongLinkedList.size(); i++) {
            if (maBenhan.equalsIgnoreCase(benhNhanThuongLinkedList.get(i).getMaBenhAn())) {
                benhNhanThuongLinkedList.remove(i);
                check=true;
            }
            benhNhanThuongWriteReadCSV.writeText(benhNhanThuongLinkedList, path);
            System.out.println("xoa thanh cong");
        }
        danhsach();
        if (!check){
            System.out.println("khong ton tai");
            xoa();
        }

    }

    @Override
    public void danhsach() {
        hienThi(benhNhanThuongLinkedList);
    }

    public void hienThi(List<BenhNhanThuong> benhNhanThuongList) {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-25s %-30s %-30s %-30s %-30s %-30s %-30s%n", "STT", "MA BENH AN", "MA BENH NHAN", "TEN", "NGAY VAO", "NGAY RA", "LY DO");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        for (BenhNhanThuong benhNhanThuong : benhNhanThuongList) {
            System.out.printf("%-25s %-30s %-30s %-30s %-30s %-30s %-30s%n", benhNhanThuong.getSoThutu(), benhNhanThuong.getMaBenhAn(), benhNhanThuong.getMaBenhNhan(),
                    benhNhanThuong.getTen(), benhNhanThuong.getNgayNhapVien(), benhNhanThuong.getNgayRaVien(), benhNhanThuong.getPhiNhapVien());
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    public void luu(BenhNhanThuong benhNhanThuong) {
        if (benhNhanThuong.getSoThutu() > 0) {
            int index = benhNhanThuongLinkedList.indexOf(benhNhanThuong) + benhNhanThuong.getSoThutu();
            benhNhanThuongLinkedList.set(index, benhNhanThuong);
//            customerLinkedList.add(customer);

        } else {
            benhNhanThuong.setSoThutu(benhNhanThuongLinkedList.size() + 1);
            benhNhanThuongLinkedList.add(benhNhanThuong);
        }
        benhNhanThuongWriteReadCSV.writeText(benhNhanThuongLinkedList, path);
    }
}
