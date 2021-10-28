package cn.tedu.review;
/**本类用于复习多态*/
public class TestDemo {
    public static void main(String[] args) {
        Fruit f = new Fruit();
//        Fruit f1 = new Apple();
//        Fruit f2 = new Lemon();
//        f.clean();
//        f1.clean();
//        f2.clean();
//        //f2.get();
//        System.out.println(f.name);
//        System.out.println(f1.name);
//        System.out.println(f2.name);
//
//        f1.grow();
//        f2.grow();
        /**不管是父类对象还是子类对象，都可以调用getFruit（）
         * 原因；利用多态，将子类类型的对象看做父类类型*/
        getFruit(f);
        Apple a = new Apple();
        getFruit(a);
        Lemon l = new Lemon();
        getFruit(l);
    }
    public static void getFruit(Fruit f){
        f.clean();
    }
}
class Fruit{
    String name = "水果";
    public void clean(){
        System.out.println("父类的clean()");
    }
    public void grow(){

    }
}
class Apple extends Fruit{
    String name = "苹果";
    @Override
    public void clean(){
        System.out.println("苹果类的clean()");
    }
}
class Lemon extends Fruit{
    String name = "柠檬";
    @Override
    public void clean(){
        System.out.println("柠檬类的clean()");
    }
    public void get(){
        System.out.println("柠檬类的get()");
    }
}
