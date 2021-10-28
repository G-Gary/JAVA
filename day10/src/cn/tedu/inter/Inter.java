package cn.tedu.inter;
/**本接口用于创建接口测试
 * 1.通过interface关键字来定义接口*/
public interface Inter {
    /**2.接口中可以定义普通方法吗？不可以*/
    //public void eat(){}
    /**4.接口中可以定义普通方法吗？可以,接口中的方法都是抽象方法*/
    public abstract void eat();
    public abstract void play();
}
