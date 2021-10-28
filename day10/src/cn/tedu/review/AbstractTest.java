package cn.tedu.review;
/**本类用于复习抽象*/
public class AbstractTest {
    public static void main(String[] args) {
        Techer t = new CGBTecher();
        t.ready();

    }
}
abstract class Techer{
    String name;
    int id;
    public abstract void ready();
    public abstract void teach();
}
class CGBTecher extends Techer{
    @Override
    public void ready() {
        System.out.println("正在准备互联网架构");
    }

    @Override
    public void teach() {
        System.out.println("正在授课互联网架构");
    }
}
abstract class ACTTecher extends Techer{

    @Override
    public void ready() {
        System.out.println("正在准备加薪课");
    }

}

