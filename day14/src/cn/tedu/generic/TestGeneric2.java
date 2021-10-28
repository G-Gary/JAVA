package cn.tedu.generic;
/**本类用于测试泛型的优点2*/
public class TestGeneric2 {
    public static void main(String[] args) {
        //需求：打印指定数组中的元素
        Integer[] a = {1,2,3,4,5,6,7,8,9,10};
        print(a);
        String[] b = {"大哥","二哥","三哥","四哥","五哥","六哥","小弟"};
        print(b);
        Double[] c = {6.0,6.6,6.66,6.666,6.6666};
        print(c);

    }
    /**1.泛型可以实现通过代码的编译，使用E表示元素的类型是Element元素
     * 2.泛型的语法要求：如果在方法上使用泛型，必须两处同时出现
     * 一个是传入参数的类型泛型，一个是返回值前的泛型类型，表示这是一个泛型方法*/
    private static  <E> void print(E[] e) {
//        for (int i = 0; i < e.length; i++) {
//            System.out.println(e[i]);
//        }
        for (E arr:e) {
            System.out.println(arr);
        }
    }
    private static void print(Double[] c) {
//        for (int i = 0; i < c.length; i++) {
//            System.out.println(c[i]);
//        }
        for (Double arr :c) {
            System.out.println(arr);
        }
    }
    private static void print(String[] b) {
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(b[i]);
//        }
        for (String arr:b){
            System.out.println(arr);
        }
    }
   private static void print(Integer[] a) {
//        for (int i = 0; i < a.length ; i++) {
//           System.out.println(a[i]);
//        }
        /**高效for循环/foreach循环：
         * 好处：比普通的for循环写法简单，而且高效
         * 坏处：没有办法按照下标来操作值，只能从头到尾依次遍历所有数据
         * 语法for(1 2 ：3){循环体}
         * 3-要遍历的数据 1-每轮遍历到的数据的类型 2-变量名，可以随意起名
         * */
        for(Integer arr:a){
            System.out.println(arr);
        }
    }
}
