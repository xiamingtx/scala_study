/**
 * @author 夏明
 * @version 1.0
 */
public class TestOperator {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = "hello";

        Boolean isEqual = s1 == s2;
        System.out.println(isEqual);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);

        // 赋值运算符
        byte b = 10;
//        b = b + 1; // 不行
        b += 1; // += 默认做了强转
        b = (byte)(b + 1);

        // 自增自减
        int x = 15;
        int y = x ++;
        System.out.println("x = " + x + ", y = " + y);

        x = 15;
        y = ++ x;
        System.out.println("x = " + x + ", y = " + y);

        x = 23;
        x = x ++ ; // temp = x -> x ++ -> x = temp
        System.out.println(x);
    }
}
