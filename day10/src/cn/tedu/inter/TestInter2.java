package cn.tedu.inter;

public class TestInter2 {
    public static void main(String[] args) {
        Inter2Impl i = new Inter2Impl();
        i.get();
    }
}
interface Inter2{
    public abstract void get();
}
class Inter2Impl implements Inter2{

    @Override
    public void get() {
        System.out.println("实现");
    }
}
