package cn.tedu.thread;
/**本类用于多线程编程实现方案2：实现Runnable接口*/
public class TsetRunnable {
    public static void main(String[] args) {
        //4.创建自定义线程类对象--作为业务对象
        MyRunnable target = new MyRunnable();
        //5.创建线程对象，并将业务对象交给线程对象
        Thread t1 = new Thread(target);
        Thread t2 = new Thread(target);
        Thread t3 = new Thread(target);
        Thread t4 = new Thread(target);
        //6.以多线程的方式启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
//1.自定义多线程类
class MyRunnable implements Runnable{
    //2.添加父接口中未实现的抽象方法，这个方法用来完成自己的业务
    @Override
    public void run() {
        //3.完成业务：打印10次当前正在干活的线程名
        for (int i = 0; i <10 ; i++) {
            /**问题：自定义与父接口Runnable中都没有获取名字的方法
             * 所有还需要重Thread类里找
             * currentThread()：静态方法，获取当前正在执行的线程对象
             * getName()：获取当前正在执行的线程对象的名称*/
            System.out.println(Thread.currentThread().getName()+"="+i);
        }
    }
}
