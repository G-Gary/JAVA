package cn.tedu.oop;
/**本类用于测试final关键字*/
public class TestFinal {
}
/**1.final可以用来修饰类，被final修饰的类是最终类，不可以被继承
 * 可以把被final修饰的类看成树结构中的叶子节点*/

//final class Father2{
class Father2{
    /**final可以用来修饰方法，被final修饰的方法是这个方法的最终实现，不可以被重写*/
    //final public void  work()
    public void  work(){
        System.out.println("在工厂里上班");
    }

}
class Son2 extends Father2{
    final int C = 66;

    @Override//这个注解用来标记这是一个重写的方法
    public void  work(){
        /**3.被final修饰的是常量，常量的值不可以被修改
         * 注意：不管是成员位置还是局部位置，常量定义的时候必须赋值
         * 注意：常量的名称必须是全大写，单词与单词之间使用_分割*/
        final int B = 100;
        //b = 1000;//报错：常量的值不可以被修改
        System.out.println("在互联网大厂上班");
    }

}
