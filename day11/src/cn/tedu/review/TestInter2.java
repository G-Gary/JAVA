package cn.tedu.review;
/**本类用于接口复习2*/
public class TestInter2 {
}
//1.定义接口2与接口2里的两个方法
interface Inter2{
    void add();
    void delete();
}
//2.定义接口3与接口3里的两个方法
interface Inter3{
    void update();
    void find();
}
//3.定义接口4
interface Inter4 extends Inter2,Inter3{
    void eat();
}
//5.创建实现类
//class InterImpl implements Inter4{
class InterImpl implements Inter2,Inter3{

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void find() {

    }

//    @Override
//    public void eat() {
//
//    }
}
