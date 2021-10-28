package cn.gyl.exec;

import sun.security.krb5.internal.Ticket;

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

class Tickets implements Runnable {
    Object o = new Object();
    int tickets = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (o) {
                if (tickets>0){
                    System.out.println(Thread.currentThread().getName() + "=" + tickets--);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                if (tickets < 1) break;
            }

        }
    }
}
