package cn.tedu.innerclass;
/**本类用来测试局部内部类*/
public class TestInner4 {
    public static void main(String[] args) {
        /**如何使用局部内部类的资源呢？
         * 注意：直接调用外部类的shou()是无法触发局部内部类的功能的
         * 要执行局部内部类的功能，必须先创建局部内部类的对象并调用对应的功能*/
        //5.测试第一次：内部类功能没有被触发
        //7.测试第二次：
        new Outer4().show();

    }
}
//1.创建外部类
class Outer4{
    //2.创建外部类的成员方法
    public void show(){
        System.out.println("Outer4的show()");
        //3.创建局部内部类--不太常用
        /**局部内部类的位置：方法里*/
        class Inner4{
            //4.创建局部内部类自己的资源
            String name;
            int age;
            public void eat(){
                System.out.println("Inner的eat()");
            }
        }
        //6.创建局部内部类对象并调用局部内部类的功能
        Inner4 in = new Inner4();
        in.eat();
        System.out.println(in.age);
        System.out.println(in.name);

    }
}
