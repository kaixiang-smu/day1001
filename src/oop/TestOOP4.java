package oop;

/**
 * 向下转型
 */
public class TestOOP4 {
    public static void main(String[] args) {
//  向上转型：将子类对象赋值给父类引用(将子类包装成父类)
//  向下转型：将父类赋值给子类对象(将包装后的父类再变回到子类)
//  先有向上转型才能向下转型
        // Dog是小范围的，Animal是大范围的
        // 狗都是动物
        // 小向大是向上转型，是可以的
//        Animal animal = new Dog(); // 向上转型
        // 反过来，Animal是大范围，动物不一定都是狗
        // 大向小转换需要强制类型转换
//        Dog dog = (Dog) animal; // 向下转换
//        dog.eat();


        // 没有向上转型，直接向下，会报错ClassCastException
        // 类型转换异常
//        Animal animal = new Animal();
//        Dog dog = (Dog) animal;
//        dog.eat();

        // 向上转换，向下强制转换(类型不对应也不能向下)
        // 类型转换异常，会报错ClassCastException
//        Animal animal = new Cat();
//        Dog dog = (Dog) animal;

        /**
         * 为什么要向下转型？
         * 因为向上转型之后，这个父类引用能调用的方法只能是子父类都有的方法
         * 如果此时需要调用子类特有方法，就不行
         */
        Animal animal =  new Dog(); // 向上转型
        animal.eat();
        // 父类不能调用子类特有的方法
        // animal.play();
        // 此时就需要向下转型，就可以调用子类特有的方法
        System.out.println("------------");
        Dog dog = (Dog) animal; // 向下转型
        dog.eat();
        dog.paly();
    }
}
