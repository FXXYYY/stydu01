package javaDemo.stringDemo;

/**
 * @创建人 41213
 * @创建时间 2021/11/6
 */
public class TestString {


    public static void main(String[] args) {
        //创建方式，双引号中的就是字符串
        String str1 = "hello ";
        String str2 = "world! ";
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        //拼接
        String str3 = str1 + str2;
        System.out.println("str3: " + str3);

        //demo 01 取"b"
        String str4 = "a,b,c,d";
        //str4这个对象调用了split方法
        String[] split = str4.split(",");
        for (int i = 0; i < split.length; i++) {
            if ("b".equals(split[i])) {
                System.out.println("恭喜你找到了：" + split[i]);
            }
        }

        for (String s : split) {
            if ("b".equals(s)) {
                System.out.println("恭喜你找到了：" + s);
            }
        }

    }
}
