package com.example.asus.projekt1;

/**
 * Created by asus on 19.12.2018.
 */

public class PPM {

    public double PPM_M(String sex, double weight, double height, double age, String units) {
        double height2 = 0;
        if (units.equals("m")) {
            height2 = height * 100;
        } else {
            height2 = height;
        }

        if (sex.equals("kobieta")) {
            return (10 * weight) + (6.25 * height2) - (5 * age) - 161;
        } else {
            return (10 * weight) + (6.25 * height2) - (5 * age) + 5;
        }
    }


    public PPM() {

    }

    public double PPM_BH(String sex, double weight, double height, double age, String units) {
        double height2=0;
        if(units.equals("m")){
            height2=height*100;
        }else{
            height2=height;
        }

        if (sex.equals("kobieta")) {
            return (655.1 + (9.563 * weight) + (1.85 * height2) - (4.676 *
                    age));
        } else {
            return (66.5 + (13.75 * weight) + (5.003 * height2) - (6.775 *
                    age));
        }
    }
}
