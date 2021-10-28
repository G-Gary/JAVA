package cn.tedu.api;
/**本类用于自动装箱与自动拆箱*/
public class TestBox {
    public static void main(String[] args) {
        Integer i1 = new Integer(172);
        Integer i2 = Integer.valueOf(127);

        /**1.自动装箱现象
         * 编译器会自动把基本类型int 127，包装成包装类Integer
         * 然后交给Integer类型的变量i3来保存，底层发生的代码：Integer。valueOf(127);
         * 自动装箱的方向：int【基本类型】->Integer【包装类型】*/
        Integer i3 = 127;
        /**自动拆箱现象：
         * 编译器会自动把包装类型i3拆掉“箱子”，变回基本类型的数据127
         * 然后交给资本类型的变量i4来保存，底层发生的代码：i3.intValue()
         * 自动拆箱的方向：Integer【包装类型】->int【基本类型】*/
        int i4 = i3;
    }
}
