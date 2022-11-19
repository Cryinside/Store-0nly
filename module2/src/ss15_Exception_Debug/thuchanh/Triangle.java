package ss15_Exception_Debug.thuchanh;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        System.out.println("Hãy nhập z: ");
        int z = scanner.nextInt();
        Triangle triangleException=new Triangle();
        try {
            triangleException.triangle(x,y,z);

        }catch (IllegalTriagleException e){
            System.out.println(e.getMessage());
        }
    }
    private void triangle(int x,int y,int z) throws IllegalTriagleException{
        if (x+y<z || x+z<y || y+z<x){
            throw new IllegalTriagleException("khong phai tam giac");
        }else {
            System.out.println("tam giac");
        }
    }
}
