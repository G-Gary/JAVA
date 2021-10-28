package cn.tedu.oop1;

 class Pigeon extends Bird implements FiyAnimal{

    @Override
    public void fiy() {
        System.out.println("鸽子飞");
    }

    @Override
    public void lay(int eggs) {
        System.out.println("鸽子蛋"+eggs);
    }
}
