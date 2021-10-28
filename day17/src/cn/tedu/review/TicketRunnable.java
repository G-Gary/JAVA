package cn.tedu.review;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**复写实现接口方式的售票案例*/
public class TicketRunnable {
    public static void main(String[] args) {
        Ticket tic = new Ticket();
//        Thread t1 = new Thread(tic);
//        Thread t2 = new Thread(tic);
//        Thread t3 = new Thread(tic);
//        Thread t4 = new Thread(tic);
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
        /**Excutors是用来辅助创建线程池的工具类
         * 常用方法：
         * newFixedThreadPool(int)这个方法可以创建指定数目线程的多线程池对象
         * 创建出来的线程池对象就是ExecutorService，负责：新建|启动|销毁 线程*/
        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            /**execute()让线程池中的线程来执行业务，每次调用都会将一个线程加入就绪队列
             * 本方法的参数就是你要执行的业务，也就是目标业务类对象*/
            pool.execute(tic);
        }


    }
}

class Ticket implements Runnable {
    int tickets = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (TicketRunnable.class) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "=" + tickets--);

                }
                if (tickets < 1) break;
            }

        }
    }
}
