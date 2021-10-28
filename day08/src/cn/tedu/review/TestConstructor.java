package cn.tedu.review;
/**本类用于复习构造函数*/
public class TestConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("sss");
        Student s3 = new Student("sss",15,'男');
        Ls l = new Ls();
    }
}
class Student{
    String name;
    int age;
    char gender;
    public Student(){
        System.out.println("无参构造");
    }
    public Student(String s){
        System.out.println("无参构造");
    }

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
class Ls extends Student{
    int Score;
    String sClass;
    public Ls(){
        System.out.println("子类的无参构造");
    }

}
