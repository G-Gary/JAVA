package cn.tedu.oop2;

import sun.security.mscapi.CPublicKey;

/**本类用作多态的入门案例*/
public class TestDemo {
    public static void main(String[] args) {
//        Animal a = new Animal();
//        Cat c = new Cat();
//        Dog d = new Dog();
//        a.eat();
//        c.eat();
//        d.eat();
//        /**2.父类对象不可以使用子类的特有功能*/
//        //a.jump();
//        //a.run();
//        c.jump();
//        d.run();
        /**3.口诀1：父类引用指向子类对象
         * 解释；创建出来的子类对象的地址值，交给父类类型的引用类型变量来保存*/
        Animal a1 = new Cat();
        Animal a2 = new Dog();
        /**4.口诀2：编译看左边，运行看右边
         * 解释；必须要在父类定义这个方法，才能通过编译，把多态对象看做是父类类型
         *      必须要在子类重写这个方法，才能满足多态，实际干活的是子类*/
        a1.eat();

    }

}
/**1.多态的前提：继承+重写*/
//1.创建父类
class Animal{
    public void eat(){
        System.out.println("小动物Animal吃啥都行~");
    }
}
//2.1创建子类1
class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("小猫爱吃小狗干");

    }
    public void jump(){
        System.out.println("小猫跳的老高了");
    }
}
//2.2创建子类2
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("小狗爱吃猫骨头");
    }
    public void run(){
        System.out.println("小狗跑的老快了");
    }
}