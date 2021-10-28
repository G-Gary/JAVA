package cn.gyl.exec;

import java.util.Scanner;

//如数一串字符串，
public class TestBlock {
    public static void main(String[] args) {
        System.out.println("请输入你的句子");
        String s = new Scanner(System.in).nextLine();
        //String s ="this is a ads";
        int i1 = 0;
        int max = 0;
        char c = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=c){
                ++i1;
                if (i1>max){
                    max=i1;
                }
            }else {
                i1=0;
            }
        }
        System.out.println(max);
    }
}
