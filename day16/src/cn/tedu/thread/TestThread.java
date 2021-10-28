package cn.tedu.thread;
/**本类用于实现多线程编程方案1：继承Thread类的方法*/
public class TestThread {
    public static void main(String[] args) {
        //4.创建自定义线程类的对象
        MyTherad t1 = new MyTherad();/**对应的是线程的新建状态*/
        MyTherad t2 = new MyTherad();/**对应的是线程的新建状态*/
        MyTherad t3 = new MyTherad();/**对应的是线程的新建状态*/
        MyTherad t4 = new MyTherad();/**对应的是线程的新建状态*/
        t1.start();/**对应的是线程的就绪状态*/
        t2.start();
        t3.start();
        t4.start();
    }
}
//1.自定义线程类，并且让这个类继承Thread类
class MyTherad extends Thread{
    //2.重写父类的run()
    @Override
    public void run(){
    //3.在run()完成自己的业务
    //业务需求：打印10次当前正在干活的线程名
        for (int i = 0; i <10 ; i++) {
            System.out.println(getName()+"="+i);

        }
    }
}
