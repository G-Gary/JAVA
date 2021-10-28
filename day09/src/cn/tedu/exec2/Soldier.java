package cn.tedu.exec2;

import java.util.Random;

/**OOP综合案例3-士兵类*/
//1.定义士兵类
public class Soldier {
    //2.定义士兵的属性
    int id;//士兵编号
    int blood = 100;//默认血量值100
    Ak47 a;//应用类型Ak47作为属性，相当于给士兵配枪,a的默认值为null

    //3.1定义士兵类的方法1
    public void go(){
        System.out.println(this.id+"号士兵在前进");
    }
    //3.2定义士兵类的方法2
    public void attack(){
        //4.在攻击之前先判断这个士兵是否还活着，如果阵亡，直接结束当前
        if(blood ==0){
            System.out.println("这是"+id+"号士兵的尸体");
            return;/**结束当前方法attack()*/
        }
        System.out.println(id+"号士兵在进攻！");
        if (a != null){
            a.fire();
        }
        //1.生成一个随机数d，模拟进攻掉血的掉血量，随机数的范围是[0,10)
        int d = new Random().nextInt(10);//[0,10)
        blood = blood-d;//减去血量
        //2.血量最多减到0，如果出现负数，重置成0
        if(blood < 0){
            blood = 0;
        }
        //3.当血量为0时，说明士兵阵亡
        if(blood == 0){
            System.out.println(id+"号士兵已阵亡");
        }
    }
}
