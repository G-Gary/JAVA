package cn.tedu.review;
/**本类用于复写多线程实现方案1：继承Thread*/
public class TestThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class MyThread extends  Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(getName());
        }
    }
}
