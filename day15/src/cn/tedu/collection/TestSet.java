package cn.tedu.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**本类用于测试Set*/
public class TestSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("紫霞仙子");
        set.add("至尊宝");
        set.add("蜘蛛精");
        set.add("紫霞仙子");
        set.add(null);
        System.out.println(set);
        /**1.Set集合中的元素都是没有顺序的
         * 2.Set集合中的元素不能重复
         * 3.Set集合可以存null值，最多存一个*/

        System.out.println(set.contains("师傅"));//判断集合中是否有指定元素
        System.out.println(set.isEmpty());//判断集合是否为空
        System.out.println(set.remove(null));//移除集合中的指定元素
        System.out.println(set);
        System.out.println(set.size());//获取集合中的元素个数
        System.out.println(Arrays.toString(set.toArray()));//集合转为数组


        Set<String> set2 = new HashSet<>();


        set2.add("小脑斧");
        set2.add("小兔纸");
        set2.add("小海藤");
        set2.add("发福蝶");
        System.out.println(set2);
        set.addAll(set2);
        System.out.println(set.containsAll(set2));
        System.out.println(set);

        set.removeAll(set2);
        System.out.println(set.containsAll(set2));

        set.retainAll(set2);
        System.out.println(set);

        Iterator<String> it = set2.iterator();
        while (it.hasNext()){
        System.out.println(it.next());
        }
    }
}