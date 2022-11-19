package baitapngoai;

import java.util.*;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Student> studentList=new ArrayList<>();
        Student student=new Student("Tran Van Hung","23",9);
        Student student1=new Student("Nguyen Thi Hoa","12",6);
        Student student2=new Student("Tran Thi Thu Hoa","33",7);
        Student student3=new Student("Duong Van Ha","21",4);
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);


        // hien thi cac sinh vien co diem >= 5.2
//        for (Student n:studentList) {
//            if (n.getDiem()>=5.2){
//                System.out.println(n.toString());
//            }
//
//        }
        //hien thi cac sinh vien co ho "tran" hoac ten "hoa"
//        for (Student n:studentList) {
//            if (n.getTen().equalsIgnoreCase("tran") ||n.getTen().equalsIgnoreCase("hoa")){
//                System.out.println(n.toString());
//            }
//        }

        //hien thi diem trung binh
        int avg=0, total=0;
        for (Student n:studentList) {
            total+=n.getDiem();
            avg=total/studentList.size();
        }
        System.out.println("Diem trung binh cua ca lop: "+avg);

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getDiem() - o1.getDiem();
            }
        });

        // sap xep giam gian theo diem
        for (Student n:studentList) {
            System.out.println(n.toString());
        }
    }
}
