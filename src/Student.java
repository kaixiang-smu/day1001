import java.util.Objects;

public class Student {
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }


//    @Override
//    public boolean equals(Object obj){
        /**
         * Object obj 中obj是父类的对象，是没有name，age这些属性的
         * 所以不能调用，需要向下转型，向下转型后就可以调用子类自己特有的的属性和方法
         */
//        Student other = (Student) obj;
//        if (name.equals(other.getName()) && age==other.getAge()){
//            return true;
//        }
//        return false;
//    }

    /**
     * this.name是这个Student类的name属性，name是个字符串
     * 所以this.name是String类的对象，String也是一个类
     * 所有的类都会继承Object，
     * 一般都会重写Object类的toString()和equals方法
     * String类也重写了equals方法，所以不能这么比较：
     * if (this.name == other.getName()){}
     * 不能用==，String是类，字符串是String类的对象，
     * 如果用==，就是比较地址了！！！比较都是失败false
     * String类也重写了equals方法！！！
     * 来比较每个字符串的每个字符是否一样
     */
    /**
    // 自己手动实现
    @Override // 重写equals
    public boolean equals(Object obj){
        Student other = (Student) obj; // 向下转型
        if (this.age == other.getAge()){
            if (this.name.equals(other.getName())){
                return true;
            }
        }
        return false;
    }
    */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

}
