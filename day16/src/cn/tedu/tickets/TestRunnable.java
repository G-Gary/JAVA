package cn.tedu.tickets;
/**需求：设计多线程编程模型，4个窗口共计售票100张
 * 本方案使用多线程的实现方案1：extends Thread*/
public class TestRunnable {
    public static void main(String[] args) {
        Tickets tic = new Tickets();
        Thread t1 = new Thread(tic);
        Thread t2 = new Thread(tic);
        Thread t3 = new Thread(tic);
        Thread t4 = new Thread(tic);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
class Tickets implements Runnable{
     int tickets =100;
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(10);//让当前线程休眠10ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"="+tickets--);
            if (tickets<1)break;
        }
    }
}
