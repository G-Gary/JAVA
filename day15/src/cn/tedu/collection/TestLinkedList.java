package cn.tedu.collection;

import java.util.LinkedList;

/**本类用于LinkedList的相关测试*/
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("孙悟空");
        list.add("猪八戒");
        list.add("沙师弟");
        list.add("唐三藏");
        list.add("白龙马");
        System.out.println(list);



        //Linkedlist独有方法
        list.addFirst("黄毛怪");//添加首元素
        list.addLast("泡泡怪");//添加尾元素
        System.out.println(list);

        System.out.println(list.getFirst());//获取首元素
        System.out.println(list.getLast());//获取尾元素

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        //其它测试
        LinkedList<String> list2 = new LinkedList();
        list2.add("水浒传");
        list2.add("三国演义");
        list2.add("西游记");
        list2.add("石头梦");
        System.out.println(list2);
        System.out.println(list2.element());//水浒传  查看首元素
        /**查询系列*/
        System.out.println(list2.peek());//查看首元素
        System.out.println(list2.peekFirst());//查看首元素
        System.out.println(list2.peekLast());//查看尾元素
        System.out.println(list2);

        /**别名；新增系列*/
        System.out.println(list2.offer("斗罗大陆"));//添加尾元素
        System.out.println(list2.offerFirst("斗破苍穹"));//添加首元素
        System.out.println(list2.offerLast("钢铁是怎么炼成的"));//添加尾元素
        System.out.println(list2);

        /**别名：移除系列*/
        System.out.println(list2.poll());//删除首元素
        System.out.println(list2.pollFirst());//删除首元素
        System.out.println(list2.pollLast());//删除尾元素
        System.out.println(list2);





    }
}
