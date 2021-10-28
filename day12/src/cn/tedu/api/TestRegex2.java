package cn.tedu.api;

import java.util.Scanner;

/**本类用于复写身份证号验证案例*/
public class TestRegex2 {
    public static void main(String[] args) {
        //String regex = "[0-9]{17}[0-9x]";
        /**单个\在JAVA中有特殊的含义，表示转义符号，不认为这是一个单纯的斜杠
         * 所有，如果想要单纯的表示一个斜杠，需要在它前面再加一个斜杠用来转义
         * 也就是\\才单纯的表示为一个斜杠*/
        String regex2 = "\\d{17}[0-9x]";

        System.out.println("请输入身份证号");
        String input = new Scanner(System.in).nextLine();
        if(input.matches(regex2)){
            System.out.println("输入正确");
        }else {
            System.out.println("输入错误");
        }

        }
    }

