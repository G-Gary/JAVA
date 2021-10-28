package cn.tedu.tickets;

public class TestRunnable2 {    public static void main(String[] args) {
    TicketsV2 tic = new TicketsV2();
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
/**同步锁：
 * 相当于给容易出现问题的代码加了一把锁，包裹了所有可能会出现数据安全问题的代码
 * 枷锁之后，就有了同步（排队）的效果，但是，加锁的范围需要考虑：
 * 不能太大，太大，干啥都得排队，效率低，也不能太小，太小，锁不住，还是会有安全隐患*/
class TicketsV2 implements Runnable{
    int tickets =100;
    Object o = new Object();
    @Override
    public void run() {
        while (true){
            /**同步代码块：synchronized（锁对象）{会出现安全隐患的所有代码}
             * 在同步代码块中的代码，同一时刻只会被一个线程执行
             * 注意：同步代码块必须保证所有线程对象使用同一把唯一的锁
             * 必须唯一！！！所对象的类型不做限制，唯一就行*/

           //synchronized (new Object()){//不对！！！这样锁对象不唯一
           synchronized (o){
               if (tickets >0){
                   try {
                       Thread.sleep(10);//让当前线程休眠10ms
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println(Thread.currentThread().getName()+"="+tickets--);
               }
               if (tickets<1)break;
           }
        }
    }
}
