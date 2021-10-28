package cn.tedu.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class TestFile1 {
    public static void main(String[] args) throws IOException {
//        File file = new File("D:\\ready\\1.txt");
//        System.out.println(file.length());
//        System.out.println(file.getName());
//        System.out.println(file.isFile());
//        System.out.println(file.isDirectory());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getParent());
//        System.out.println(file.exists());
//
//        File file2 = new File("D:\\ready\\2.txt");
//        System.out.println(file2.createNewFile());

        File file3 = new File("D:\\ready\\q");
//        System.out.println(file3.mkdir());
//        System.out.println(file2.delete());
//        System.out.println(file3.delete());
        File file4 = new File("D:\\ready");
        String[] list = file4.list();
        System.out.println(Arrays.toString(list));

        File[] fs = file4.listFiles();
        System.out.println(Arrays.toString(fs));
        System.out.println(fs[0].exists());




    }
}
