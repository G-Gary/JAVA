package cn.gyl.exec;

public class gyl {

}
class Parent {
    public int count() { // 第1行
        return 0;
        }
        }
class Test extends Parent {
         private int i;
            public int count() { // 第2行 
        return i % 9;     // 第3行 
        }
        }
