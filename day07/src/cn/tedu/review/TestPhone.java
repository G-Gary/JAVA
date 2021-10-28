package cn.tedu.review;
/**本类用于复习面向对象案例*/
public class TestPhone {
    public static void main(String[] args) {
        phone p1 = new phone();
        p1.setBrand("banan");
        p1.setColor("石墨黑");
        p1.setPrice(1);
        p1.setSize(2);
        System.out.println(p1.getBrand());
        System.out.println(p1.getColor());
        System.out.println(p1.getPrice());
        System.out.println(p1.getSize());
        phone p2 =new phone();
        //p2.music();
        p2.video();
        p2.message();



    }
}
class phone{
    private String brand;
    private  double size;
    private double price;
    private String color;

    private void music(){
        System.out.println("正在听音乐");
    }
    public void message(){
        System.out.println("正在发短信");
    }
    public void video(){
        System.out.println("正在看直播");
    }




    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}