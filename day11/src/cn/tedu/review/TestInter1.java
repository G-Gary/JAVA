package cn.tedu.review;
/**本类用于复写接口1*/
public class TestInter1 {
    public static void main(String[] args) {
        //接口不可以被实例化，创建对象
        //Inter1 i = new Inter1();
        Inter1Impl i = new Inter1Impl();
        i.eat();
        i.play();




    }
}
//1.定义接口
interface Inter1{
    //2.定义接口的静态常量
    int age = 10;
    public static final int sum = 20;
    //3.定义接口的方法
    public abstract void eat();
    void play();
}
//4.创建接口的实现类实现接口
//abstract class Inter1Impl implements Inter1{方案一：变成抽象子实现类
class Inter1Impl implements Inter1{//方案二：变成普通子实现类
    @Override
    public void eat() {
        System.out.println("吃早餐");
    }

    @Override
    public void play() {
        System.out.println("又在玩代码");
    }
}
