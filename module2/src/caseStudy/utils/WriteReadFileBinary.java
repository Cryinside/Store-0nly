package caseStudy.utils;

import caseStudy.models.Facility;
import ss17_IO_BinaryFile_Serialization.thuchanh.Student;

import java.io.*;
import java.util.*;

public class WriteReadFileBinary {
    public  void writeToFile(Collection collection, String path) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;


        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(collection);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public  Object readToFile(String path) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        Object object = null;
        try {
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);

            object = ois.readObject();
            return object;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeToFileStatic(Collection collection, String path) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;


        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(collection);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public  static Object readToFileStatic(String path) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        Object object = null;
        try {
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);

            object = ois.readObject();
            return object;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }





    public  void writeToFile1(Map map, String path) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;


        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(map);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public Map<Facility,Integer> readToFile1(String path) {
        Map<Facility,Integer> facility = new LinkedHashMap<>();

        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            facility = (Map<Facility, Integer>) ois.readObject();
            fis.close();
            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return facility;
    }
}
