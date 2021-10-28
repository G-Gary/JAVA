package cn.tedu.oop;
/**本类用于OOP综合练习*/
public class TestTeachar {
    public static void main(String[] args) {
        Teacchar t1 = new Teacchar();
        Teacchar t2 = new Teacchar(3);
        Teacchar t3 = new Teacchar("小程","女",30,500);
        System.out.println(t3.getName()+t3.getAge()+t3.getSalary()+t3.getGender());
        t1.setName("小程程");
        t1.setGender("女");
        t1.setAge(35);
        t1.setSalary(600);
        System.out.println(t1.getName()+t1.getAge()+t1.getSalary()+t1.getGender());

        t2.ready();
        System.out.println(t2.ready());
        t2.teach("语文");


    }


}
class Teacchar{
    private String name;
    private String gender;
    private int age;
    private double salary;

    public Teacchar(){
        System.out.println("无参构造");

    }
    public Teacchar(int n){
        System.out.println("含参构造"+n);
    }

    public Teacchar(String name, String gender, int age, double salary) {
        System.out.println("全参构造");
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    public String  ready(){
        System.out.println("正在备课...");
        return " 产出课程+1";
    }
    public void teach(String subject){
        System.out.println("正在授课"+subject);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
