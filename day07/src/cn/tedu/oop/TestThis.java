package cn.tedu.oop;
/**本类用于this测试*/
public class TestThis {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
    }
}
class Cat{
    int count = 666;
    int sum = 100;
    public void eat(){

        int sum = 10;
        System.out.println(sum);
        /**当成员变量与局部变量同名时，可以使用this指定本类的成员变量
         * 如果不使用this指定，打印的就是近处的这个局部变量，就近原则*/
        System.out.println(this.sum);
        System.out.println(count);

    }
}
