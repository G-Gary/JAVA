package cn.tedu.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**本类用于测试SimpleDateFormat日期转换类*/
public class TestSDF {
    public static void main(String[] args) {

        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        //String s = sdf.format(d);
        String s = sdf2.format(d);
        System.out.println(s);


    }
}
