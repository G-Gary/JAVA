package cn.tedu.oop;
/**本类用于面向对象的巩固练习*/
public class TestCar {
    public static void main(String[] args) {
        //4.创建汽车类对象
        Car c = new Car();
        //5.设置创建好的对象的属性值
//        c.brand = "BMW";
//        c.color = "活力橙";
//        c.length = 200;
//        c.price = 0.2;
//        //6.查看刚刚设置好的属性值
//        System.out.println(c.brand);
//        System.out.println(c.color);
//        System.out.println(c.length);
//        System.out.println(c.price);
        //7.3操作set方法给所有属性复制
        c.setBrand("特斯拉");
        c.setColor("暗夜黑");
        c.setLength(199.9);
        c.setPrice(0.3);
        //7.4操作get方法查看属性的赋值是否成功
        System.out.println(c.getBrand());
        System.out.println(c.getColor());
        System.out.println(c.getLength());
        System.out.println(c.getPrice());
        //8.通过创建好的对象调用汽车的功能
        c.start();
        //c.stop();
    }
}
//抽象汽车这一类事物的共同点，用class描述
class Car{
    //2.属性--用成员变量来描述
    //7.1封装所有属性
    //7.2生成所有属性对应的get与set方法
    //右键->Generate->Getter and Setter->Shift全选所有属性->OK
    private String brand;//品牌
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    private String color;//颜色
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    private double price;//价位
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    private double length;//车长
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    //3.功能--用方法来描述
    public void  start(){
        System.out.println("汽车启动了");
        //9.2在本类的公共方法里调用被封装的方法
        stop();
    }
    //9.1封装汽车停止的方法
    private void  stop(){
        System.out.println("汽车停止了");
    }
}