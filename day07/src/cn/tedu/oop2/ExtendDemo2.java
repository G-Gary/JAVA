package cn.tedu.oop2;
/**本类用于测试继承中构造方法的使用
 * 1.子类在创建对象时，默认会先调用父类的构造方法
 * 2.原因是子类构造函数中的第一行默认存在super();--表示调用父类的无参构造
 * 3.当父类没有无参构造式时，可以通过super(参数)调用父类的其他含参构造
 * 子类必须调用一个父类的构造函数，不管是无参还是含参，选一个即可
 * 4.构造方法不可以被继承！因为语法的原因：要求构造方法的名字必须是本类类名
 * 不能在子类中出现一个父类名字的构造方法*/
public class ExtendDemo2 {
    public static void main(String[] args) {
       // Father2 f = new Father2();
       // Father2 f2 = new Father2("hahaha");
        Son2 s = new Son2();
    }
}
class Father2{
//    public Father2(){
//        System.out.println("我是父类的无参构造");
//    }
    public Father2(String s){
        System.out.println("我是父类的含参构造"+s);
    }
}
class Son2 extends Father2{
    public Son2(){
        super("你好");//调用父类无参构造
        System.out.println("我是子类的无参构造");
    }
//    public Son2(){
//        System.out.println("我是子类的含参构造"+);
//    }
}