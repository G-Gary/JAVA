package cn.tedu.review;

import java.util.Arrays;

/**本类用于测试数组工具类Arrays*/
public class TestArray2 {
    public static void main(String[] args) {
        int[] from = {1,2,3,4,5};
        int[] to1 = Arrays.copyOf(from,5);
        System.out.println(Arrays.toString(to1));
        int[] to2 = Arrays.copyOf(from,10);
        System.out.println(Arrays.toString(to2));
        int[] to3 = Arrays.copyOf(from,3);
        System.out.println(Arrays.toString(to3));
        System.out.println(Arrays.toString(from));



    }


}
