package cn.tedu.file;

import java.io.*;
import java.util.Scanner;

/**本类用于练习文件复制综合案例*/
public class TestCopyFile {
    public static void main(String[] args) {
        //1.提示并接收用户输入的两个路径
        System.out.println("请输入源文件路径");//被复制文件
        String f =new Scanner(System.in).nextLine();
        System.out.println("请输入新文件路径");//复制文件
        String t =new Scanner(System.in).nextLine();
        
        //2.调用创建好的自定义方法完成文件复制
        //ZFCopy(f,t);
        ZJCopy(f,t);
    }
        //利用字节流完成文件复制案例
    private static void ZJCopy(String f, String t) {
        InputStream in = null;
        OutputStream out = null;

        try{
            in = new BufferedInputStream(new FileInputStream(t));
            out = new BufferedOutputStream(new FileOutputStream(f));
            int b ;
            while((b = in.read())!=-1){
                out.write(b);
            }
            System.out.println("复制成功");
        }catch (Exception e){
            System.out.println("复制失败");
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void ZFCopy(String f, String t) {
        //1.定义在整个方法中都生效的局部变量，注意手动初始化，默认值为null
        Reader in = null;
        Writer out = null;
        //2.由于代码可能产生异常，所以需要编写try-catch-finally结构
        try{
            //3.1创建高效字符输入流
            in = new BufferedReader(new FileReader(f));
            //3.2创建高效字符输出流
            out = new BufferedWriter(new FileWriter(t));
            //4.拿到对象以后，就可以使用流对象来完成业务了
            //4.1定义变量用来保存读到的数据
            int b;
            //4.2循环读取源文件，知道返回值为-1，说明没有数据了。在结束循环
            while ((b = in.read())!=-1){
                out.write(b);
            }
            System.out.println("文件复制成功");
        }catch (Exception e){
            System.out.println("文件复制失败");
            e.printStackTrace();
        }finally {
            /**关流是有顺序的：如果有多个流，最后创建的流最先关闭
             * 多条关流语句需要各自的try-catch*/
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
