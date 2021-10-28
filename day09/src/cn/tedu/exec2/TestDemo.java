package cn.tedu.exec2;

import java.util.Scanner;

/**本类用作士兵类的测试类*/
public class TestDemo {
    public static void main(String[] args) {
        //1.新建Ak47对象
        Ak47 a = new Ak47();
        System.out.println("按回车射击，输入load装载子弹");
        while(true){
            String s = new Scanner(System.in).nextLine();
            if (s.equals("load")){
                a.load();
                continue;
            }
            a.fire();

        }
    }
}
