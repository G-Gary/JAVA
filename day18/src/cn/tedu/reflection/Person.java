package cn.tedu.reflection;
/**本类用作暴力反射的物料*/
public class Person {
    //1.提供私有属性
    private String name;
    private  int age;
    private String addr;

    //2.提供私有方法
    private void  save(int n,String s){
        System.out.println("save"+n+s);
    }
    private void update(){
        System.out.println("update方法");
    }
}
