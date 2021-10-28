package cn.tedu.serializable;

import java.io.Serializable;

/**本类用来封装学生类
 * 如果本类的对象想要被序列化输出，必须实现看序列化接口Serializable
 * 否则会报错：java.io.NotSerializableException: cn.tedu.serializable.Student
 * Serializable是一个空接口，里面一个方法都没有
 * 作用是作为标志，标记这个类的对象可以被序列化*/
public class Student implements Serializable {
    /**JVM会给每个要序列化输出的类分配一个唯一的UID
     * 只要更改了这个类，自动生成的默认UID就会改变*/
    //这是我们手动提供的，写死了UID数据，永远都是1L，但不推荐这么写
    //private static  final long serialVersionUID = 1L;


    private String name;//姓名
    private  int age;//年龄
    private  String addr;//住址
    private  char gender;//性别

    public Student() {
        System.out.println("我是Student的无参构造");
    }

    public Student(String name, int age, String addr, char gender) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.gender = gender;
        System.out.println("我是Student的全参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
//在Student类中添加重写的toString()，因为不想看到地址值，而是属性与属性值
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                ", gender=" + gender +
                '}';
    }
}
