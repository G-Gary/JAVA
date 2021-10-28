package cn.tedu.oop;
/**本类用于测试继承中方法的使用*/
public class ExtendsDemo {
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        f.eat();
        s.eat();

        System.out.println();
    }
}
class Father{
    public void eat(){
        System.out.println("爸爸爱吃肉");
    }
    public void play(){
        System.out.println("爸爸爱放风筝");
    }
}
class Son extends Father{
    /**重新的原则：两同 两小 一大
     * 两同；子类方法的 方法名与参数列表 和父类方法相同
     * 一大；子类方法的 方法修饰符权限 >= 父类方法的
     * 两小；子类方法的返回值类型 <= 父类方法的返回值类型
     * 注意；这里所说的<=是指子类方法的返回值类型是父类返回值类型的子类
     * 或者与父类的返回值类型一致，如果父类方法的返回值类型是void，子类保持一致即可*/
    @Override//注解，用来加在方法上，表示这是一个重写的方法
    public void eat(){
        System.out.println("儿子爱吃蔬菜");
    }
    @Override
    public void play(){
        System.out.println("儿子爱玩游戏");
    }
}
