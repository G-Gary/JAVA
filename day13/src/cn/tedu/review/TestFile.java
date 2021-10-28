package cn.tedu.review;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**本类用于复写File类中常用API*/
public class TestFile {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\ready\\1.txt");
        System.out.println(file.length());
        System.out.println(file.exists());//文件是否存在
        System.out.println(file.isFile());//文件
        System.out.println(file.isDirectory());//文件夹
        System.out.println(file.getName());//文件名
        System.out.println(file.getParent());//父级路径
        System.out.println(file.getAbsolutePath());//绝对路径

        File file1 = new File("D:\\ready\\2.txt");
        System.out.println(file1.createNewFile());

        File file3 = new File("D:\\ready\\q");
        System.out.println(file3.mkdir());
        file3 = new File("D:\\ready\\x\\y\\z");
        System.out.println(file3.mkdirs());

        System.out.println(file1.delete());
        System.out.println(file3.delete());

        file =new File("D:\\ready");
        String[] list = file.list();
        File[] fs = file.listFiles();
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(fs));

    }
}
