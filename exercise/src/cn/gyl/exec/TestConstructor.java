package cn.gyl.exec;

public class TestConstructor {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.address);
        System.out.println(p1.age);
        System.out.println(p1.name);

        Person p2 = new Person(5);
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.address);

        Person p3 = new Person("小花",5,"草草");
        System.out.println(p3.name);
        System.out.println(p3.age);
        System.out.println(p3.address);
    }
}
class Person{
    String name;
    int age;
    String address;
    public Person(){
        System.out.println("我是无参构造");

    }
    public Person(int n){
        System.out.println("我是含参构造"+n);

    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("我是全参构造");

    }
    public void eat(){
        System.out.println("干饭不积极，思想有问题");
    }
}
