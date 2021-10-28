package cn.tedu.review;
/**本类用于复写单例设计模式懒汉式实现方式*/
public class Singleton2 {
    public static void main(String[] args) {
        Mysingle2 s1 = Mysingle2.getSingle2();
        Mysingle2 s2 = Mysingle2.getSingle2();
        System.out.println(s1==s2);
        System.out.println(s1);
        System.out.println(s2);



    }
}
class Mysingle2{
    private Mysingle2(){}
    private static Mysingle2 single2;
    public static Mysingle2 getSingle2(){
        if (single2==null){
            single2 = new Mysingle2();
        }
        return single2;
    }
}
