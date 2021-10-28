package cn.tedu.review;
/**本类用于复习继承中的成员变量的使用*/
public class TestExtends2 {
    public static void main(String[] args) {

    }
}
class Father{
    int sum = 1;
    int count = 2;
}
class son extends Father{
    int sum = 10;
    public void study(){
        System.out.println("study()...");
         int sum = 100;
        System.out.println(sum);
        System.out.println(this.sum);
        System.out.println(count);
        System.out.println(super.sum);
    }
}
