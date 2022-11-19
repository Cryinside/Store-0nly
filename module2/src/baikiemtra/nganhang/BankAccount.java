package Java_NguyenTrungHieu.nganhang;

import java.text.NumberFormat;
import java.util.Scanner;

public class BankAccount {
    String tenTK;
    String soTK;
    Double soDu;

    public BankAccount() {
    }

    public BankAccount(String tenTK, String soTK) {
        this.tenTK = tenTK;
        this.soTK = soTK;
    }

    public BankAccount(String tenTK, String soTK, Double soDu) {
        this.tenTK = tenTK;
        this.soTK = soTK;
        this.soDu = soDu;
    }



    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getSoTK() {
        return soTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    public Double getSoDu() {
        return soDu;
    }

    public void setSoDu(Double soDu) {
        this.soDu = soDu;
    }

    @Override
    public String toString() {
//        return "BA: "+getTenTK()+", "+getSoTK()+", "+getSoDu();

        NumberFormat EN = NumberFormat.getCurrencyInstance();
        String str      = EN.format(this.soDu);
        // return "Tên tài khoản: " + this.tentk + "\n" +
        //        "Số tài khoản: " + this.sotk + "\n" +
        //        "Số dư: " + str;
        return "BA: " + this.tenTK + " : " + this.soTK + " : " + str;
    }
}
