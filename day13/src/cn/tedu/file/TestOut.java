package cn.tedu.file;

import com.sun.xml.internal.ws.api.addressing.OneWayFeature;

import java.io.*;

public class TestOut {
    public static void main(String[] args) {
        //method1();
        method2();
                
    }

    private static void method2() {

        BufferedOutputStream out=null;

        //out = new BufferedOutputStream(new FileOutputStream(new File("D:\\ready\\1.txt")));
        //out = new BufferedOutputStream(new FileOutputStream("D:\\ready\\1.txt"));
        //out = new BufferedOutputStream(new FileOutputStream(new File("D:\\ready\\1.txt"),true));
        try {
            out=new BufferedOutputStream(new FileOutputStream("D:\\ready\\1.txt",true));
            out.write(98);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method1() {
        FileOutputStream out=null;
        try {
             //out = new FileOutputStream("D:\\ready\\1.txt");
             out= new FileOutputStream("D:\\ready\\1.txt",true);
             out.write(97);
             out.write(97);
             out.write(97);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
