package ss12_JavaCollectionFrameWork.thuchanh;

import java.util.Comparator;

public class SoSanhTuoi implements Comparator<HocSinh> {
    @Override
    public int compare(HocSinh o1, HocSinh o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() == o2.getAge()) {
            return 0;
        } else {
            return -1;
        }
    }
}

