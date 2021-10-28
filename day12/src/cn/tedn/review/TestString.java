package cn.tedn.review;

public class TestString {
    public static void main(String[] args) {
        //1.1创建String对象的方式1--存在堆中
        char[] values = {'a','b','c'};
        String s1 = new String(values);
        String s11 = new String(values);
        //1.2创建String对象的方式2--存在堆中常量值
        String s2 = "abc";
        String s22 = "abc";

        System.out.println(s1==s2);
        System.out.println(s1==s11);
        System.out.println(s22==s2);
        ///String 重写了继承自Object的3个方法，全体围绕字符串的具体内容
        System.out.println(s1);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));
    }
}
