package cn.tedu.inter;
/**本类作为inter接口的实现类
 * 1.实现类如果想要实现接口定义的功能，需要与接口建立实现关系
 * 通过关键字implements来建立实现类 实现 接口的关系
 * 2.1方案一：如果实现类与接口建立实现关系以后
 * 可以选择不实现接口中的抽象方法，把自己变成一个抽象类*/
//abstract public class InterImpl implements Inter{方案一
 /**2.2方法二：如果实现类与接口建立实现关系后
  * 还可以选择实现接口中的所有抽象方法，把自己变成一个普通子类*/
public class InterImpl implements Inter{
     @Override
     public void eat() {
         System.out.println("吃火锅");
     }

     @Override
     public void play() {
         System.out.println("玩代码");
     }
 }
