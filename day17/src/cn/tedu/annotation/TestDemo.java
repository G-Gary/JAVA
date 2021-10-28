package cn.tedu.annotation;


@Apple(s=6.6,value = "ss")
public class TestDemo {
    @Apple(s=6.6,value = "ss")
    String name;
    //@Apple(s=6.6,value = "ss")
    public void play(){
        System.out.println("普通方法");
    }
    public  void deleteEmployee(){

    }
}
