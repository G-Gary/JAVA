package cn.tedu.oop;
/**本类用作构造函数的入门案例*/
public class TestConstructor {
    public static void main(String[] args) {
        /**1.每次new对象时，都会自动触发对应类中的构造方法*/
        /**2.每一个类中都会默认存在一个没有参数的构造方法
         * 但是，如果你提供了其他的构造函数，默认的无参构造会被覆盖
         * 所以，我们要手动的提供无参构造，这样才能不传参数，也能创建对象*/
        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.address);
        p.eat();
        /**4.每次创建对象，都会执行一个构造方法
        * 构造方法的作用，用来创建对象的*/
        Person p2 = new Person(5555);
        System.out.println(p2.name);
        /**全参构造不仅可以创建对象，还可以给对象的所有属性赋值*/
        Person p3 = new Person("法外狂徒张三",18,"在法庭被审判");
        System.out.println(p3.name);
        System.out.println(p3.age);
        System.out.println(p3.address);
    }
}
//1.创建Person类，描述人这一类事物
class Person{
    //2.定义属性
    String name;//姓名
    int age;//年龄
    String address;//住址
    /**3.构造方法的格式：与本类类名同名，且没有返回值类型的方法*/
    public Person(){
        System.out.println("我是Person类的无参构造");
    }
    //创建本类的含参构造--含有参数的构造方法
    public Person(int n){
        System.out.println("我是Person类的含参构造"+n);
    }
    //创建本类的全参函数构造--此构造函数的参数与本类的属性一致

    public Person(String name, int age, String address) {
        System.out.println("我是Person类的全参构造");
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void eat(){
        System.out.println("端起了我的饭盆~");
    }

}