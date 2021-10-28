package cn.gyl.exec;
//输出一句话：“我要开始学习JAVA了，今天又是知识量满满的一天~”
public class TestPrint {
    public static void main(String[] args) {
        //System.out.println("我要开始学习java了，今天又是知识量满满的一天~" );
//        int sum = 0 ;
//        for(int i = 1 ; i<11 ; i++){
//            sum= sum+i;
//
//        }
//        System.out.println(sum);
//        int[] arr ={10,9,1,20,19,30,5};
//        int i = 0; int j = arr.length-1;
//        while (i<j){
//            if (arr[i]<arr[j]){
//                i++;
//            }else {
//                j--;
//            }
//        }
//        System.out.println("下标位置"+j+"该元素的值是"+arr[j]);
        int arr[] = {10, 9, 1, 20, 19, 30, 5};
        for (int i = 0; i < arr.length - 1; i++) {//轮:7个数比6轮
            for (int j = 0; j < arr.length - 1 - i; j++) {//每轮次数:依次比6,5,4....
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
