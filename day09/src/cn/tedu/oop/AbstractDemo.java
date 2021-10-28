package cn.tedu.oop;
/**本类用于抽象的入门案例*/
public class AbstractDemo {
    public static void main(String[] args) {
        /**4.抽象类不可以实例化！！！创建对象*/
        //Animal a = new Animal();
        Animal a = new Pig();
        a.eat();
        a.play();
        a.fly();


    }
}
/**2.被abstract关键字修饰的类是抽象类
 * 如果一个类中包含了抽象方法，那么这个类必须被声明成一个抽象类*/
abstract class Animal{
    public void eat(){
        System.out.println("吃啥都行");
    }
    /**被abstract关键字修饰的方法是抽象方法，抽象方法没有方法体*/
    public abstract void play();
    public abstract void fly();
}
/**3.当一个子类继承了抽象父类以后，有两种解决方案：
 * 方案一；变成抽象子类"躺平，我也不实现，继续抽象"
 * 方案二；变成普通子类，实现父类中的所有为实现的抽象方法，“父债子偿”*/
//abstract class Pig extends Animal{
class Pig extends Animal{
    @Override
    public void play() {
        System.out.println("实现父类未实现的play()");
    }

    @Override
    public void fly() {
        System.out.println("实现父类未实现的方法2fly()");

    }
}
