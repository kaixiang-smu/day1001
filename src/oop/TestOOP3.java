package oop;

/**
 * 测试代码块
 */
public class TestOOP3 {
    public static void main(String[] args) {
        /**
         * --- 演示构造代码块 ---
         * 每次构造方法执行前先执行构造代码块
         */
//        Student student = new Student();
//        System.out.println("---------------");
//        System.out.println(student.getName());
//        System.out.println(student.getAge());
//
//        System.out.println("****************");
//        Student student1 = new Student("小张",20);
//        System.out.println(student1.getName());
//        System.out.println(student1.getAge());
        /**
         * 演示静态代码块
         * 随着类加载而执行
         * 主要是初始化一些环境用的
         */
        //Student s = new Student();
        /**
         * 局部代码块
         */
        Student student = new Student();
        student.show();
    }
}
