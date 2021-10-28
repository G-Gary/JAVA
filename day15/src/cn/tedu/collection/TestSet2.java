package cn.tedu.collection;
/**本类用于测试自定义类对象的去重*/
import java.util.HashSet;

public class TestSet2 {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet();
        Student s1 = new Student("张三",3,"333");
        Student s11 = new Student("张三",3,"333");
        Student s2 = new Student("李四",4,"444");
        set.add(s1);
        set.add(s11);
        set.add(s2);
        System.out.println(set);
    }
}
