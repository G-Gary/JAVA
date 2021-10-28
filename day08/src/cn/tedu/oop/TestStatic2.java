package cn.tedu.oop;
/**本类用于测试静态的调用关系
 * 总结；
 * 1.普通资源既可以调用静态普通资源，也可以调用静态资源
 * 2.静态资源只能调用静态资源*/
public class TestStatic2 {
}
//1.创建老师类
class Teacher{
    //2.定义老师类的普通属性和方法

    String name;//姓名
    public void teache(){
        System.out.println("授课ing...");
        /**1.普通资源能否调用静态资源？可以*/
        System.out.println(id);
        ready();
    }
    //3.定义老师类的静态属性和方法
    static int id;//工号
    public static void ready(){
        System.out.println("备课ing...");
        /**1.静态资源能否调用普通资源？不可以*/
        //System.out.println(name);
        //teache();
    }
    public static void eat(){
        /**3.静态资源能否调用静态资源？可以*/
        System.out.println(id);//静态方法调用静态属性
        ready();//静态方法调用静态方法
    }
}
