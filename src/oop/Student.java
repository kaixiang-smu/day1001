package oop;

public class Student {
    private String name;
    private int age;

    // 内部类，类中再定义类
    public class Book{

    }

    // 构造代码块
    {
        System.out.println("构造代码块执行了");
        this.name="小敏";
        this.age = 21;
    }

    // 静态代码块
    static {
        System.out.println("静态代码块");
    }

    // 普通方法
    public void show(){
        int a = 1;
        // 局部代码块
        System.out.println(a);
        {
            int b = 2;
            System.out.println(a);
            System.out.println(b);
            // 局部代码块执行完就消失了
        }
        int b = 3; // 这个b与上面的b不充突
        System.out.println(a);
        System.out.println(b);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
        System.out.println("Student无参构造执行了");
    }

    public Student(String name, int age) {
        System.out.println("Student有参构造");
        this.name = name;
        this.age = age;
    }
}
