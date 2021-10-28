package cn.tedu.oop;

import java.util.InputMismatchException;
import java.util.Scanner;

/**本类用于异常的入门案例*/
public class ExceptionDemo {
    public static void main(String[] args) {
        //method1();
        //method2();//调用解决异常的方法--异常解决方案1--捕获处理--自己解决
        /**main()不直接调用会抛出异常的method3()
         * 而是调用f(),f()解决了method3()可能会抛出异常*/
        //method3();//调用解决异常的方法--异常解决方案2--向上抛出--交给调用者来解决
    }
    /**如果一个方法抛出了异常，谁调用了这个方法，谁就需要处理这个异常
     * 这里的处理也有两种方案：捕获解决 或者 继续向上抛出
     * 但注意；我们一般会在main()调用之前将异常解决掉
     * 而不是将问题抛给main()，因为没人解决了，该报错还是报错*/
    /**异常抛出的格式：在方法的小括号与大括号之间，写；throws 异常类型
     * 如果有多个异常，使用逗号分隔即可*/
    //private static void method3() throws ArithmeticException,InputMismatchException{
    private static void method3() throws Exception{
        System.out.println("请输入你要计算是整数");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入你要计算是整数");
        int b = new Scanner(System.in).nextInt();
        System.out.println(a/b);
    }

    /**异常捕获处理的格式；
     * try{
     *     可能会抛出异常的代码
     * }catch(异常的类型 异常的名字){
     *     万一捕获到了异常，进行处理的解决方案
     * }
     * try—catch结构可以嵌套，如果有多种异常类型需要特殊处理的话
     * */
    private static void method2() {
        try{
            System.out.println("请输入你要计算是整数");
            int a = new Scanner(System.in).nextInt();
            System.out.println("请输入你要计算是整数");
            int b = new Scanner(System.in).nextInt();
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("除数不能为0");
        }catch(InputMismatchException e){
            System.out.println("请输入规定的整数类型");
            /**使用多态的思想，不论是什么异常，统一看做父类型Exception
             * 做出更加通用的解决方案，甚至可以只写这一个，上面2个不写了*/
        }catch(Exception e){
            System.out.println("你输入的数据不对，请重新输入");
        }
    }

    public static void method1(){
        System.out.println("请输入你要计算是整数");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入你要计算是整数");
        int b = new Scanner(System.in).nextInt();
        //输入11和0，报错；ArithmeticException--算数异常，除数不能为0，数学规定
        //输入11和3.4，报错；InputMismatchException--输入不匹配异常1
        System.out.println(a/b);
        /**1.不要害怕BUG，真正的勇士敢于直面自己写的BUG
         * 2.学会看报错的信息提示，确认自己错误的方法
         * 3.学会看报错的行号提示，确认自己报错的位置，哪里不对点哪里
         * 注意；源码不会错，要看的是自己写的代码*/
    }

}
