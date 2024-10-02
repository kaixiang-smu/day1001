import java.util.Random;

public class Demo3_Random {

    public static void main(String[] args) {
        Random random = new Random();
        Random random1 = new Random(1);
/**
        // 返回写一个随机整数
        System.out.println(random.nextInt());
        System.out.println(random1.nextInt());
        // 返回0-n之间的随机整数
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(100));
*/
        // 摇骰子
        int i = random.nextInt(6);
        //System.out.println(i+1);

        // 产生4位随机数
        //int i1 = random.nextInt(10);
        //int i2 = random.nextInt(10);
        //int i3 = random.nextInt(10);
        //int i4 = random.nextInt(10);
        //System.out.println(i1+""+i2+""+i3+""+i4);
        /**String desc = "验证码：";
        for (int j = 0; j < 4; j++) {
            int num = random.nextInt(10);
            desc+=Integer.toString(num);
        }
        System.out.println(desc);*/

        String code = "";
        for (int j = 0; j < 4; j++) {
            int num = random.nextInt(10);
            code+=num;
        }
        System.out.println("验证码："+code);

        // 思考题：产生随机数，要包含大写，小写和数字
        // 练习题：设计方法，随机输出一人名字，来回答问题
        // 数组存人名，随即当下标
        String[] nameArr = {"小明","小华","小李","小张","小王","小黄"};
        System.out.println(nameArr[random.nextInt(nameArr.length)]);
    }
}
