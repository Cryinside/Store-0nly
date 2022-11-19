package caseStudy.models;

import java.util.Comparator;
import java.util.Objects;

public class Employee extends Person {
    private int IDEmployee;
    private String level;
    private String position;
    private int salary;
    public static int numberOfEmployee;

    public Employee() {
    }

    public Employee(String name, String IDCard, String phoneNumber, String email, String gender, int IDEmployee, String level, String position, int salary) {
        super(name, IDCard, phoneNumber, email, gender);
        this.IDEmployee = IDEmployee;
        this.level = level;
        this.position = position;
        this.salary = salary;
        numberOfEmployee++;
    }

    public int getIDEmployee() {
        return IDEmployee;
    }

    public void setIDEmployee(int IDEmployee) {
        this.IDEmployee = IDEmployee;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phoneNumber;
    }

    public void setPhone(String phone) {
        this.phoneNumber = phone;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return getName() + "," + getIDCard() + "," + getPhoneNumber() + "," + getEmail() + "," + getGender() + "," + getIDEmployee() + "," + getLevel() + "," + getPosition() + "," + getSalary();
    }

    public static class SortSalary implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            if (o1.getSalary() > o2.getSalary()) return 1;
            else if (o1.getSalary() < o2.getSalary()) return -1;
            else return 0;

        }
    }

    
}
