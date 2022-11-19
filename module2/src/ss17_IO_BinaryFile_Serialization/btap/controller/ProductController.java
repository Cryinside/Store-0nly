package ss17_IO_BinaryFile_Serialization.btap.controller;

import ss17_IO_BinaryFile_Serialization.btap.services.Ipml.ProductIpml;

import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        displayMenuProduct();
    }
    private static void displayMenuProduct(){
        boolean check=true;
        ProductIpml productIpml=new ProductIpml();
        while (true){
            System.out.println("Nhập số thứ tự tương ứng với yêu cầu của bạn: ");
            System.out.println("1. Thêm sản phẩm. ");
            System.out.println("2. Hiển thị thông tin sản phẩm. ");
            System.out.println("3. Tìm kiếm sản phẩm. ");
            System.out.println("4. Thoat ");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    productIpml.addProduct();
                    break;
                case 2:
                    productIpml.displayProduct();
                    break;
                case 3:
                    productIpml.searchProduct();
                    break;
                case 4:
                    System.exit(4);
                    break;
            }
        }
    }
}
