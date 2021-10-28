package cn.tedu.oop;
/**本类用于静态static的入门案例*/
public class TestStatic1 {
    public static void main(String[] args) {
        Fruit f = new Fruit();
        Fruit f2 = new Fruit();
        f.grow();
        f.clean();//没有提示，需要自己写
        Fruit.clean();//我们可以通过类名直接调用静态方法，而且这个IDEA会提示
        System.out.println(f.weight);
        System.out.println(f.kind);//没提示
        System.out.println(Fruit.kind);//有提示，类名直接调用静态属性
        /**静态资源在内存中只有一封，而且被全局所有对象所共享
         * 所有；当我们通过任意一种方式修改了静态变量的值以后
         * 不管用任何方式查看，静态变量的值都是刚刚修改后的值*/
        Fruit.kind = "苹果";
        System.out.println(Fruit.kind);
        System.out.println(f.kind);
        System.out.println(f2.kind);
        f.kind= "香蕉";
        System.out.println(Fruit.kind);
        System.out.println(f.kind);
        System.out.println(f2.kind);
    }
}
/**被static修饰的资源统称为静态资源
 * 静态资源是随着加载而加载到内存中的，比对象优先进入内存
 * 所有静态资源可以通过类名直接调用，即使没有创建对象，也可以调用*/
class Fruit{
    /**1.可以用static修饰属性*/
    static String kind;//品种
    double weight;//重量
    /**2.可以用static修饰方法*/
    public static void clean(){
        System.out.println("洗水果洗水果");
    }
    public void  grow(){
        System.out.println("这个果子长得一看就很好吃");
    }
}
class F{
    public Animal get() {
        Animal a = new Animal();
        return a;
    }

}
class S extends F{
    public C get(){
        C c = new C();
        return c;
    }
}
class Animal{}
class  C extends Animal{}
