package ss17_IO_BinaryFile_Serialization.thuchanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadToFile {
    public  void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            fos.close();
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Student> readToFile(String path) {
        List<Student> students = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return students;
    }
}
