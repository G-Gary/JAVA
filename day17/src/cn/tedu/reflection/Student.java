package cn.tedu.reflection;
/**本类用作测试反射的物料类，假装这个类是别人写的*/
public class Student {
   //1.定义成员变量
    String name ;
   int age ;
//2.生成本类的无参构造与全参构造
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //3.提供本类的普通方法
    public void play(){
        System.out.println("玩代码");
    }
    public void eat(int n){
        System.out.println("中午吃"+n+"碗大米饭");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

