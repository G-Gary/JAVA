package cn.tedu.review;
/**本类用于复习继承*/
public class TestExtends {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        MM m = new MM();
        a.eat();
        c.eat();
        m.eat();
    }
}
class Animal{
    public void eat(){
        System.out.println("小动物Animal吃啥都行");
    }
}
class Cat extends Animal{
    int a = 10;
    private int b = 100;
}
class MM extends Cat{
    public void play(){
        System.out.println(a);
        //System.out.println(b);
    }
}
class DD extends Cat{

}
