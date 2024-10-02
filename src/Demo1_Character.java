public class Demo1_Character {

    public static void main(String[] args) {

        // 判断是否是字母
        char c = 'A';
        System.out.println(Character.isLetter(c));
        // 判断是否是数字
        System.out.println(Character.isDigit(c));
        // 判断是否是大写字母
        System.out.println(Character.isUpperCase(c));
        // 判断是否是小写字母
        System.out.println(Character.isLowerCase(c));
        // 转成小写
        System.out.println(Character.toLowerCase('A'));
        // 转成大写
        System.out.println(Character.toUpperCase('c'));

    }
}
