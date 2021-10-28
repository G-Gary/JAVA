package cn.tedu.review;
/**本类用于复习继承*/
public class TestExtends {
}
class A{
    public A(){

    }
    public static void play(){
        System.out.println("父类的静态方法");
    }
}
class B extends A{
    /**构造函数不可以被继承*/
    //public A(){}会报错
    /**静态资源属于类资源，在那个类里定义，就作为这个类的资源使用，不存在重写的现象
     * 这里只是恰巧再付子类中出现了两个一模一样的方法*/
    //@Override//不可以加注解，说明不是重写的方法，会报错
    public static void play(){
        System.out.println("子类的静态方法");
    }
}