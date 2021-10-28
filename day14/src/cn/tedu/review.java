package cn.tedu;

import java.io.*;

/**本类用于复习流对象的复习*/
public class review {
    public static void main(String[] args) {
        //f1();//用于复习字节流
        f2();//用于复习字符流
    }

    private static void f2() {
        FileReader r = null;
        BufferedReader br = null;
        try{
            r = new FileReader("");
            r = new FileReader(new File(""));
            br = new BufferedReader(new FileReader(""));
            br = new BufferedReader(new FileReader(new File("")));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                r.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Writer w = null;
        BufferedWriter bw = null;
        try{
            w = new FileWriter("");
            w = new FileWriter(new File(""));
            bw = new BufferedWriter(new FileWriter(""));
            bw = new BufferedWriter(new FileWriter(new File("")));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                w.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void f1() {
        FileInputStream in =null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("D:\\ready\\1.txt");
            int b ;
            while((b= in.read())!=-1){
                System.out.println(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            out = new FileOutputStream("D:\\ready\\1.txt",true);
            out.write(98);
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
