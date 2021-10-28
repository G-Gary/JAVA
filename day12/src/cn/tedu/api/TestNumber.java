package cn.tedu.api;
/**本类用于测试包装类*/
public class TestNumber {
    //1.定义成员变量，注意要设置成静态的，因为静态只能调用静态
    static Integer i0;
    //2.打印Integer的默认值测试：引用类型的默认值都是null
    public static void main(String[] args) {
        System.out.println(i0);//null
        //3.创建int类型对应的包装类型Integer对象
        Integer i1 = new Integer(5);
        Integer i11 = new Integer(5);
        System.out.println(i1==i11);
        /**Integer对象创建方式2有一个高效的效果，但是要求：
         * 1.是Integer类型
         * 2.使用valueOf()的创建方式
         * 3.数据在-128~127范围内
         * 只要满足以上3个条件，相同的数据只会存一次，后续再存都是使用之前创建好的数据*/

        Integer i2 = Integer.valueOf(127);
        Integer i22 = Integer.valueOf(127);
        Integer i3 = Integer.valueOf(300);
        Integer i33 = Integer.valueOf(300);
        System.out.println(i1==i2);
        System.out.println(i22==i2);
        System.out.println(i3==i33);

        //4.创建Double包装类对象
        Double d1 =new Double(3.14);
        Double d11 =new Double(3.14);
        System.out.println(d1==d11);

        /**只有Integer才有高效的效果，Double是没有的*/
        Double d2 = Double.valueOf(3.14);
        Double d22 = Double.valueOf(3.14);
        System.out.println(d2==d1);
        System.out.println(d2==d22);

        System.out.println(i1.parseInt("800")+10);
        System.out.println(d1.parseDouble("2.2")+3.30);
    }
}
