package cn.tedu.oop;

public class TestDog {
    public static void main(String[] args) {
        //5.1创建Dog类的第1个对象
        Dog d = new Dog();
        //5.2修改d对象的属性值
        d.setName("哮天犬");
        d.setAge(999);
        d.setKing("猎狗");
        d.setHost("二郎神");
        d.setPrice(10000);
        //5.3打印查看d对象的属性值
        System.out.println(d.getName());
        System.out.println(d.getAge());
        System.out.println(d.getKing());
        System.out.println(d.getHost());
        System.out.println(d.getPrice()+"\n");
        //6.1创建Dog类的第2个对象
        Dog d1 = new Dog();
        //6.2修改d1对象的属性值
        d1.setName("罗小黑");
        d1.setAge(2);
        d1.setKing("神奇犬");
        d1.setHost("大自然");
        d1.setPrice(999.99);
        //6.3打印查看d1对象的属性值
        System.out.println(d1.getName());
        System.out.println(d1.getAge());
        System.out.println(d1.getKing());
        System.out.println(d1.getHost());
        System.out.println(d1.getPrice()+"\n");
        //7.调用Dog类的五个方法
        d.run();
        d.eat(5);
        d.sleep(8.8);
        //d.play(d.getHost());//方式一：只掉有play()的功能

        //方式二：不仅调用play()的功能还接收了返回值飞盘交个r保存
        String r = d.play(d.getHost());
        System.out.println(r);
        //方法三：调用play()的功能，并直接答应play()的返回值飞盘
        System.out.println(d.play(d.getHost()));

    }
}
//1.定义小狗类
class Dog{
    //2.定义5个属性
    //3.1使用private修饰所有属性
    private String name;//姓名
    private int age;//年龄
    private String king;//品种
    private String host;//主人
    private double price;//价格
    //3.2添加被封装属性的公共get与set方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getKing() {
        return king;
    }
    public void setKing(String king) {
        this.king = king;
    }
    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    //4.1添加小狗类功能1
    public void run(){
        System.out.println("小狗Dog跑到老快了");
    }
    //4.2添加小狗类功能2
    public void eat(int n){
        System.out.println("小狗今晚要吃"+n+"根肉骨头");
    }
    //4.3添加小狗类功能3
    public void sleep(double num){
        System.out.println("小狗睡了"+num+"个小时");
    }
    //4.4添加小狗类功能4
    public String play(String host){
        System.out.println("小狗与主人"+host+"玩的很开心");
        bark();
        return "飞盘";
        //bark();//遇到return时已经结束本方法了，return后不可以直接写代码
    }
    //4.5添加小狗类功能5
    private void bark(){
        System.out.println("小狗喜欢汪汪叫");
    }
}

