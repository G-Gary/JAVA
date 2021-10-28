package cn.tedu.oop;
/**本类用作抽象类中的成员测试*/
public class AbstractDemo3 {

}
abstract class Animal3{
    /**1.抽象类中可以定义成员变量吗？--可以*/
    int sum = 100;
    /**2.抽象类中可以定义成员常量吗？--可以*/
    final String ANIMAL_NAME ="小黄人";
    /**3.抽象类中可以定义普通方法吗？--可以*/
    /**.抽象类中可以定义抽象方法吗？--可以*/
    /**4.抽象类中能否全是普通方法吗？--可以
     * 如果抽象类中都是普通方法，为啥还要把这个类声明成抽象类呢？
     * 因为抽象类不可以被实例化，所有不让外界创建本类的对象，可以把普通类声明成抽象类*/
    public void eat(){
        System.out.println("普通方法1");
    }
    public void eat2(){
        System.out.println("普通方法2");
    }
    /**5.抽象类中能否全是抽象方法？--可以
     * 如果一个类中含有抽象方法，这个类必须被声明成抽象类*/
    public abstract void play();

    public abstract void play2();


}
/**6.如果一个子类继承了抽象父类，有两种处理方案
 * 方案一；继续抽象，也就是作为抽象子类，不实现/实现部分抽象父类中的抽象方法
 * 方案二；不在抽象，也就是作为普通子类，实现继承父类所有抽象方法*/
class Pig3 extends Animal3{

    @Override
    public void play() {
        System.out.println("玩皮球");
    }

    @Override
    public void play2() {
        System.out.println("玩你妹");
    }
}
