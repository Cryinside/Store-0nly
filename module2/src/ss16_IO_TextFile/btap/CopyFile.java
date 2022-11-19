package ss16_IO_TextFile.btap;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void copyFile(String pathIn,String pathOut){
        try {
            FileReader fileReader = new FileReader(pathIn);
            File fileWriter = new File(pathOut);
            if (fileWriter.exists()){
                throw new Exception();
            }
            FileWriter fileWriter1 = new FileWriter(fileWriter);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter1);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String string ;
            int count = 0;
            while ((string = bufferedReader.readLine()) !=null) {
                bufferedWriter.write(string);
                String[] newString = string.split("");
                for (int i=0;i<newString.length;i++){
                    count++;
                }
                bufferedWriter.newLine();
            }
            fileReader.close();
            bufferedWriter.close();
            System.out.println("Số ký tự đã copy là: "+count);
            FileReader fileReader1 = new FileReader(pathOut);
            fileReader1.close();
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại!");;
        } catch (Exception e) {
            System.out.println("File đã tồn tại hoặc lỗi định dạng!");;
        }    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập đường dẫn file cần Copy: ");
        String pathIn = sc.nextLine();
        System.out.print("Nhập đường dẫn file Copy tới: ");
        String pathOut = sc.nextLine();
        copyFile(pathIn,pathOut);
    }
}
