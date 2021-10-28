package cn.tedu.oop;
/**本类用于测试代码块
 * 执行顺序；构造代码块->构造方法->普通方法->局部代码块，分析；
 * 1.当创建对象时，会触发构造函数
 * 2.创建对象时，也会触发构造代码块，并且构造代码块优先于构造方法执行
 * 3.我们创建好对象后才能通过对象调用普通方法
 * 4.如果普通方法里有局部代码块，才会触发局部代码块*/
public class TestBlock {
    public static void main(String[] args) {
        Pig p1 = new Pig();
//        Pig p2 = new Pig("佩奇");
//        Pig p3 = new Pig("猪肉包",5);
//        System.out.println(p2.age);
//        System.out.println(p3.age);
        p1.eat();
//        p2.eat();
//        p3.eat();

    }
}
class Pig{
    String food;
    int age;
    //创建本类的构造代码块
    {
        /**构造代码块；{}
         * 1.位置：类里方法外
         * 2.执行时机；每次创建对象时都会执行构造代码块，并且构造代码块优先于构造方法执行
         * 3.作用：用于提取所有构造方法的共性功能*/
        System.out.println("我是一个构造代码块");
        System.out.println("黑猪肉");
    }



    public Pig(){
        System.out.println("我是Pig类的无参构造");
    }
    public Pig(String n){
        System.out.println("我是Pig类的含参构造"+n);
    }

    public Pig(String food, int age) {
        System.out.println("我是Pig类的全参构造");
        this.food = food;
        this.age = age;
    }

    public void eat(){
        System.out.println("小猪爱吃牛肉");
        //创建局部代码块
        {
            /**局部代码块：{}
             * 1.位置；方法里
             * 2.执行时机：调用本局部代码块所处的方法时才会执行
             * 作用；用于控制变量的作用范围，变量的作用范围越小越好*/
            System.out.println("我是一个局部代码块");
            int i = 100;
            System.out.println(i);

        }
        //System.out.println(i);局部代码块中的局部变量i只能在代码块里使用
    }
}
