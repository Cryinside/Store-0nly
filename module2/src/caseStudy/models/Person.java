package caseStudy.models;

import java.io.Serializable;
import java.util.Date;

public abstract class Person implements Serializable {

    public String name;
//    public Date date;
    public String IDCard;
    public String phoneNumber;
    public String email;
    public String gender;

    public Person() {
    }

    public Person(String name, String IDCard, String phoneNumber, String email, String gender) {
        this.name = name;
        this.IDCard = IDCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
