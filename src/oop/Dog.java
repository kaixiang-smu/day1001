package oop;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void paly(){
        System.out.println("狗玩飞盘");
    }
}
