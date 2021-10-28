package cn.tedn.review;

import java.util.Objects;

/**本类用于复习Object类
 * 1.s1对象与s2对象new了两次，地址值不同
 * 2.s1对象与s2对象的类型 属性 属性值 一模一样
 * 3.toString()与println()向下逐级调用到的，不需要我们主动调用*/
public class TsetObject {
    public static void main(String[] args) {
        Student s1 = new Student("海绵宝宝",3);
        Student s2 = new Student("海绵宝宝",3);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1);
    }
}
class Student{
    String name;
    int age;
    public Student(){
        System.out.println("无参构造");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
