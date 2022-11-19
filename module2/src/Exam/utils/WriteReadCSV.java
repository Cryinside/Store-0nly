package Exam.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadCSV<T> {
    public List<String> readText(String path) {
        List<String> list = new ArrayList<>();

        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
//            line=reader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);

            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void writeText(List<T> list, String path) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {

            for (T t : list) {
                bufferedWriter.write(t.toString());
                bufferedWriter.newLine();
            }
//            bufferedWriter.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
