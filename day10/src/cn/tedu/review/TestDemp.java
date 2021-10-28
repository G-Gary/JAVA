package cn.tedu.review;
/**本类用于复习多态*/
public class TestDemp {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();/**使用的方法时父类的声明，子类的方法体*/
        System.out.println(a.sum);
    }
}
class Animal{
    int sum = 10;
    public void eat(){
        System.out.println("吃啥都行");
    }
}
class Dog extends Animal{
//    @Override
//    public void eat(){
//        System.out.println("小狗爱吃肉包子");
//    }
    int sum = 100 ;
    @Override
    public void eat() {
        System.out.println("小狗爱吃肉包子");
    }
}