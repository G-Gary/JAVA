package cn.tedu.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**本类用于巩固map集合的迭代*/
public class Demo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap();
        //2.向map集合存入数据，注意方法时put
        map.put(9527,"白骨精");
        map.put(9528,"黑熊精");
        map.put(9529,"鲤鱼精");
        map.put(9530,"黄毛怪");
        map.put(9531,"黑毛怪");
        map.put(9527,"女儿国国王");
        System.out.println(map);

        Set<Integer> set = map.keySet();
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            //System.out.println(it.next());
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key+"+"+ value);
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it2 = entries.iterator();
        while (it2.hasNext()){
            //System.out.println(it2.next());
            Map.Entry<Integer, String> entry = it2.next();
            Integer key1 = entry.getKey();
            String value = entry.getValue();
            System.out.println(key1+value);


        }
    }
}
