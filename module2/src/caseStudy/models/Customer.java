package caseStudy.models;

import java.util.Date;

public class Customer extends caseStudy.models.Person {
    private int IDCustomer;
    private String typeCustomer;
    private String address;


    public Customer() {};

    public Customer(String name, String IDCard, String phoneNumber, String email, String gender, int ID, String typeCustomer, String address) {
        super(name, IDCard, phoneNumber, email, gender);
        this.IDCustomer = ID;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public int getIDCustomer() {
        return IDCustomer;
    }

    public void setIDCustomer(int IDCustomer) {
        this.IDCustomer = IDCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
         return getName()+","+getIDCard()+","+getPhoneNumber()+","+getEmail()+","+getGender()+","+getIDCustomer()+","+getTypeCustomer()+","+getAddress();
    }
}
