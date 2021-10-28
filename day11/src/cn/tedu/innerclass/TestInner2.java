package cn.tedu.innerclass;
/**本类用于测试成员内部类被private修饰*/
public class TestInner2 {
    public static void main(String[] args) {
//        Outer2.Inner2 oi = new Outer2().new Inner2();
//        oi.eat();
        /**如果Inner2被private修饰，无法直接创建对象，该怎么办？*/
        new Outer2().getInner2Eat();
    }
}
//1.创建外部类
class Outer2{
    //6.提供本类的公共方法，在本方法内部创建内部类的对象，使用内部类的功能
    public void getInner2Eat(){
        Inner2 i = new Inner2();
        i.eat();
    }
    //2.创建成员内部类
    //5.使用private修饰内部类
    private class Inner2{
        //3.创建成员内部类的普通方法
        public void eat(){
            System.out.println("Inner2的eat()");
        }
    }
}
