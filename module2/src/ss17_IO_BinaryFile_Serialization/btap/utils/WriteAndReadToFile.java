package ss17_IO_BinaryFile_Serialization.btap.utils;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.Collection;

public class WriteAndReadToFile {
    public static void writeToFile(Collection collection, String path) {
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

    public static Object readToFile(String path) {
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
}
