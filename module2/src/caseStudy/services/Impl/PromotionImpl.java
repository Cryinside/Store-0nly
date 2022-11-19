package caseStudy.services.Impl;

import caseStudy.models.Booking;
import caseStudy.services.PromotionService;

import java.util.ArrayList;
import java.util.List;

public class PromotionImpl implements PromotionService {
    static List<Booking> bookingList=new ArrayList<>();

    @Override
    public void displayService() {
        for (Booking i: bookingList) {
            if (i.equals("nam")){
                System.out.println(i.toString());
            }
        }
    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void remove() {

    }
}
