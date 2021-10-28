package cn.tedu.oop;

class Student implements Person{
    @Override
    public void eat() {
        System.out.println("学生在学校食堂吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("学生在学生宿舍睡觉");
    }
}
