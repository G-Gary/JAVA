package cn.tedu.oop1;

public class Test {
    public static void main(String[] args) {
        Pigeon p = new Pigeon();
        Swallow s = new Swallow();
        Ant a = new Ant();
        Bee b = new Bee();
        p.fiy();
        p.lay(666);

        s.fiy();
        s.lay(777);
        s.build();

        a.fiy();
        a.lay();

        b.fiy();
        b.lay();
        b.build();
        System.out.println( a.legs);
    }
}
