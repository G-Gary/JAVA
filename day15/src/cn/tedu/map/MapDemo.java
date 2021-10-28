package cn.tedu.map;

import javax.crypto.spec.DESedeKeySpec;
import java.util.*;

/**本类用于测试Map接口*/
public class MapDemo {
    public static void main(String[] args) {
        /**Map中的数据要符合映射规则，需要同时指定K与Y的数据类型
         * 至于K和Y具体指定成什么类型，取决于业务的具体要求*/
        Map<Integer,String> map = new HashMap();
        //2.向map集合存入数据，注意方法时put

        map.put(9527,"白骨精");
        map.put(9528,"黑熊精");
        map.put(9529,"鲤鱼精");
        map.put(9530,"黄毛怪");
        map.put(9531,"黑毛怪");
        map.put(9527,"女儿国国王");
        System.out.println(map);
        /**1.map中存放着的都是无序的数据
         * 2.map中的value可以重复--比如我们可以存两个黑熊精
         * 3.map中的key不允许重复，如果重复，新value会把旧value覆盖掉
         * 比如女儿国国王和白骨精的key都是9527，白骨精被覆盖*/

//        map.clear();//清空集合
//        System.out.println(map);
        System.out.println(map.equals("黄毛怪"));//判断黄毛怪是否与集合相等
        System.out.println(map.isEmpty());//判断集合是否为空
        System.out.println(map.size());//获取map中键值对的个数

        //判断map集合中是否包含指定key-建
        System.out.println(map.containsKey(9527));
        //判断map集合中是否包含指定Value-值
        System.out.println(map.containsValue("白骨精"));

        //将map集合中的所有的values值取出，放入Collection集合中
        //Collection<Type>的类型，取决于map中value的类型
        System.out.println(map.values());
//        Collection<String> values = map.values();
//        System.out.println(values);

        //4.map集合的迭代方式一
        /**我们想要遍历map中的数据，但是map集合本身没有自己的迭代器
         * 所以需要先将map集合转为Set集合以后，在使用Set的迭代器进行迭代
         * 代码：Set<key> = map.keySet();
         * 作用：将map中所有key值取出，存入set集合中，此处set的泛型是Integer*/
        Set<Integer> set = map.keySet();
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            //System.out.println(it.next());
            // Integer key = it.next();
            //String value = map.get(key);
            //System.out.println(value);
            String value1 = map.get(it.next());
            System.out.println(value1);
            //System.out.println("("+key+"="+value+")");
        }
        //5.map集合的迭代方式二
        /**遍历map集合，需要先把map集合转为set集合
         * 本方案是把一对键值看成一个Entry
         * 代码： Map.Entry<k,v> = map.netrySet()；
         * map.Entry<k,v>,这里是map.Entry<Integer,String>*/
        Set<Map.Entry<Integer, String>> set2 = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it2 = set2.iterator();
        while (it2.hasNext()){
            //System.out.println(it2.next());
            Map.Entry<Integer, String> entry = it2.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("*"+key+"-"+value+"*");

        }
    }
}
