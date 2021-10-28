package cn.tedu.tickets;

public class TestThreadV2 {
    public static void main(String[] args) {
        TicketThreadV2 t1 = new TicketThreadV2();
        TicketThreadV2 t2 = new TicketThreadV2();
        TicketThreadV2 t3 = new TicketThreadV2();
        TicketThreadV2 t4 = new TicketThreadV2();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

//1.自定义多线程售票类，继承Thread
class TicketThreadV2 extends Thread {
    //3.定义变量，用来保存要买的票数
    /**
     * 问题：4个线程对象共计售票400张，原因是创建了4个不同的线程对象
     * 每个对象都把票数tickets看做自己独有的成员变量，互不影响
     * 解决：将票数设置为静态，让全局所有对象共享
     */
    static int tickets = 100;
    static Object o = new Object();

    //2.重写父类中的run()，里面是我们的业务
    @Override
    public void run() {
//        for (int i = 0; i <26 ; i++) {
//            System.out.println(getName());

        while (true) {
           // synchronized (o) {//方式一
            /**我们每通过class关键字创建一个类，就会在工作空间生成唯一对应的类名.class字节码文件
             * 这个类名.class对应的对象，我们称之为这个类的字节码对象
             * 字节码对象及其重要，是反射技术的基石，字节码对象中包含了当前类所有的关键信息
             * 所有，用这样一个唯一且明确的对象作为同步代码块的对象锁，在合适不过了*/
            synchronized (TicketThreadV2.class) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + "=" + tickets--);
                }
                if (tickets < 1) break;

            }

        }

    }
}
