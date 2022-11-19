package ss16_IO_TextFile.thuchanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readAndWriteFile(String path) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(path);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            String line = null;
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }

    public void writeToFile(String path, int max) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path,true))) {
            bufferedWriter.write("Gia tri lon nhat: "+max);
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int findMax(List<Integer> numbers){
        int max=numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)>max){
                max=numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile=new ReadAndWriteFile();
        List<Integer> numbers=readAndWriteFile.readAndWriteFile("D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\ss16_IO_TextFile\\thuchanh\\readWrite.txt");
        int max=findMax(numbers);
        readAndWriteFile.writeToFile("D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\ss16_IO_TextFile\\thuchanh\\res.txt", max);
    }
}
