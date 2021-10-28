package cn.tedu.collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**本类用于测试List接口*/
public class TestList {
    public static void main(String[] args) {
        //1.创建List多态对象，注意List是一个接口，不可实例化
        List<String> list = new ArrayList<>();
        //2.测试继承自Collection中的方法
        list.add("大力娃");
        list.add("千顺挖");
        list.add("头铁娃");
        list.add("喷火娃");
        list.add("喷水娃");
        list.add("隐身娃");
        list.add("葫芦娃");
        System.out.println(list);
        //list.clear();//清空集合
        //System.out.println(list);
        System.out.println(list.contains("喷火娃"));//判断是否有该元素
        System.out.println(list.equals("喷水娃"));//集合有多个元素
        System.out.println(list.isEmpty());//判断集合是否为空
        System.out.println(list.remove("葫芦娃"));//移除集合中的指定元素
        System.out.println(list);
        System.out.println(list.size());//获取集合中元素的个数
        System.out.println(Arrays.toString(list.toArray()));//集合转化成数组

        //3.测试List接口自己的方法，由于List有序的，所以可以根据索引来操作集合中的元素
        list.add("小蝴蝶");//默认的添加方法追加在末尾
        list.add(1,"小蝴蝶");//向指定索引处添加元素
        list.add(3,"蛇精");
        System.out.println(list);

        System.out.println(list.indexOf("小蝴蝶"));//获取元素第一次出现的索引值
        System.out.println(list.lastIndexOf("小蝴蝶"));//获取元素最后一次出现的索引值

        System.out.println(list.remove(5));//根据索引值删除集合中的元素
        System.out.println(list);
        System.out.println(list.get(3));//获取集合中指定索引的元素
        System.out.println(list);
        System.out.println(list.set(7,"蝎子精"));//修改指定索引处的元素
        System.out.println(list);


        //4.测试集合间操作
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        System.out.println(list2);

        System.out.println(list.addAll(list2));//将list2集合追加到list末尾
        System.out.println(list.addAll(0,list2));//将list2集合元素按指定索引追加
        System.out.println(list);
        System.out.println(list.containsAll(list2));//判断list是否包含list2
        System.out.println(list.remove(list2));//将list集合中所有属于list2集合中的元素删除
        System.out.println(list);

        

        //迭代集合的方式
        //for循环
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

        //foreach循环
        for (String arr:list) {
            System.out.println(arr);
        }
        //迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        //


    }
}
