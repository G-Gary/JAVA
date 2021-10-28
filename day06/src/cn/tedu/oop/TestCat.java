package cn.tedu.oop;
/**本类用于面向对象巩固案例*/
public class TestCat {
    public static void main(String[] args) {
        Cat c1 =new Cat();
        c1.jump();
        c1.miaoMiao();
        Cat c2 = new Cat();

        c2.name="花花";
        c2.age= 1;
        c2.hosts="小花";
        c1.name="大白";
        c1.age= 5;
        c1.hosts="大大白";
        System.out.println(c2.name);
        System.out.println(c2.age);
        System.out.println(c2.hosts);
        System.out.println(c1.name);
        System.out.println(c1.age);
        System.out.println(c1.hosts);
    }
}
class Cat{
    String name ;
    int age ;
    String hosts;
    public void jump(){
        System.out.println("小猫Cat跳的老高了");
    }
    public void miaoMiao(){
        System.out.println("小猫喜欢喵喵叫");
   }

}