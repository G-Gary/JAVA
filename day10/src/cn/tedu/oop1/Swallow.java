package cn.tedu.oop1;

class Swallow extends Bird implements FiyAnimal{
    @Override
    public void fiy() {
        System.out.println("燕子飞");
    }

    @Override
    public void lay(int eggs) {
        System.out.println("燕子蛋"+eggs);
    }
    public void build(){
        System.out.println("筑巢");
    }
}
