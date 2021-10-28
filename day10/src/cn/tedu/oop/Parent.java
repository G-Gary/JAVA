package cn.tedu.oop;

class Parent implements Person{
    @Override
    public void eat() {
        System.out.println("学生家长在招待所吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("学生家长在招待所休息");
    }
}
