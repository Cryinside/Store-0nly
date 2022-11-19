package ss02_loop_java.btap;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.Scanner;

public class SNTNhoHon100 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap n: ");
        boolean check;
        int num=scanner.nextInt();
        if (num<2){
            System.out.println(" khong co so SNT");
        }else {
            for (int i=2;i<num;i++){
                check=true;
                for (int j=2;j<=Math.sqrt(i);j++){
                    if (i%j==0){
                        check=false;
                    }
                }
                if (check){
                    System.out.print(i+" ");
                }
            }

        }
    }

}
