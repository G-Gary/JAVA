package cn.tedu.review;

public class TicketThread {
    public static void main(String[] args) {
        TicketT t1 = new TicketT();
        TicketT t2 = new TicketT();
        TicketT t3 = new TicketT();
        TicketT t4 = new TicketT();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class TicketT extends Thread{
    static int ticket = 100;
    @Override
    public void run() {
        while (true){
            synchronized (TicketT.class){
                if(ticket>0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + "=" + ticket--);

                }
                if (ticket < 1) break;

            }
        }
    }
}
