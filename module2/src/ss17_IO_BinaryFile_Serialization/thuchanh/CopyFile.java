package ss17_IO_BinaryFile_Serialization.thuchanh;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFile {
    public  void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void  copyFileUsingStr(File source, File dest) throws IOException {
//        InputStream is = null;
//        OutputStream os = null;
        try(  InputStream is =new FileInputStream(source); OutputStream os =new FileOutputStream(dest);) {
//            is = new FileInputStream(source);
//            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer,0,length);
            }
        }
    }
//    private static void copyFileUsingStream(File source, File dest) throws IOException {
//        InputStream is = null;
//        OutputStream os = null;
//        try {
//            is = new FileInputStream(source);
//            os = new FileOutputStream(dest);
//            byte[] buffer = new byte[1024];
//            int length;
//            while ((length = is.read(buffer)) > 0) {
//                os.write(buffer, 0, length);
//            }
//        } finally {
//            is.close();
//            os.close();
//        }
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter source file:");
        String sourcePath = "D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\ss17_IO_BinaryFile_Serialization\\thuchanh\\sourceFile.txt";
//        System.out.print("Enter destination file:");
        String destPath = "D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\ss17_IO_BinaryFile_Serialization\\thuchanh\\destFile.txt";

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

//        CopyFile copyFile = new CopyFile();
        try {
//            CopyFile copyFile = new CopyFile();
//            copyFile.copyFileUsingJava7Files(sourceFile,destFile);
            copyFileUsingStr(sourceFile,destFile);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
