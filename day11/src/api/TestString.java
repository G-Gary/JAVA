package api;
/**本类用于练习String类的使用*/
public class TestString {
    public static void main(String[] args) {
    //1.创建String对象的方式一
        /**1.字符串类型底层维护的是char[]，存在堆内存中*/
        char[] valuse = {'a','b','c'};
        String s2 = new String(valuse);//触发String类的构造函数：String(char[] value)
        String s22 = new String(valuse);//触发String类的构造函数：String(char[] value)
        System.out.println("查看s2" +s2);
    //2.创建String对象的方拾二
        /**2.此种创建方式不仅写法简单，效率还高，字符串存在堆内存中的常量池
         * 效果：如果第一次创建，会正常放入常量池
         * 但第二次创建就不会在常量池里新建了使用的是之前创建好的值"abc"*/
        String s3 = "abc";
        String s33 = "abc";
        System.out.println("查看s3"+ s3);
        System.out.println(s2==s22);
        System.out.println(s3==s33);
        System.out.println(s2==s3);

        /**Object中equals()默认使用==比较地址值
         * 但String重写了这个方法，比较的是两个字符串的具体内容
         * 不论创建方式，只要字符串的内容一样，equals()就返回true*/
        System.out.println(s2.equals(s22));
        String s4 = "hello";
        System.out.println(s4.equals(s2));
    }
}
