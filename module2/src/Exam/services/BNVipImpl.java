package Exam.services;

import Exam.models.BenhNhanThuong;
import Exam.models.BenhNhanVip;
import Exam.utils.WriteReadCSV;
import caseStudy.utils.RegexData;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BNVipImpl implements DVBenhNhanVip {
    private static List<BenhNhanVip> benhNhanVipLinkedList = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);
    private final String path = "D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\Exam\\data\\benhNhanVip.csv";
    private WriteReadCSV<BenhNhanVip> benhNhanThuongWriteReadCSV = new WriteReadCSV<>();

    public static final String REGEX_STR="^[A-Z][a-z4-50]+$";
    public static final String REGEX_ID_VILLA="(SVVL)-[//d]{4}";
    public static final String REGEX_ID_HOUSE="(SVHO)-[//d]{4}";
    public static final String REGEX_ID_ROOM="(SVRO)-[//d]{4}";
    public static final String REGEX_AREA="^({3,9})\\d|[1-9]\\d{2,}$";
    public static final String REGEX_INT="^[1-9]|([1][0-9])$";
    public static final String REGEX_AMOUNT="^[1-9]|([1][0-9])|(20)$";
    public static final String REGEX_PHONE="^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$";
    public static final String REGEX_MAIL="\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b";
    public static final String REGEX_MA="^[BA]+[\\d]{3}$";


    public BNVipImpl() {
        benhNhanVipLinkedList = getAll();
    }

    public List<BenhNhanVip> getAll() {
        benhNhanVipLinkedList.clear();
        List<String> lines = benhNhanThuongWriteReadCSV.readText(path);
        for (String line : lines) {
            String[] arr = line.split(",");
            BenhNhanVip benhNhanVip = new BenhNhanVip(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7],arr[8]);
            benhNhanVipLinkedList.add(benhNhanVip);
        }

        return benhNhanVipLinkedList;
    }

    public void getBenhNhanVip(int idCus) {

        String maBenhAn = inputMaBenhNhan();

        String maBenhNhan = inputMaBenhAn();

        String ten = inputTen();
        System.out.println("Ngay nhap vien ");
        String batDau = scanner.nextLine();
        System.out.print("Ngay ra vien: ");
        String ketThuc = scanner.nextLine();
        System.out.println("Ly do: ");
        String lyDo = scanner.nextLine();
        System.out.println("Loai benh nhan: ");
        String loai = scanner.nextLine();
        System.out.println("Ly do: ");
        String thoiHan = scanner.nextLine();
        BenhNhanVip benhNhanVip = new BenhNhanVip(idCus, maBenhAn, maBenhNhan, ten, batDau, ketThuc, lyDo,loai,thoiHan);

        luu(benhNhanVip);
    }

    private String inputTen(){
        System.out.println("Ten : ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_STR,"Viet hoa chu cai dau: ");
    }
    private String inputMaBenhAn(){
        System.out.println("Ma benh an : ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_MA,"BA-XXX, X la so: ");
    }
    private String inputMaBenhNhan(){
        System.out.println("Ma benh nhan : ");
        return RegexData.regexStr(scanner.nextLine(),REGEX_MA,"BA-XXX, X la so: ");
    }
    public void luu(BenhNhanVip benhNhanVip) {
        if (benhNhanVip.getSoThutu() > 0) {
            int index = benhNhanVipLinkedList.indexOf(benhNhanVip) + benhNhanVip.getSoThutu();
            benhNhanVipLinkedList.set(index, benhNhanVip);

        } else {
            benhNhanVip.setSoThutu(benhNhanVipLinkedList.size() + 1);
            benhNhanVipLinkedList.add(benhNhanVip);
        }
        benhNhanThuongWriteReadCSV.writeText(benhNhanVipLinkedList, path);
    }
    public void hienThi(List<BenhNhanVip> benhNhanVipLinkedList) {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-25s %-30s %-30s %-30s %-30s %-30s %-30s %-30s %-30s%n", "STT", "MA BENH AN", "MA BENH NHAN", "TEN", "NGAY VAO", "NGAY RA", "LY DO","LOAI", "THOI HAN");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        for (BenhNhanVip benhNhanVip : benhNhanVipLinkedList) {
            System.out.printf("%-25s %-30s %-30s %-30s %-30s %-30s %-30s %-30s %-30s%n", benhNhanVip.getSoThutu(), benhNhanVip.getMaBenhAn(), benhNhanVip.getMaBenhNhan(),
                    benhNhanVip.getTen(), benhNhanVip.getNgayNhapVien(), benhNhanVip.getNgayRaVien(), benhNhanVip.getLyDo(), benhNhanVip.getLoaiBenhNhan(),benhNhanVip.getThoiHan());
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    @Override
    public void themMoi() {
        getBenhNhanVip(0);
        System.out.println("them thanh cong");
    }

    @Override
    public void sua() {

    }

    @Override
    public void xoa() {
        danhsach();
        boolean check=false;
        System.out.print("nhap ma benh an: ");
        String maBenhan=scanner.nextLine();
        for (int i = 0; i < benhNhanVipLinkedList.size(); i++) {
            if (maBenhan.equalsIgnoreCase(benhNhanVipLinkedList.get(i).getMaBenhAn())) {
                benhNhanVipLinkedList.remove(i);
                check=true;
            }
            benhNhanThuongWriteReadCSV.writeText(benhNhanVipLinkedList, path);
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
        hienThi(benhNhanVipLinkedList);
    }
}
