package cn.tedu.api;

import java.util.Scanner;

/**本类用于测试正则表达式*/
//需求：接收用户输入的身份证号。判断用户输入的数据是否正确
public class TestRegex {
    public static void main(String[] args) {
        //1.编辑正则表达式
        //身份证号的规律：一共18位，前17位是数字，第18位有可能是数字，有可能是“X”
        String regex = "[0-9]{17}[0-9X]";

        //2.定义变量用于接收用户输入的身份证号
        String input;
        //3.判断用户输入的数据是否符号正则表达式，如果不正确，继续输入
        do{
            //3.1提示并接收用户输入的数据
            System.out.println("请你输入身份证号");
            input = new Scanner(System.in).nextLine();
            //3.2判断是否正确，如果正确，结束循环
            if(input.matches(regex)){//input数据是否匹配matches(正则表达式)
                System.out.println("恭喜您，输入正确");
                return;
            }
        }while(!input.matches(regex));//只要不符合正则，就继续循环继续输入
        System.out.println(input);
    }

}
