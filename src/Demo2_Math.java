public class Demo2_Math {
    public static void main(String[] args) {
//        static int abs(int a)
//        返回 int 值的绝对值

        System.out.println(Math.abs(-1));
        System.out.println(Math.abs(-11));
        System.out.println(Math.abs(11));

//        static double ceil(double a)
//        返回最小的(最接近负无穷大)double值，该值大于等于参数，并等于某个整数
        System.out.println(Math.ceil(11.1));
        System.out.println(Math.ceil(-1.1));
//        static double floor(double a)
//        返回最大的(最接近正无穷大)double值，该值小于等于参数，并等于某个整数
        System.out.println(Math.floor(11.9));
        System.out.println(Math.floor(-1.9));
//        static double max(double a, double b)
//        返回两个 double 值中较大的一个
        System.out.println(Math.max(1, 2));
//        static double pow(double a, double b)
//        返回第一个参数的第二个参数次幂的值
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(2, 0.5));
        // 开平方根
        System.out.println(Math.sqrt(4));
        System.out.println(Math.sqrt(2));
        System.out.println(Math.sqrt(3));
        System.out.println(Math.sqrt(5));
//        static double random()
//        返回带正号的 double 值，该值大于等于 0.0 且小于 1.0
        System.out.println(Math.random());
//        static long round(double a)
//        返回最接近参数的 long  四舍五入
        System.out.println(Math.round(1.1));
        System.out.println(Math.round(1.9));
        System.out.println(Math.round(1.4));
        System.out.println(Math.round(1.5));
        // 随机返回1-10
        System.out.println(Math.round(Math.random() * 10));
    }
}
