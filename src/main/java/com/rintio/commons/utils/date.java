package com.rintio.commons.utils;

import java.text.SimpleDateFormat;
import java.util.*;

public class date {

    public date() {
    }

    public String getComplexId() {
        Date newDate_depart = new Date();
        Date newDate_return = new Date();
        Date lastDate_depart = new Date();
        Date lastDate_return = new Date();

        Calendar now = Calendar.getInstance();
        int mm = now.get(Calendar.MINUTE);
        int ss = now.get(Calendar.SECOND);
        int mls = now.get(Calendar.MILLISECOND);
        int hh = now.get(Calendar.HOUR_OF_DAY);
        int mois = now.get(Calendar.MONTH) + 1;
        int jour = now.get(Calendar.DAY_OF_MONTH);
        int annee = now.get(Calendar.YEAR);

        String catime = (getKeyYear() + "" + String.valueOf(mois) + "" + String.valueOf(jour) + "" + String.valueOf(hh) + "" + String.valueOf(mm) + "" + String.valueOf(ss) + "" + String.valueOf(mls));
        catime = catime + GetNumberRandom();

        if (catime.length() < 20) {
            catime = catime + GetNumberRandom();
        }

        if (catime.length() == 20) {
            return catime;
        }
        if (catime.length() > 20) {
            catime = catime.substring(0, 20);
        }

        return catime;

    }

    public int getKeyYear() {
        Calendar now = Calendar.getInstance();
        int annee = now.get(Calendar.YEAR);
        return annee - 2010;
    }

    public static String GetNumberRandom() {
        return String.valueOf((int) (Math.random() * 10000 + 1));
    }

    public static String GetNumberRandom(int patern) {
        String var = String.valueOf((int) (Math.random() * patern + 1));
        return var;
    }
}
