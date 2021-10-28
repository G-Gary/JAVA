package cn.tedu.api;

import java.math.BigDecimal;
import java.util.Scanner;

/**本类用于解决浮点数运算不精确的问题*/
public class TestBigDecimal {
    public static void main(String[] args) {
        //f1();
        f2();
    }

    private static void f2() {
        System.out.println("请输入要计算的两个小数：");
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();
    /**1.最好不要使用double作为构造函数的参数类型，不然还会有不精确的问题
     * 2.推荐使用String类型参数，double转String，直接拼个空串就可以*/
        BigDecimal bd1 = new BigDecimal(a+"");
        BigDecimal bd2 = new BigDecimal(b+"");
        BigDecimal bd3;
         bd3 = bd1.add(bd2);//加法
        System.out.println(bd3);

        bd3 = bd1.subtract(bd2);//减法
        System.out.println(bd3);

        bd3 = bd1.multiply(bd2);//乘法
        System.out.println(bd3);

        /**divide()在除不净时会抛出算术异常，因为没有办法精确表示结果1
         * 解决方案：需要而外设置除不净时的保留数字和舍入方式
         * divide(a,b,c)：
         * a是指要除那个数 b是指保留位数 c是指舍入方式，这里是四舍五入*/
        //bd3 =bd1.divide(bd3);
        bd3 =bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP);
        System.out.println(bd3);
    }

    private static void f1() {
        System.out.println("请输入要计算的两个小数：");
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
