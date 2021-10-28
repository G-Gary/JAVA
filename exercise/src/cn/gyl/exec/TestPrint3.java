package cn.gyl.exec;
//预测身高案例：
//其实我们可以通过父母的身高大致推断出子女的身高，假定父母与子女的身高遗传关系如下：
//​ 儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
//​ 女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
//那已知：现有父亲身高175CM,母亲身高160CM。

public class TestPrint3 {
    public static void main(String[] args) {
        double f = 175;
        double m = 160;
        double s = (f+m)*1.08/2;
        double d = (f*0.923+m)/2;
        System.out.println("儿子的身高是"+s);
        System.out.println(d);
    }
}
