package cn.tedu.review;

import java.math.BigDecimal;
import java.util.Scanner;

/**本类用于复写浮点数运算不精确*/
public class TestBig {
    public static void main(String[] args) {
        System.out.println("请输入你要计算的小数");
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();
        BigDecimal bd1 = new BigDecimal(a+"");
        BigDecimal bd2 = new BigDecimal(b+"");
        BigDecimal bd3;

        bd3 =bd1.add(bd2);
        System.out.println(bd3);
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP));

    }
}
