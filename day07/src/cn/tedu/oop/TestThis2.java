package cn.tedu.oop;
/**本类用于测试this的用法2*/
public class TestThis2 {
    public static void main(String[] args) {
        Dog d = new Dog();


        Dog d1 = new Dog("旺财");
    }
}

class Dog{
    public Dog(){
        /**在无参构造中，调用含参构造功能
         * 注意：调用是单向的，不能来回双向调用，否则会死循环*/
        this("小旺旺");
        System.out.println("无参构造");

    }
    public Dog(String s){
        /**在含参构造中，调用无参构造
         *规定；this关键字必须在构造函数的第1行*/
        //this() ;

        System.out.println("含参构造"+s);
    }


}
