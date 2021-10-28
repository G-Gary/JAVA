package cn.tedu.serializable;

import java.io.*;

/**本类用于测试序列化和反序列化
 * 序列化：ObjectOutputStream：把Java中对象，保存在磁盘中，相当于对象信息写出保存在文件中
 * 反序列化：ObjectInputStream：把之前序列化输出的数据读取到内存程序中，相当于把对象读取到程序
 * 推荐大家：一次序列化操作对应一次反序列化操作
 * */
public class TsetSerializable {
    public static void main(String[] args) {
        method();//用于测试序列化
        method1();//用于测试反序列化
    }
//反序列化
    private static void method1() {
        ObjectInputStream in =null;
        try{
            in = new ObjectInputStream(new FileInputStream("D:\\ready\\1.txt"));
            Object obj = in.readObject();
            System.out.println(obj);
            System.out.println("反序列化成功");
        }catch (Exception e){
            System.out.println("反序列化失败");
            e.printStackTrace();
        }finally {
            try {
               in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
//序列化
    private static void method() {
        /**注意：序列化输出的数据我们是看不懂的
         * 我们需要后期通过反序列化技术把之前输出的数据重新恢复成对象，才能使用*/
        ObjectOutputStream out = null ;
        try{
            out = new ObjectOutputStream(new FileOutputStream("D:\\ready\\1.txt"));
            Student obj = new Student("海绵宝宝",3,"海里",'男');
            out.writeObject(obj);
            System.out.println("序列化成功");
        }catch (Exception e){
            System.out.println("序列化失败");
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
