package cn.tedu.design;

public class Singleton2 {
    public static void main(String[] args) {
        MySingle2 m1 = MySingle2.getMySingle2();
        MySingle2 m2 = MySingle2.getMySingle2();
        System.out.println(m1==m2);
        System.out.println(m1);
        System.out.println(m2);
    }
}
class MySingle2{
    private MySingle2(){};
    private static MySingle2 mySingle2;
    public static MySingle2 getMySingle2(){
        if (mySingle2==null){
            mySingle2=new MySingle2();
        }
        return mySingle2;
    }
}
