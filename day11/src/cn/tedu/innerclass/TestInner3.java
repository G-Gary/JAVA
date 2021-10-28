package cn.tedu.innerclass;
/**本类用于测试成员内部类被static修饰*/
public class TestInner3 {
    public static void main(String[] args) {
        //4.1创建内部类对象并调用内部类的功能
//        Outer3.Inner3 oi = new Outer3().new Inner3();
//        oi.show();
        //4.2创建匿名内部类对象并调用内部类的功能
//        new Outer3().new Inner3().show();
        /**现象：当成员内部类被static修饰以后，new Outer3()外部类对象会报错
         * 结论：创建静态成员内部类对象时，不需要先创建外部类对象，直接通过类名调用*/
        Outer3.Inner3 oi2 = new Outer3.Inner3();//创建静态内部类的普通对象
        oi2.show();
        new Outer3.Inner3().show();//创建内部类的匿名对象

        new Outer3.Inner3().show2();//不推荐这种写法，无需创建内部类
        //8.访问静态内部类的静态资源--链式加载
        Outer3.Inner3.show2();//并没用创建任何对象，都是通过类名获取的

    }

}
//1.创建外部类
class Outer3{
    //2.创建内部类
    //5.成员内部类被static修饰--并不常用！！！
    static class Inner3{
        //3.创建内部类的方法
        public void show(){
            System.out.println("Inner3的show()");
        }
        public static void show2(){
            System.out.println("Inner3的show2()");
        }
    }
}

