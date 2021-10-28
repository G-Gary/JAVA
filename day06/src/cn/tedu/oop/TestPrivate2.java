package cn.tedu.oop;
/**本类用于继续测试面向对象的第一大特性--封装*/
public class TestPrivate2 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        s.study();
        //s.subject = "java培优";
        //-System.out.println(s.subject);
        s.setSubject("cgb");
        System.out.println(s.getSubject());
        s.setSno(15000006);
        System.out.println("接到的学号"+s.getSno());
    }
}
class Student{
    String name;
    private int sno;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void study(){
        System.out.println("别闹，学java呢");
    }
    public void  eat(){
        System.out.println("干饭不积极，思想有问题");
    }
    public void  sleep(){
        System.out.println("我一点也不想睡觉，就想学java~");
    }

}
