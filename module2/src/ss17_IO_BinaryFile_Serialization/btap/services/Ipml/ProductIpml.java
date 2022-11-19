package ss17_IO_BinaryFile_Serialization.btap.services.Ipml;

import ss17_IO_BinaryFile_Serialization.btap.models.Product;
import ss17_IO_BinaryFile_Serialization.btap.services.ProductService;
import ss17_IO_BinaryFile_Serialization.btap.utils.WriteAndReadToFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductIpml implements ProductService {
     static Scanner scanner = new Scanner(System.in);
     static List<Product> productArrayList=new ArrayList<Product>();
     static WriteAndReadToFile writeAndReadToFile=new WriteAndReadToFile();
    @Override
    public void addProduct() {
        Product product=getProduct();
        productArrayList.add(product);
        writeAndReadToFile.writeToFile(productArrayList,"D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\ss17_IO_BinaryFile_Serialization\\btap\\data\\product.csv");
    }

    @Override
    public void displayProduct() {
        productArrayList= (List<Product>) writeAndReadToFile.readToFile("D:\\CODE\\A1121L1-NguyenTrungHieu\\module2\\src\\ss17_IO_BinaryFile_Serialization\\btap\\data\\product.csv");
        for (Product i:productArrayList) {
            System.out.println(i);
        }
    }

    @Override
    public void searchProduct() {
        System.out.print("Nhap ma san pham ban muon tim: ");
        String codeProduct=scanner.nextLine();
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getCodeProduct().contains(codeProduct)){
                System.out.println(productArrayList.get(i));
            }
        }

    }
    public Product getProduct(){
        System.out.println("ma san pham: ");
        String code=scanner.nextLine();
        System.out.println("ten san pham: ");
        String name=scanner.nextLine();
        System.out.println("nha sx: ");
        String producer=scanner.nextLine();
        System.out.println("gia: ");
        long price=Long.parseLong(scanner.nextLine());

        return new Product(code,name,producer,price);
    }
}
