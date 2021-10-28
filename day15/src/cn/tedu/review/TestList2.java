package cn.tedu.review;
/**本类用于复写集合的迭代*/
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestList2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList();
        //2.向list对象添加元素
        list.add("大力娃");
        list.add("千顺娃");
        list.add("头铁娃");
        list.add("喷火娃");
        list.add("喷水娃");
        list.add("隐身娃");
        list.add("葫芦娃");
        System.out.println(list);
        //集合的迭代：
        //因为list集合是有序的，元素是有下标的，所有可以根据下标遍历集合
        //方式1：for循环遍历集合
        //从哪开始0  到哪结束list.size()-1  如何变化++
        for (int i = 0; i <list.size() ; i++) {
            //根据本轮循环到的下标，作为索引获取集合中对应的元素
            System.out.println(list.get(i));
        }
        System.out.println("*****************************************");
        //方式2：使用高效for循环跌代
        //因为普通for循环效率低，语法复杂，格式：
        //for(每轮遍历到的元素的类型 元素名字 : 要遍历的内容){循环体}
        for (String s:list) {
            System.out.println(s);
        }
        System.out.println("*****************************************");
        //方式3；使用从父接口Collection中继承过来的迭代器来遍历
        //1.获取集合对应的迭代器对象
        //2.通过刚刚获取到的迭代器，循环跌代集合中的所有元素
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("*****************************************");
        //方式4：使用list独有的迭代器
        ListIterator<String> it2 = list.listIterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }

    }
}
