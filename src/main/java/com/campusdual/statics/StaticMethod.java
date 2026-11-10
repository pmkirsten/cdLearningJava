package com.campusdual.statics;

import java.util.Calendar;
import java.util.Date;

public class StaticMethod {

    public static String countDownToYear(String name, int year){
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.set(year, 0, 1, 0 , 0, 0);
        Date targetDate = cal.getTime();
        long millis = targetDate.getTime() - today.getTime();
        long days = millis / (1000*60*60*24);
        String message;
        if (days > 0){
            message = "Hi " + name + "!, countdown to " + year + ": " + days + " days.";
        } else {
            message = "Hi "+ name +"!, days from year "+ year +": "+ Math.abs(days) +" days.";
        }

        return message;

    }
}
