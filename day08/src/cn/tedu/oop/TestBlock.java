package cn.tedu.oop;
/**本类用于测试代码块
 * 执行顺序：
 * 静态代码块->构造代码块->构造方法->普通方法->局部代码块*/
public class TestBlock {
    public static void main(String[] args) {
        Apple p1 = new Apple();
        Apple p2 = new Apple();
        p1.clean();
    }

}
class Apple{
    /**格式：static{}
     * 位置：类里方法外
     * 执行时机：静态代码块也属于静态资源，随着类的加载而加载，优先于对象加载
     * 并且静态资源只会加载一次
     * 作用：用于加载那些需要第一时间就加载，并且只加载一次的资源，常用来初始化*/
    static {
        System.out.println("我是一个静态代码块");
    }
    /**位置：类里方法外
     * 执行时机：创建对象时执行，并优先于构造方法执行
     * 作用：用于提取所有构造方法的共性功能*/
    {
        System.out.println("我是一个构造代码块");
    }
    public Apple(){
        System.out.println("我是一个无参构造");
    }
    public void clean(){
        System.out.println("我是一个普通方法");
        /**位置：方法里
         * 执行时机：每次调用局部代码块所处的方法时才会执行
         * 作用：由于控制变量的作用范围*/
        {
            System.out.println("我是一个局部代码块");
        }
    }
}
