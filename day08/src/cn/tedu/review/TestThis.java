package cn.tedu.review;

public class TestThis {
}
class Car{
    int id;
    String brand;
    double price;
    public Car(){
        this(666);
        System.out.println("这个是无参构造");
    }
    public Car(int n){
        //this();
        System.out.println("含参构造"+n);

    }

    public void run(){
        int id = 100 ;
        System.out.println(id);
        System.out.println(this.id);
    }
}
