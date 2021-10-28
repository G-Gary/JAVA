package cn.tedu.oop1;
class Ant extends Insect implements FiyAnimal{
    @Override
    public void fiy() {
        System.out.println("蚂蚁飞");
    }

    @Override
    public void lay() {
        System.out.println("蚂蚁卵");
    }
}
