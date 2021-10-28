package cn.tedu.review;
/**本类用于复习代码块*/
public class TsetBlock {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person(123);
        p1.eat();

    }
}
class Person{
    {
        System.out.println("我是构造代码块");
    }
    public Person(){
        System.out.println("我是无参构造");
    }
    public Person(int n){
        System.out.println("我是含参构造");
    }
    public void eat(){
        System.out.println("eat方法");
        {
            System.out.println("我是一个局部代码块");
            int i = 100;
            System.out.println(i);
        }
    }
}
