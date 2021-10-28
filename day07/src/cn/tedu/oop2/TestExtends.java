package cn.tedu.oop2;
/**本类用于继承的入门案例*/
public class TestExtends {
    public static void main(String[] args) {
        //5*分别创建3个类的对象
        Animal a = new Animal();
        Cat c = new Cat();
        MiaoMiao m = new MiaoMiao();
        //*利用对象调用方法进行测试
        /**3.继承相当于是子类将父类的功能复制了一份
         * 继承还具有传递性，爷爷的功能会传给爸爸，爸爸的功能会传给孙子*/
        a.eat();//爷爷类使用自己的方法
        c.eat();//爸爸类可以使用从爷爷类中继承过来的方法
        m.eat();//孙子类也可以使用从爷爷类中继承过来的方法
    }
}
/**1.我们通过extends关键字建立子类与父类的继承关系，格式：子类 extends 父类
 * 2.Java只支持单继承，一个子类只能有一个父类，但是一个父类可以有多个子类*/
//1.创建小动物类--爷爷类
class Animal{
   //4.添加爷爷类的普通方法
   public void eat(){
       System.out.println("小动物Animal吃啥都行~");
   }
}
//2.创建小猫类--父类
/**6.继承是is a的关系，比如是小猫是小动物，MiaoMiao是一只小猫
 * 继承要求子类必须是父类的一种下属类型，依赖性非常强，强耦合*/
class Cat extends Animal{
    //7.定义爸爸类中的属性
    int a = 10;//普通属性
    private int b = 100;//私有属性
}
//3.创建MiaoMiao类--子类
class MiaoMiao extends Cat{
    /**4.子类可以拥有自己独有的方法，实现了功能的拓展，青出于蓝而胜于蓝*/
    //8.定义子类的方法
    public void studyJava(){
        System.out.println("正在学Java");
        System.out.println(a);
        /**5.子类继承了父类以后，可以使用父类的所有非私有资源
         * 注意：这个私有资源由于被private修饰，所有没有访问权限*/
        //System.out.println(b);//不可以，私有资源被限制访问
    }
}