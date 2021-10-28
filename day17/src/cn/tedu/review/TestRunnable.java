package cn.tedu.review;
/**本类用于复写多线程实现方案2：实现Runnable*/
public class TestRunnable {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);
        Thread t4 = new Thread(mr);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
