package cn.tedu.api;
/**本类用于测试字符串拼接
 * 使用操作字符串的方法还是用String的API
 * 拼接字符串用StringBuffer或StringBuilder*/
public class TestString3 {
    public static void main(String[] args) {
        String s = "abcdyfghijklmnopqrstuvwxyz";
        //method1(s);
        method2(s);
    }

    private static void method2(String s) {
        //StringBuffer sb = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(s);
        }
        long t2 = System.currentTimeMillis();
        System.out.println(sb);
        System.out.println(t2-t1);
    }



    private static void method1(String s) {
        String result="";
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
             result=result + s;
        }
        long t2 = System.currentTimeMillis();
        System.out.println(result);
        System.out.println(t2-t1);
    }
}
