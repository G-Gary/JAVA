package cn.gyl.exec;

public class DesignCar {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.getColor());
        c.start();
        c.stop();

        BMW b = new BMW();
        System.out.println(b.color);
        System.out.println(b.getColor());
        b.start();
        b.stop();

        Car c1 = new TSL();
        System.out.println(c1.getColor());
        c1.start();
        c1.stop();

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
    String color = "五彩斑斓的白";
    @Override
    public void start(){
        System.out.println("都让开，我准备起飞了");
    }
}
class TSL extends Car{
    public void start(){
        System.out.println("都让开，我把刹车拆了");
    }
    public void swim(){
        System.out.println("都让开，我要下潜了");
    }
}