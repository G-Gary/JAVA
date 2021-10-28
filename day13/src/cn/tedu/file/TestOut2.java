package cn.tedu.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**本类用于字符输出流Writer*/
public class TestOut2 {
    public static void main(String[] args) {
        //method();
        method1();
    }

    private static void method1() {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter("D:\\ready\\1.txt",true));
            out.write(97);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
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

    private static void method() {
        FileWriter out = null;
        try{
            out = new FileWriter("D:\\ready\\1.txt",true);
            out.write(97);

        }catch (Exception e){
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
