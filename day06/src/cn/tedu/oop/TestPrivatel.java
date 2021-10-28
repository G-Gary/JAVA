package cn.tedu.oop;
/**本类用于测试封装的必要性*/
class TestPrivate1 {
    public static void main(String[] args) {
        User u = new User();
        u.name="葫芦娃";
        System.out.println(u.name);
        u.getMoney();
        System.out.println(u.getMoney());
        u.setMoney(999999);
        System.out.println(u.getMoney());
    }
}
class User{
    public String name;
    /**被private修饰的资源只能在本类中使用*/
    private double money =10000;

    public double getMoney(){
        /**如果方法的返回值类型不是void
         * 就需要使用return关键字返回对应类型的返回值*/
        /**后续可以增加权限的验证*/
        return money;
    }
    public void setMoney(double newMoney){
        /**后续可以添加权限的校验*/
        money = newMoney;
    }
}