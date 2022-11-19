package ss05_AccessModifier_StaticMethod_StaticProperty.thuchanh;

public class TestStudent {
    public static void main(String[] args) {
//        Student.change();
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        s1.display();
        s2.display();
        s3.display();
    }
}
