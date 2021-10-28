package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**本类用于测试Collection接口*/
public class TestCollection {
    public static void main(String[] args) {
        //Collection c = new Collection();//报错，因为接口不能实例化
        //<Integer>是泛型，用来约束集合中的数据类型，不能是基本类型，必须是引用类型
        Collection <Integer> c = new ArrayList();

        //2.1测试集合中的常用方法
        c.add(100);
        c.add(200);
        c.add(300);
        c.add(400);
        c.add(500);
        System.out.println(c);
//        c.clear();
//        System.out.println(c);

        System.out.println(c.hashCode());//获取当前对象的哈希码值
        System.out.println(c.toString());//不推荐写，底层会自动调用
        System.out.println(c.equals(200));//false,集合对象c与集合中的元素200不等

        System.out.println(c.contains(200));//true，判断c集合中是否包含指定的元素200
        System.out.println(c.isEmpty());//false,判断c集合是否为空
        System.out.println(c.remove(100));//true，用于移除集合中指定的元素
        System.out.println(c);
        System.out.println(c.size());//获取集合中元素的个数

        Object[] arr = c.toArray();//将指定的集合转为Object类型数组
        System.out.println(Arrays.toString(arr));

        //2.2测试多个集合间的操作
        Collection<Integer> c2 = new ArrayList<>();
        c2.add(2);
        c2.add(4);
        c2.add(5);
        System.out.println(c2);

        c.addAll(c2);//将c2集合的所有元素添加到c集合中
        System.out.println(c);//[200, 300, 400, 500, 2, 4, 5]
        System.out.println(c2);//[2, 4, 5]

        c.removeAll(c2);//将c集合中属于c2集合的所有元素删除
        System.out.println(c);//[200, 300, 400, 500]

        System.out.println(c.contains(c2));//false，判断c集合是否包含c2集合的所有元素

        c.add(5);
        System.out.println(c);
        System.out.println(c.retainAll(c2));//保留c集合中也属于c2的公共元素(取交集)
        System.out.println(c);

        //3.集合迭代/集合遍历
        /**迭代步骤：
         * 1.获取集合迭代器
         * 2.判断集合中是否仍有下一个元素可以迭代
         * 3.获取当前迭代到的元素*/
        Iterator<Integer> it = c2.iterator();
        while(it.hasNext()){
            //打印本轮循环获取到的元素
            System.out.println(it.next());
        }
    }
}
