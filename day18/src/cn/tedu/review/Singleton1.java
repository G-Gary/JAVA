package cn.tedu.review;
/**本类用于复写单例设计模式饿汉式实现方法*/
public class Singleton1 {
    public static void main(String[] args) {
        Mysingle s1 = Mysingle.getSingle();
        Mysingle s2 = Mysingle.getSingle();
        System.out.println(s1==s2);

    }
}
class Mysingle{
    private Mysingle(){}
    private static Mysingle single =new Mysingle();
    public static Mysingle getSingle(){
        return single;
    }
}
