package cn.tedu.design;
/**本类用于实现单例设计模式方案1：饿汉式*/
public class Singleton1 {
    public static void main(String[] args) {
        MySingle single = MySingle.getSingle();
        MySingle single1 = MySingle.getSingle();
        System.out.println(single==single1);
    }

}
class MySingle{
    //1.提供本类的构造方法
    /*1.构造方法私有化的目的：为了防止外界随意实例化本类对象*/
    private MySingle(){}

    private static MySingle single = new MySingle();

    public static MySingle getSingle(){
     return single;
    }
}