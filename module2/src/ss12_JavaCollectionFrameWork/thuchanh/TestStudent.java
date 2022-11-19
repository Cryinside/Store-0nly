package ss12_JavaCollectionFrameWork.thuchanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        HocSinh hocSinh = new HocSinh("Kien", 30, "HT");
        HocSinh hocSinh1 = new HocSinh("Nam", 26, "HN");
        HocSinh hocSinh2 = new HocSinh("Anh", 38, "HT" );
        HocSinh hocSinh3 = new HocSinh("Tung", 38, "HT" );


        List<HocSinh> lists = new ArrayList<HocSinh>();
        lists.add(hocSinh);
        lists.add(hocSinh1);
        lists.add(hocSinh2);
        lists.add(hocSinh3);

        // dung collections.sort(list)
        Collections.sort(lists);
        for(HocSinh hs : lists){
            System.out.println(hs.toString());
        }

        // dung collections.sort(list,comparator)
        SoSanhTuoi soSanhTuoi = new SoSanhTuoi();
        Collections.sort(lists,soSanhTuoi);
        System.out.println("So sanh theo tuoi:");
        for(HocSinh st : lists){
            System.out.println(st.toString());
        }

        /// so sanh theo tuoi dinh nghia phuong thuoc compare ngay tai vi tri can so sanh
        System.out.println("So sanh theo tuoi:");
        Collections.sort(lists, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        for (HocSinh st:lists) {
            System.out.println(st.toString());
        }
    }
}
