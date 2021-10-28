package cn.tedu.review;

import java.util.Arrays;

/**本类用于数组的遍历*/
public class TestArray3 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length ; i++) {
            a[i] = i+11;
        }
        System.out.println(Arrays.toString(a));
    }
}
