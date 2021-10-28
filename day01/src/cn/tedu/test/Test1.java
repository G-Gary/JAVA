package cn.tedu.test;

public class Test1 {
    public static void main(String[] args) {

        System.out.println(sum(4));
    }

    private static boolean sum(int c) {
        if (c<0){
            return false;
        }
        long i = 0; long j =(long)Math.sqrt(c);
        while ( i<=j ){
            long d = (i*i)+(j*j);
            if (d==c){
                return  true;
            }else if (d<c){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }

}
