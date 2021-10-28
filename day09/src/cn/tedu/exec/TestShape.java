package cn.tedu.exec;
/**本类用于OOP综合案例2-设计图形业务*/
public class TestShape {
    public static void main(String[] args) {
//        Shape s = new Shape();
//        s.draw();
//        s.clear();
//        s.draw();
        Circle c = new Circle();
        c.draw();
        c.clear();
        Square s1 = new Square();
        s1.draw();
        s1.clear();
        s1.area();
    }
}
abstract class Shape{
    public abstract void draw();
    public void clear(){
        System.out.println("\n\n\n");
    }

}
class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("画个◇");
    }
}
class Square extends Shape{
    @Override
    public void draw(){
        System.out.println("画个□");
    }
    public void area(){
        System.out.println("这个方形面积不太大");
    }
        }