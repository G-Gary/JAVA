package cn.tedu.oop;
/**本类用于面向对象入门案例*/
/**在一个java文件中可以写多个class，但是被public修饰的class只能有一个
 * 而且这个公共类的名字要求就是当前文件的名字*/
public class TestCreataClass {
    public static void main(String[] args) {
        new Phone();
        Phone p = new Phone();
        p.call();
        p.message();
        p.video();
        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println(p.color);
        System.out.println(p.size);
        Phone p2 = new Phone();
        p2.message();
        p2.video();
        p2.call();
        p2.brand = "华为";
        p2.color = "五彩斑斓的黑";
        p2.price = 8888.88;
        p2.size = 5.6;

        System.out.println(p2.brand);
        System.out.println(p2.color);
        System.out.println(p2.price);
        System.out.println(p2.size);
    }
}
class Phone{
    String brand;//品牌
    double price;//价格
    double size;//尺寸
    String color;//颜色
    public void call(){
        System.out.println("正在打电话");

    }
    public void message(){
        System.out.println("正在发短信");
    }
    public void  video(){
        System.out.println("正在看直播");
    }
}