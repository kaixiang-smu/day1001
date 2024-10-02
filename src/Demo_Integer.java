public class Demo_Integer {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // int--->Integer(构造方法)
        Integer i1 = new Integer(1);
        System.out.println(i1);

        // 可以将数字转成包装类，但是必须是纯数字字符串
        // String--->Integer(构造方法)
        Integer i2 = new Integer("2");
        System.out.println(i2);

        // Integer--->int
        int i = i1.intValue();
        System.out.println(i);

        // String--->int
        // parseInt是静态的方法，类名直接调用
        // 只有纯数字字符串才能解析
        int i3 = Integer.parseInt("2");
        System.out.println(i3+1);

        // Integer--->String
        System.out.println(i1.toString()+"w");

        // int--->String
        String s = Integer.toString(1);

        System.out.println(1+""+1);

        // int--->Integer(valueOf)
        Integer integer = Integer.valueOf(1);

        // String--->Integer(valueOf)
        Integer integer1 = Integer.valueOf("123");

        // 把1包装成包装类
        Integer x = 1; // 自动装箱

        Integer integer2 = new Integer(1);
        // 自动拆箱
        int y = integer2;

        Byte b = 1; // 装箱
        byte c = b; // 拆箱
    }
}
