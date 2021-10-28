package cn.tedu.map;

import java.util.HashMap;
import java.util.Scanner;

public class TestMap {
    public static void main(String[] args) {
        System.out.println("请输入你的字符串");
        String input = new Scanner(System.in).nextLine();
        HashMap<Character,Integer > map = new HashMap<>();
        for (int i = 0; i <input.length() ; i++) {
            char key = input.charAt(i);
            System.out.println(key);
            Integer value = map.get(key);
            if (value==null){
                map.put(key,1);
            }else{
                map.put(key,value+1);
            }

        }
        System.out.println(map);
    }
}
