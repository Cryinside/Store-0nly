package Baikiemtra_NguyenThaiDuong.model.service;

import Baikiemtra_NguyenThaiDuong.model.bean.BankAccount;

import java.util.List;

public interface IBankAccountService {
    void nhap();

    void xuat();

    BankAccount getBankAccount();

    String inputSoTK();

    void nap();

    void napRandom(String name, List<BankAccount> accountList);

    void rutRandom(String name,List<BankAccount> accountList);

    void rut();

    void tinhTong();

}
