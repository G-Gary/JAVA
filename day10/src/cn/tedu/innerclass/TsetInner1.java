package cn.tedu.innerclass;
/**本类用于内部类的入门案例*/
public class TsetInner1 {
    public static void main(String[] args) {
        /**外部类名。内部类名 对象名 = 外部类对象。内部类对象*/
        Outer.Inner oi = new Outer().new Inner();
        oi.delete();
        System.out.println(oi.sum);

        //new Outer().find();
    }
}
class Outer{
    String name;
    private int age;
    public void find(){
        System.out.println("Outer....find()");
        //System.out.println(sum);不能直接使用内部类的属性
        //delete();不能直接使用内部类的方法
        /**外部类如果想要使用内部类的资源，必须先创建内部类的对象
         * 然后通过调用内部类对象来调用内部类资源*/
        Inner i = new Inner();
        System.out.println(i.sum);
        i.delete();
    }
    /**根据内部类所在位置的不同，分为；成员内部类(类里方法外)与局部内部类(方法里)*/
    class Inner{
        int sum = 10;
        public void delete(){
            System.out.println("Inner...delete()");
            /**内部类可以直接使用外部类的资源，包括私有资源！*/
            System.out.println(name);
            System.out.println(age);
            //find();
        }
    }

}
