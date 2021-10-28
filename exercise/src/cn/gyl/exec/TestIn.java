package cn.gyl.exec;

import java.io.*;

public class TestIn {
    public static void main(String[] args) {
        method();
        method1();
    }

    private static void method1() {
        BufferedInputStream i = null;
        try {
            i = new BufferedInputStream(new FileInputStream("D:\\ready\\1.txt"));
            int b ;
            while((b=i.read())!=-1){
                System.out.println(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                i.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private static void method() {
        FileInputStream i = null;
        try {
            i = new FileInputStream("D:\\ready\\1.txt");
            int b ;
            while ((b=i.read())!=-1){
                System.out.println(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{
               i.close();

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
