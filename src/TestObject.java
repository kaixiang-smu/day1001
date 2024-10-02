public class TestObject {

    /**
     * 356,573,597
     * 1540e19d
     * toString()返回：
     * getClass().getName() + "@" + Integer.toHexString(hashCode())
     * java.lang.Object@1540e19d
     * 包名+类名+@+10进制的纯数字hashCode()转化成哈希字符串
     */

    public static void main(String[] args) {
        //show1();
        //show2();

        Student s1 = new Student("理想",22);
        Student s2 = new Student("理想",23);
        /**
         * object类中equals底层在用==判断对象的地址是否相等
         * 但是纯粹的判断对象地址无意义
         * -----------------------------
         * 在开发中一般都是判断内容是否相等，所以一般类中都会重写equals
         * 用来判断内容是否相等
         */
        System.out.println(s1.equals(s2));

    }

    private static void show2() {
        Student student = new Student("zhang",20);
        System.out.println(student);

        Student student1 = new Student("li",22);
        System.out.println(student1);
    }

    private static void show1() {
        Object obj = new Object();
        int hashcode = obj.hashCode();
        System.out.println(hashcode);
        String str = obj.toString();
        System.out.println("str = "+str);
        System.out.println("obj = "+obj);

    }
}
