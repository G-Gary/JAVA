package cn.tedu.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**本类用于测试文件类file*/
public class TestFile {
    public static void main(String[] args) throws IOException {
        /**1.ready文件夹与1.txt需要自己手动创建
         * 2.File需要导包：import java.io.File;
         * 3.路径pathname是String类型数据，必须写正确，不然找不到文件报错
         * 4.完整的文件名包含两部分：文件名+后缀名
         * */
        File file = new File("D:\\ready\\1.txt");
        System.out.println(file.length());//文件里的数据是abc，所以打印3字节
        System.out.println(file.isDirectory());//false，判断当前File对象是一个文件夹吗？
        System.out.println(file.isFile());//trun，判断当前File对象是一个文件吗？
        System.out.println(file.getName());//1.txt，获取文件本身的名字
        System.out.println(file.getParent());//D:\ready，获取父级路径
        System.out.println(file.getAbsolutePath());//D:\ready\1.txt,获取带盘符的绝对路径
        System.out.println(file.exists());//ture,判断当钱file对象指定的路径是否存在
        //测试File的创建与删除
        /**new只会帮我们在内存中创建一个File类型的对象
         * 并不会帮我们在磁盘对应的路径下创建一个真实存在的2.txt文件*/
        File file2 = new File("D:\\ready\\2.txt");
        /**如果指定创建文件的路径不对，会抛出异常
         * 所有提前处理这个问题，我们暂时选择在main()上抛出
         * 这个IO异常是我们目前遇到的强制要求必须预先处理的异常
         * 如果不处理，方法调用会报错，通不过编译*/
        System.out.println(file2.createNewFile());//创建一个之前不存在的文件2.txt，如果创建成功返回ture

        File file3 = new File("D:\\ready\\n");
        System.out.println(file3.mkdir());//创建当前不存在的单层文件夹
        file3= new File("D:\\ready\\a\\b\\c");
        System.out.println(file3.mkdirs());//创建当前不存在的多层文件夹
        /**delete()只能删除文件或者空的文件夹*/
        System.out.println(file2.delete());//2.txt被删除
        System.out.println(file3.delete());//最里层的c文件夹被删除
        //展示文件
        File file4 =new File("D:\\ready");
        String[] list = file4.list();
        System.out.println(Arrays.toString(list));

        File[] fs = file4.listFiles();
        System.out.println(Arrays.toString(fs));
        System.out.println(fs[0].exists());
    }
}
