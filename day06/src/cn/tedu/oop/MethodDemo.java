package cn.tedu.oop;
/**本类用于测试方法的返回值*/
public class MethodDemo {
    public static void main(String[] args) {
        f1();
        int result = f1();
        System.out.println("写法2："+result);
        System.out.println("写法3："+f1());
        f2();
        f3();
        String a = f2();
        System.out.println(a);
        System.out.println(f2());
    }
    public static int f1(){
        System.out.println("我是f1()");
        return 10;
    }
    public static String f2(){
    return "你好";
    }
    public static void f3(){

    }

}
