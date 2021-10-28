package cn.tedu.file;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

/**本类用于测试字符输入流Reader的读取操作*/
public class TestIn2 {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        //method();//用于测试普通字符输入流
        method2();//用于高效字符输入流
        long a1 = System.currentTimeMillis();
        System.out.println(a1-a);


    }

    private static void method2() {
        BufferedInputStream in1 = null;
        try {
            in1 = new BufferedInputStream(new FileInputStream("D:\\ready\\1.txt"));
            int b ;
            while ((b=in1.read())!=-1){
                System.out.println(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                in1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method() {
        FileReader in =null;

        //1.创建流对象
        try {
        //FileReader in2 = new FileReader(new File("D:\\ready\\1.txt"));
            in = new FileReader("D:\\ready\\1.txt");
            int b ;
        //2.使用流对象
            while((b=in.read())!=-1){
                System.out.println(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        //3.关流
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
