package oop;

/**
 * 匿名对象
 */
public class TestOOP1 {
    public static void main(String[] args) {
        // 创建对象
        // 类名 对象名 = new 构造方法();
        Student s = new Student("小黄",18);
        // s就是对象名，通过名字调用对象的方法

        System.out.println(s.getName());
        System.out.println(s.getAge());

        // ------------------------------------
        // 所谓匿名对象，就是没有名字
        new Student("小张",20); // 这就是一个匿名对象
        String name = new Student("小张", 20).getName();
        System.out.println(name);
        int age = new Student("小张", 20).getAge();
        System.out.println(age);

        /**
         * 匿名对象，一般不会去调用对象的方法，除非确定只用一次
         * 不然每次都要new，都要开辟空间，耗费时间空间
         * 如果确定只用一次，用变量反而麻烦，多一步
         * 需要经常调用对象，用变量就很方便，只new一次
         */
        //----------匿名对象的用处-----------
        Student student = new Student();
        show(student);
        // 下面比上面少一步
        show(new Student());
    }

    public static void show(Student student){
        System.out.println(student);
    }
}
