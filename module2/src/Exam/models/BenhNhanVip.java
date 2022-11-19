package Exam.models;

public class BenhNhanVip extends BenhAn{
    private String loaiBenhNhan;
    private String thoiHan;
    public BenhNhanVip() {
    }

    public BenhNhanVip(int soThutu, String maBenhAn, String maBenhNhan, String ten, String ngayNhapVien, String ngayRaVien, String lyDo, String loaiBenhNhan, String thoiHan) {
        super(soThutu, maBenhAn, maBenhNhan, ten, ngayNhapVien, ngayRaVien, lyDo);
        this.loaiBenhNhan = loaiBenhNhan;
        this.thoiHan = thoiHan;
    }

    public String getLoaiBenhNhan() {
        return loaiBenhNhan;
    }

    public void setLoaiBenhNhan(String loaiBenhNhan) {
        this.loaiBenhNhan = loaiBenhNhan;
    }

    public String getThoiHan() {
        return thoiHan;
    }

    public void setThoiHan(String thoiHan) {
        this.thoiHan = thoiHan;
    }

    @Override
    public String toString() {
        return getSoThutu()+","+getMaBenhAn()+","+getMaBenhNhan()+","+getTen()+","+getNgayNhapVien()+","+getNgayRaVien()+","+getLyDo()+","+getLoaiBenhNhan()+","+getThoiHan();
    }
}
