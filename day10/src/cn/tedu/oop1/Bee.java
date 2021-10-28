package cn.tedu.oop1;

class Bee extends Insect implements FiyAnimal{
    @Override
    public void fiy() {
        System.out.println("蜜蜂飞");
    }

    @Override
    public void lay() {
        System.out.println("蜜蜂卵");
    }
    public void build(){
        System.out.println("蜂蜜");
    }
}
