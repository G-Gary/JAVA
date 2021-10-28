package cn.tedu.inter2;
/**本类用于测试接口于类之间的复杂关系*/
public class TestRelation {
    public static void main(String[] args) {
        Inter3Impl i = new Inter3Impl();
        i.delete();
        i.find();
        i.save();
        i.update();
    }
}
//接口1
interface Inter1{
    void save();
    void delete();
}
//接口2
interface Inter2{
    void update();
    void find();
}
//接口3 继承 接口1与接口2
/**1.接口可以继承接口，而且还可以多继承，也就是一个子接口继承多个父接口
 * 多个接口之间使用逗号分隔*/
interface Inter3 extends Inter1,Inter2{

}
//class Inter3Impl implements Inter3
/**2.实现类与接口是实现的关系，并且实现类可以实现多个接口，接口之间用逗号隔开
 * 对于JAVA中的类而言，遵循：单继承，多实现的规则
 * 对于JAVA中的接口而言，遵循：既可以单继承，也可以多继承*/
class Inter3Impl implements Inter1,Inter2{
    @Override
    public void save() {
        System.out.println("稍等...正在努力保存中...");
    }

    @Override
    public void delete() {
        System.out.println("小二正在马不停蹄的删除中..");
    }

    @Override
    public void update() {
        System.out.println("客观，马上接更新好了");
    }

    @Override
    public void find() {
        System.out.println("正在查询，请稍后...");
    }
}