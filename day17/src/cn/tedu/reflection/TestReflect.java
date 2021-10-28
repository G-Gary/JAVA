package cn.tedu.reflection;

import org.junit.Test;

import java.util.Arrays;

/**
 * 本类用于测试反射技术
 */
public class TestReflect {
    /**
     * 单元测试方法：
     * public + void + 没有参数 + @Test
     * 注意：单元测试工具需要导包：Add JUnit4 to classPath
     * 如果成功，会出现导包语句：import org.junit.Test;
     */
    @Test
    public void getClazz() throws ClassNotFoundException {
        Class<?> clazz1 = Class.forName("cn.tedu.reflection.Student");
        Class<?> clazz2 = Student.class;
        Class<?> clazz3 = new Student().getClass();
        System.out.println(clazz1);//class cn.tedu.reflection.Student
        System.out.println(clazz1.getName());//cn.tedu.reflection.Student
        //通过字节码对象，获取Student类的类名
        System.out.println(clazz2.getSimpleName());//Student
        //通过字节码对象，获取Student类对应的包对象
        System.out.println(clazz3.getPackage());
        //通过字节码对象，获取Student类对应的包对象，在获取这个包对象的名字
        System.out.println(clazz3.getPackage().getName());
    }



    @Test
    public void getStu() {
        Student s1 = new Student("张三", 3);
        Student s2 = new Student("李四", 4);
        Student s3 = new Student("王五", 5);
        Student[] s = {s1, s2, s3};
        System.out.println(Arrays.toString(s));
        for (Student stu : s) {
            //System.out.println(stu);
            System.out.println(stu.name);
            stu.eat(3);
            stu.play();
        }
    }
}
