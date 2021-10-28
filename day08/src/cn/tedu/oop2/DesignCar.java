package cn.tedu.oop2;
/**本类用于完成汽车设计案例*/
public class DesignCar {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.getColor());
        c.start();
        c.stop();
        //c.swim();//报错，父类对象不可以调用子类的特有功能
        BMW b = new BMW();
        System.out.println(b.color);
        System.out.println(b.getColor());
        b.start();
        b.stop();

        Car c1 = new TSL();
        //System.out.println(Color());
        System.out.println(c1.getColor());
        c1.start();
        c1.stop();
        //c1.swim();

    }

}

class Car{
    private String brand;
    private String color;
    private int id;
    private double price;

    public void start(){
        System.out.println("我的小车车启动了");
    }
    public void stop(){
        System.out.println("诶呀妈呀熄火了");
    }



    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
class BMW extends Car{
    String color = "五彩斑斓的黑";
    @Override
    public void start(){
        System.out.println("都让开，我要起飞了");
    }
}
class TSL extends Car{
    @Override
    public void stop(){
        System.out.println("唉呀妈，怎么停不下来");
    }
    public void swim(){
        System.out.println("没想到吧，我还会潜水");
    }
}