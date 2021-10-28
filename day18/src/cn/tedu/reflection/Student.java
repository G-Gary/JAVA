package cn.tedu.reflection;
/**本类用于复习反射的物料类*/
public class Student {
    public String name;
    public int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void play(){
        System.out.println("今天大结局，放学后我要写一万行代码");
    }
    public void eat(int n){
        System.out.println("在吗"+n+"碗大米饭");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
