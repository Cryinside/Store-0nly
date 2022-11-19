package Exam.models;

import java.io.Serializable;

public abstract class BenhAn implements Serializable {
    private int soThutu;
    private String maBenhAn;
    private String maBenhNhan;
    private String ten;
    private String ngayNhapVien;
    private String ngayRaVien;
    private String lyDo;

    public BenhAn() {
    }

    public BenhAn(int soThutu, String maBenhAn, String maBenhNhan, String ten, String ngayNhapVien, String ngayRaVien, String lyDo) {
        this.soThutu = soThutu;
        this.maBenhAn = maBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.ten = ten;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDo = lyDo;
    }

    public int getSoThutu() {
        return soThutu;
    }

    public void setSoThutu(int soThutu) {
        this.soThutu = soThutu;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    @Override
    public String toString() {
        return getSoThutu()+","+getMaBenhAn()+","+getMaBenhNhan()+","+getTen()+","+getNgayNhapVien()+","+getNgayRaVien()+","+getLyDo();
    }
}
