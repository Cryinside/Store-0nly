package ss04_ClassObject_java.btap;

public class Student {
    int rollno;
    String name;
    static String college = "BachKhoa";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String args[]) {
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Thanh");
        s1.display();
        s2.display();
    }
}
