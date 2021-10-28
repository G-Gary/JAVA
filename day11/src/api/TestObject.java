package api;

import java.util.Objects;

/**本类用于顶级父类Object的入门案例*/
//如何找到Object类呢？有以下几种方式
//1.查看APi手册
//2.连点两下shift，打开IDEA工具搜索功能，注意勾选“include non-project iten”
//在搜索框的位置输入要查找的类Object，双击点入即可
//3.在扩展库External Libraries找到jdk1.8->rt.jar->java.lang.Object
// 4.按住ctrl建，点hashCode()方法名，也可以进Object
public class TestObject {
    public static void main(String[] args) {
        //4.创建学生类对象做测试
        Student s1 = new Student();
        Student s2 = new Student("王二狗",8,30.3,"1年级");
        Student s3 = new Student("王二狗",8,30.3,"1年级");

        //5.测试hashCode()
        /**本方法的作用是返回对应对象的int类的哈希码值
         * 本方法力求不同的对象返回不同的哈希码值
         * 这样我们就可以根据哈希码值区分不同的哈希码值*/
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        /**负责打印s2对象的是println()，这个方法会层层向下调用，一直到Object中的toString()
         * Object类中tiString()的默认实现打印的是对象的地址值【类名@+十六进制哈希码值】
         * 子类Student重写了Object中toString()，打印的是对象的类型+属性+属性值*/
        //6.测试toString()
        //System.out.println(s2.toString());
        System.out.println(s2);
        //7.测试equals()
        /**Object中equals()的默认实现使用的是==比较
         * ==比较的是左右两边的值，如果是基本类型，比较的是字面值
         * 比如1和1，3.4和3.4
         * 如果是引用类型，比较的是引用类型变量保存的地址值*/
        System.out.println(s2.equals(s3));
        System.out.println(s2==s3);
        /**equals()与hashCode()逻辑要保持一致，要重写都重写，要不重写都不重写
         * 如果不重写：hashCode()的哈希码根据地址值生成
         *           equals()底层使用==比较两个对象的地址值
         * 如果重写了：hashCode()的哈希码根据重写传入的属性值生成
         *           equals()比较的是重写后的类型+所有属性和属性值        */



    }



}
//1.创建一个学生类
class Student{
    String name;
    int age;
    double score;
    String grade;
    //3.1创建本类的无参构造
    public Student(){
        System.out.println("无参构造");
    }
    //3.1创建本类的无参构造


    public Student(String name, int age, double score, String grade) {
        System.out.println("全参构造");
        this.name = name;
        this.age = age;
        this.score = score;
        this.grade = grade;

    }
    //生成子类重写的toString()

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", grade='" + grade + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Double.compare(student.score, score) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(grade, student.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, score, grade);
    }
}
