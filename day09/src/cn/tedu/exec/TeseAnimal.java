package cn.tedu.exec;
/**本类用于OOP综合练习1*/
public class TeseAnimal {
    public static void main(String[] args) {
        Animal a1 = new Ant();
        Animal b1 = new Bee();
        a1.layEggs();
        


    }
}
abstract class Animal{
    int legNumbers;
    int eggNumbers;

    public abstract void layEggs();
}
class Ant extends Animal{
    int eggNumbers = 2;
    @Override
    public void layEggs(){
        System.out.println("正在下蛋...."+eggNumbers);
    }
    public void fly(){
        System.out.println("蚂蚁飞了");
    }
}
class Bee extends Animal{
    int eggNumbers = 10;
    @Override
    public void layEggs(){
        System.out.println("正在下蛋...."+eggNumbers);
    }
    public void makeHoney(){
        System.out.println("蜜蜂在产蜂蜜");
    }
}