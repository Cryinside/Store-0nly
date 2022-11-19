package ss05_AccessModifier_StaticMethod_StaticProperty.thuchanh;

public class Student {
    private int rollno;
    private String name;
    private static String college="BBDIT";

    Student(int r, String n){
        this.rollno=r;
        this.name=n;
    }

    static void change(){
        college="CODEGYM";

    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }

}
