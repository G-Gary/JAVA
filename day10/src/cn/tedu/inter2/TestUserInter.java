package cn.tedu.inter2;
/**本类用于进一步测试接口的使用*/
public class TestUserInter {
    public static void main(String[] args) {
        System.out.println(UserInter.age);//静态，因为可以被接口名直接调用
        //UserInter.age = 37 ;//final,因为值不可以被修改
    }
}
interface UserInter{
    //public UserInter(){}
    /**1.接口里没有构造方法*/
    //public abstract void eat();
    /**4.接口中的是静态常量，实际上的写法是public static final int age =20;
     * 只不过接口中可以省略不写，会默认拼接，所以写成int age = 20；也可以*/
    //int age;
    int age = 10;
    /**接口中抽象方法的定义可以简写，会自动拼接public abstract*/
    public abstract void eat();
    void play();
}
class UserInterImpl implements UserInter{
    public UserInterImpl(){
        /**2.如果一个类没有明确指定它的父类，那么它默认继承顶级父类Object*/
        super();/**3.此处调用的父类的无参构造是Object的无参构造*/
        System.out.println("我是子实现类的无参构造");
    }

    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }
}
