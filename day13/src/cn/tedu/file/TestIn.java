package cn.tedu.file;
import java.io.*;


/**本类用于练习字节输入流InputStream*/
public class TestIn {
    public static void main(String[] args) {
        //method();//字节流的读取
        method2();//高效字节流的读取

    }

    private static void method2() {
        InputStream in2 = null;
        //1.创建流对象
        //InputStream in = new BufferedInputStream(new FileInputStream(new File("D:\\ready\\1.txt")));
        try {
            in2 = new BufferedInputStream(new FileInputStream("D:\\ready\\1.txt"));
            int b;
            while ((b=in2.read())!=-1){
                System.out.println(b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                in2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private static void method() {
        //创建一个在本方法中都生效的局部变量
        InputStream in = null;
        //1.创建流对象，注意InputStrame是抽象父类，不可以实例化
        try {
            //InputStream in1 = new FileInputStream(new File("D:\\ready\\1.txt"));//不常用
            in = new FileInputStream("D:\\ready\\1.txt");

            //2.使用流对象：读取指定文件的数据
            /**read()每次调用都会读取一个字节，如果读到了文件数据的末尾，返回-1
             * 这个方法的返回值类型是int，所以会查找指定字符对应的编码打印出来*/

//            System.out.println(in.read());//97
//            System.out.println(in.read());//98
//            System.out.println(in.read());//99
//            System.out.println(in.read());//-1
//            System.out.println(in.read());//-1
            //2.2优化代码，使用循环读取文件
            //定义变量，用来保存本次读到的数据
            int b;
            //循环读取数据，只要读到的数据不等于-1，说明还有数据，符合循环条件，继续循环
            while((b=in.read())!=-1){
                System.out.println(b);
            }

        } catch (Exception e) {
            e.printStackTrace();//默认写法：打印错误信息
        }finally {
            /**finally{}代码块是try-catch结构的第三部分
             * 这部分不论是否捕获到异常，都一定会执行，所以常用来关流操作*/
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
