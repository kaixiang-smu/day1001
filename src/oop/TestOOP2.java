package oop;

/**
 * 匿名内部类
 */
public class TestOOP2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        /**
         * 1 创建子类文件
         * 2 继承父类
         * 3 重写方法
         * 4 创建子类对象
         * 如果这个类后面还会用，按照上面是可以的
         * 如果仅仅只是演示一下方法，只用一次，就用匿名内部类
         * 没有必要再单独创建一个类出来
         * 使用匿名内部类可以简化实现父类的过程
         * 下面就是匿名内部类的写法：猫吃鱼  短短几行相当于
         * 造了一个猫文件Cat
         * 猫继承了Animal
         * 猫重写了eat()
         * 还造了猫对象甚至还调了方法cat.eat()
         * 而匿名内部类没有造猫文件，没有继承，只重写了eat()
         * 甚至没有造猫对象还调了方法cat.eat()
         */
        // 这就是匿名内部类
        // 相当于一个子类继承了父类，并重写了方法
        new Animal(){
            @Override
            public void eat() {
                System.out.println("猫吃鱼");
            }
        }.eat(); // 子类还调用了父类
                // .eat()是匿名内部类中的匿名对象调的方法

        // 匿名内部类完成  继承父抽象类
        new Animal(){
            @Override
            public void eat() {
                System.out.println("猪吃白菜");
            }
        }.eat();
        // ========================
        show(dog);

        show(new Animal(){
            @Override
            public void eat() {
                System.out.println("老虎吃其他小动物");
            }
        });
        //-----------------------------
        // 匿名内部类实现接口
        new USB(){
            @Override
            public void work() {
                System.out.println("U盘工作");
            }
        };

    }

    public static void show(Animal animal){
        animal.eat();
    }

}