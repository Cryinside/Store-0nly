package baitapngoai;

public class Student {
        private String ten;
        private String tuoi;
        private int diem;

    public Student() {
    }

    public Student(String ten, String tuoi, int diem) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diem = diem;
    }

    public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            if (ten == null || ten.isEmpty()) {

                this.ten = "Không biết";
            } else {
                this.ten = ten;
            }
        }

        public String getTuoi() {
            if (Integer.valueOf(tuoi) != -1) {

                return tuoi;
            } else {
                return "Tuổi không hợp lệ";
            }
        }

        public void setTuoi(int tuoi) {

            if (tuoi > 18) {
                this.tuoi = String.valueOf(tuoi);
            } else {
                this.tuoi = String.valueOf(-1);
            }
        }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return
                "ten: " + ten  +
                ", tuoi: " + tuoi  +
                ", diem: " + diem ;

    }
}
