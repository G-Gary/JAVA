package cn.tedu.generic;

import java.util.ArrayList;
import java.util.List;

/**本类用于测试泛型的优点1*/
public class TsetGeneric {
    public static void main(String[] args) {
        /**1.泛型是怎么来的？--想要模拟数组的数据类型检查*/
        //数组的好处：在编译期就会检查数组数据类型，如果不是数组规定的类型，就报错
        //1.创建一个String类型的数组，长度为5
        String[] a=new String[5];
        a[0] ="a";
        a[1] ="泡泡";

        List list = new ArrayList();//注意导包：jav.util.List;
        list.add("涛涛");
        list.add(1);
        list.add(8.8);
        list.add('v');
        System.out.println(list);
        /**2.泛型通常与集合一起使用，用来约束集合中元素的类型
         * 3.泛型的好处：可以约束集合数据类型，把报错的时机提前，而不是运行时才报错
         * 在向集合中添加元素时，会先检查元素的数据类型，不是要求的类型就编译失败*/
        List<String> list1 = new ArrayList();
        list1.add("小霞霞");

        /**4.<typu>--typu的值应该如何写？
         * 这个需要根据自己的业务自定义，但是type必须是引用类型，不能是基本类型
         * 如果想写基本类型，请写基本类型对应的包装类型*/
        List<Integer> list2 = new ArrayList();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        list2.add(400);
        System.out.println(list2);



    }
}
