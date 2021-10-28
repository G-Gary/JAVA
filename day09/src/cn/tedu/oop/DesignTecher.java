package cn.tedu.oop;
/**本类用于面向抽象编程的设计老师类*/
public class DesignTecher {
    public static void main(String[] args) {
        CGBTecher ct = new CGBTecher();
        SCDTecher st = new SCDTecher();
        ct.ready();
        ct.teach();
        st.ready();
        st.teach();
    }
}
abstract class Techer{
    String name;
    int id;
    public abstract void ready();
    public abstract void teach();

}
/**创建培优班老师累--主打电商项目*/
class CGBTecher extends Techer{
    public void ready(){
        System.out.println("备课电商项目");
    }
    public void teach(){
        System.out.println("授课电商项目");
    }
}
/**创建SCD大数据老师类*/
class SCDTecher extends Techer {
    public void ready(){
        System.out.println("备课hadoop spark");
    }
    public void teach(){
        System.out.println("授课hadoop spark");
    }
}
class ACTTecher extends Techer{
    @Override
    public void ready() {
        System.out.println("");
    }

    @Override
    public void teach() {
        System.out.println("");
    }
}
