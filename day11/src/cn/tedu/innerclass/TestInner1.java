package cn.tedu.innerclass;
/**本类用于复写内部类入门案例*/
public class TestInner1 {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
            oi.delete();
        System.out.println(oi.sum);
    }
}
class Outer{
    String name;
    static int age;
    public void find(){
        System.out.println("Outer的find()");
        /**外部类不可以直接使用内部类资源，如果想要使用，必须先闯将内部类对象
         * 通过内部类对象才能使用*/
        Inner i = new Inner();
        i.delete();
        System.out.println(i.sum);
    }
    /**根据内部类位置的不同，分为
     * 成员内部类：类里方法外
     * 局部内部类：方法里*/
    class Inner{
        int sum = 10;
        public void delete(){
            System.out.println("Inner的delete()");
            /**内部类可以直接使用外部类的资源，包括私有资源*/
            System.out.println(name);
            System.out.println(age);
            //find();
        }
    }
}
