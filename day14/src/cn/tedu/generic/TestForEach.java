package cn.tedu.generic;
/**本类用于练习高效for循环2*/
public class TestForEach {
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,5,6,7,8,9,10};
        String[] b = {"大哥","二哥","三哥","四哥","五哥","六哥","小弟"};
        for (Integer i : a) {
            System.out.println(i);
        }
        for (String s : b){
            System.out.println(s);
        }
    }
}
