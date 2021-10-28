package cn.tedu.review;

import java.util.Arrays;

/**本类用于复习数组*/
public class TestArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] a2 = new int[]{1,2,3,4,5};
        int[] a3 = new int[4];
        a3[0]=1;
        a3[1]=2;
        a3[2]=3;
        a3[3]=4;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a3));
        System.out.println(a.length);
        System.out.println(a2.length);
        System.out.println(a3.length);
    }
}
