package ss17_IO_BinaryFile_Serialization.thuchanh;

import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));

        WriteAndReadToFile writeAndReadToFile=new WriteAndReadToFile();
        writeAndReadToFile.writeToFile("D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\ss17_IO_BinaryFile_Serialization\\thuchanh\\student.txt",students);
        List<Student> students1=writeAndReadToFile.readToFile("D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\ss17_IO_BinaryFile_Serialization\\thuchanh\\student.txt");
        for (Student i:students1) {
            System.out.println(i);
        }
    }
}
