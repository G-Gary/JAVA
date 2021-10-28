package cn.tedu.exec2;

import java.util.Random;

/**OOP综合案例3-武器类*/
public class Ak47 {
    //1.定义属性
    int bullets = 100;//定义子弹的初始值为100发
    //2.1定义功能--开火功能
    public void fire(){
        //2.1首先判断是否有子弹，如果没有子弹，直接结束当前方法
        if (bullets == 0){
            System.out.println("没有子弹了");
            return;
        }
        //2.2生成一个随机值作为本次发射子弹的数量，范围[0,10)
        int r = new Random().nextInt(10);
        //2.3判断实际子弹数是否够用，有多少发多少
        if (r > bullets){
            r = bullets;//将当前的实际子弹数赋值给随机数r
        }
        bullets = bullets-r;
        //2.4为了游戏效果，发射了几发子弹就在控制台打印几个突
        for (int i = 0; i < r; i++) {
            System.out.print("突");//本轮打印的都在同一行
        }
        System.out.println("~");
        //2.5如果子弹数为0，提示用户弹夹空了
        if (bullets == 0){
            System.out.println("弹夹空了");
        }
    }
    //2.2定义功能--装弹功能
    public void load(){
        bullets = 100;
        System.out.println("弹夹已装满");
    }
}
