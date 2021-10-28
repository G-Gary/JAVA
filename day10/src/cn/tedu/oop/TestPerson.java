package cn.tedu.oop;

public class TestPerson {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student s = new Student();
        Parent p = new Parent();
        t.eat();
        t.sleep();
        s.eat();
        s.sleep();
        p.eat();
        p.sleep();
    }
}
