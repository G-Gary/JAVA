package cn.tedu.test;

import java.util.Scanner;

//某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
//        ​ 存期 年利率（%）
//        ​ 一年 2.25
//        ​ 两年 2.7
//        ​ 三年 3.25
//        ​ 五年 3.6
//        请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
//        提示：
//        ​ 存入金额和存入年限均由键盘录入
//        ​ 本息计算方式：本金+本金×年利率×年限
public class BankDemo {
    public static void main(String[] args) {
        System.out.println("请输入你要存入的金额");
        int money=new Scanner(System.in).nextInt();
        System.out.println("请输入你要存入的年限");
        int year=new Scanner(System.in).nextInt();
        double outMoney = 0;
        if (year==1){
            outMoney = money+money*2.25/100*1;
        }else if (year==2){
            outMoney = money+money*2.7/100*2;
        }else if (year==3){
            outMoney = money+money*3.25/100*3;
        }else if (year==5){
            outMoney = money+money*3.6/100*5;
        }else {
            System.out.println("输入年份有误");
        }
        System.out.println("存款"+year+"年后利息是："+outMoney);
    }
}
