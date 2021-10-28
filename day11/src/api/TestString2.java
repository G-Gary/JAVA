package api;

import java.util.Arrays;

/**本类用于测试String类常用方法*/
public class TestString2 {
    public static void main(String[] args) {
        String s1 ="abc";

        char[] c = {'a','b','c'};
        String s2 = new String(c);

        System.out.println(s1);
        System.out.println(s2);
        /**String也重写了hachCode()，根据字符串的具体内容生成了哈希码值
         * 所有虽然s1与s2的地址值不同，此时生成的哈希码值一致*/
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1.equals(s2));

        System.out.println(s1.length());//查看字符串长度
        System.out.println(s1.toUpperCase());//将本字符串转为全大写
        System.out.println(s1.toLowerCase());//将本字符串转为全小写
        System.out.println(s1.startsWith("a"));//判断当前字符串是否以a开头
        System.out.println(s1.endsWith("a"));//判断当前字符串是否以a结尾

        System.out.println(s1.charAt(0));//根据小标获取字符串指定位置上的字符

        String s3 = "abcddabda";
        System.out.println(s3.indexOf("b"));//获取指定字符第一次出现的下标
        System.out.println(s3.lastIndexOf("b"));//获取指定字符最后一次出现的下标

        System.out.println(s2.concat("cxy"));//拼接字符串。注意：不会改变原串s2

        String s5 = "    hh   hhhhh   ";
        System.out.println(s5.trim());//用于去除字符串收尾两端的空格

        String s6 = "abcdefgh";
        System.out.println(s6.substring(3));//从指定下标截取子串[3,结束]
        System.out.println(s6.substring(3,6));//从指定下标截取子串[3,6)含头不含尾

        String s7 = "afbfcfdfef";
        String[] fs = s7.split("f");//以指定的字符f分够字符串s7
        System.out.println(Arrays.toString(fs));
        //要使用数组工具类打印数组的具体元素，否则是数组对象的地址值

        System.out.println(String.valueOf(10));
        System.out.println(String.valueOf(10)+10);//将int类型的参数值10，转为String的参数值“10”，所以是拼接的效果

        byte[] bytes = s2.getBytes();//将字符串转为byte类型的数组
    }
}
