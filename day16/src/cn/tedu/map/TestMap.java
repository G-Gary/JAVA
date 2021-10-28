package cn.tedu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**本类用于复写map统计字符个数案例
 * 需求效果：用户随机输入一串字符，输出每个字符出现的次数：a=2，f=3，i=1*/
public class TestMap {
    public static void main(String[] args) {
        System.out.println("请输入你的字符");
        String input = new Scanner(System.in).nextLine();

        Map<Character,Integer> map = new HashMap();
        for (int i = 0; i <input.length() ; i++) {
            char key = input.charAt(i);
            Integer value = map.get(key);
            if (value==null){
                map.put(key,1);
            }else {
                map.put(key,value+1);
            }
        }
        System.out.println(map);
    }
}
