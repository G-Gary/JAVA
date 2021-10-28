package cn.tedu.review;
/**本类用于复习方法的重写*/
public class TestExtends {
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        f.eat();
        s.eat();

        f.sleep(6);
        s.sleep(8);

        int a = f.play();
        System.out.println(a);
        int b = s.play();
        System.out.println(b);

        Animal a1 = f.getPet();
        System.out.println(a1.name);
        Dog d1 = s.getPet();
        System.out.println(d1.name);
    }
}
class Father{

    public void eat(){
        System.out.println("爸爸爱吃肉");
    }
    public void sleep(int n){
        System.out.println("爸爸晚上和妈妈睡"+n+"个小时");
    }
    public int play(){
        System.out.println("爸爸在玩风筝");
        return 666;
    }
    public Animal getPet(){
        Animal a = new Animal();
        return a;
    }
}
class Son extends Father{
    @Override
    public void eat(){
        System.out.println("儿子爱吃蔬菜");
    }
    public void sleep(int n){
        System.out.println("儿子晚上自己睡"+n+"个小时");
    }
    public int play(){
        System.out.println("儿子在玩小车");
        return 777;
    }
    //写法一
//    public Animal getPet(){
//        Animal a = new Animal();
//        return a;
//    }
    public Dog getPet(){
        Dog d = new Dog();
        return d;
    }


}
class Animal{
   String name = "啥动物都行";
}
class Dog extends Animal{
    String name = "小狗";
}

