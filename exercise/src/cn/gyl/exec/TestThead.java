package cn.gyl.exec;

public class TestThead {
    public static void main(String[] args) {
        Tickets1 t1 = new Tickets1();
        Tickets1 t2 = new Tickets1();
        Tickets1 t3 = new Tickets1();
        Tickets1 t4 = new Tickets1();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
class Tickets1 extends Thread{
    static int tickets = 100;
    @Override
    public void run(){
        while (true){
            synchronized (Tickets1.class){
                if (tickets>0){

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName()+"="+tickets--);
                }
            if (tickets<1)break;
            }
        }
    }
}
