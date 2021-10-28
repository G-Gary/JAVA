package cn.tedu.innerclass;
/**本类用于测试匿名内部类
 * 匿名内部类没有名字，通常与匿名对象结合在一起使用
 * 匿名对象只能使用一次，一次只能调用一个功能
 * 匿名内部类充当了实现类的角色，去实现接口/抽象类中的抽象方法，只是没有名字而已*/
public class TestInner5 {
    public static void main(String[] args) {
    //传统方式：创建接口+创建接口实现类+实现类实现接口中所有的抽象方法
    //创建接口实现类的对象+通过对对象调用实现了功能
        //3.创建接口的匿名对象与匿名内部类，并调用实现后的save()
        new Inter1() {
            @Override
            public void save() {
                System.out.println("保存");
            }

            @Override
            public void get() {
                //System.out.println("获取");
            }

        }.save();
        //5.创建抽象类对应的匿名类对象和匿名内部类
        new Inter2() {
            @Override
            public void set() {
                System.out.println("设置");
            }
        }.set();
        //7.创建普通类的匿名对象，并调用方法
        new Inter3().study();
    }

}
//1.创建接口
interface Inter1{
    //2.定义接口中的抽象方法
    void save();
    void get();
}
//4.创建抽象类
abstract class Inter2{
    public void play(){
        System.out.println("玩代码");
    }
    abstract public void set();
}
//6.创建普通类
class Inter3{
    public void study(){
        System.out.println("再冷的天也不能阻止我当学霸");
    }
    public void PowerUp(){
        System.out.println("我们会越来越强");
    }

}