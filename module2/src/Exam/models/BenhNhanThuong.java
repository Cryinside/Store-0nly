package Exam.models;

public class BenhNhanThuong extends BenhAn{
    private String phiNhapVien;

    public BenhNhanThuong() {
    }

    public BenhNhanThuong(int soThutu, String maBenhAn, String maBenhNhan, String ten, String ngayNhapVien, String ngayRaVien, String lyDo, String phiNhapVien) {
        super(soThutu, maBenhAn, maBenhNhan, ten, ngayNhapVien, ngayRaVien, lyDo);
        this.phiNhapVien = phiNhapVien;
    }

    public String getPhiNhapVien() {
        return phiNhapVien;
    }

    public void setPhiNhapVien(String phiNhapVien) {
        this.phiNhapVien = phiNhapVien;
    }

    @Override
    public String toString() {
        return getSoThutu()+","+getMaBenhAn()+","+getMaBenhNhan()+","+getTen()+","+getNgayNhapVien()+","+getNgayRaVien()+","+getLyDo()+","+getPhiNhapVien();
    }
}
