package cn.tedu.inter2;
/**本类用于面向接口编程*/
public class TestTeaccherInter {
    public static void main(String[] args) {
        CGBTeacher ct = new CGBTeacher();
        ct.ready();
        ct.teach();
    }
}
interface Teacher{
    void teach();//授课方法
    void ready();//备课方法

}
class CGBTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("授课电商项目");
    }

    @Override
    public void ready() {
        System.out.println("备课电商项目");
    }
}
class ACTTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("正在授课基础加强+框架加强");
    }

    @Override
    public void ready() {
        System.out.println("正在备课基础加强+框架加强");
    }
}
class SCDTeacher implements Teacher{
    @Override
    public void teach() {

    }

    @Override
    public void ready() {
        System.out.println("正在研发新课程");
    }
}