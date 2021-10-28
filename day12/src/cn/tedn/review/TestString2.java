package cn.tedn.review;


import java.util.Arrays;

/**本类用于复习String的常用API*/
public class TestString2 {



    public static void main(String[] args) {
        String s1 = "abc";

        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.startsWith("c"));
        System.out.println(s1.endsWith("c"));
        System.out.println(s1.charAt(0));
        //System.out.println(s1.charAt(4));

        String s2 = "abfgcbddn";
        System.out.println(s2.indexOf("b"));
        System.out.println(s2.lastIndexOf("b"));

        System.out.println(s1.concat("yyy"));
        System.out.println(s1);

        String s3 = "   dddddddddd ddd    dddddd      ";
        System.out.println(s3.trim());

        String s4 = "abcdefgh";
        System.out.println(s4.substring(2));
        System.out.println(s4.substring(2,6));

        System.out.println(String.valueOf(10)+10);
        System.out.println("10"+10);
        System.out.println(10+10);

        byte[] bs = s1.getBytes();
        System.out.println(Arrays.toString(bs));

        String s5 = "a b c d e";
        String[] s =s5.split(" ");
        System.out.println(Arrays.toString(s));
    }
}
