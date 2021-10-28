package cn.tedu.tickets;
/**需求：设计多线程编程模型，4个窗口共计售票100张
 * 本方案使用多线程的实现方案1：extends Thread*/
public class TestTherad {
    public static void main(String[] args) {
        TicketThread t1 = new TicketThread();
        TicketThread t2 = new TicketThread();
        TicketThread t3 = new TicketThread();
        TicketThread t4 = new TicketThread();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
//1.自定义多线程售票类，继承Thread
class TicketThread extends Thread{
    //3.定义变量，用来保存要买的票数
    /**问题：4个线程对象共计售票400张，原因是创建了4个不同的线程对象
     * 每个对象都把票数tickets看做自己独有的成员变量，互不影响
     * 解决：将票数设置为静态，让全局所有对象共享*/
        static int tickets = 100;
    //2.重写父类中的run()，里面是我们的业务
    @Override
    public void run(){
//        for (int i = 0; i <26 ; i++) {
//            System.out.println(getName());

        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName()+"="+tickets--);
            if (tickets < 1){
                break;
            }
            }

        }
    }
