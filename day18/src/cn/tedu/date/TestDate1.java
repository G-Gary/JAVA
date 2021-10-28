package cn.tedu.date;

import java.util.Date;

/**本类用于Date的入门*/
public class TestDate1 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);

        long t = 1000*60*60;
        Date d2 = new Date(t);
        System.out.println(d2);
        //31231
    }
}
