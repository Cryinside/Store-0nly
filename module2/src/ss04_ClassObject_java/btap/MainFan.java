package ss04_ClassObject_java.btap;

import java.util.Scanner;

public class MainFan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassFan fan1=new ClassFan();
        ClassFan fan2=new ClassFan();
        fan1.setSpeed(10);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan2.setSpeed(5);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
