/**
 * @author 夏明
 * @version 1.0
 */
public class TestDataTypeConversion {
    public static void main(String[] args) {
        // byte -> short -> int
        byte b = 10;
        test(b);

        // char -> int
        char c = 'a';
        short c2 = (short)c;
        test(c);
    }

//    public static void test(byte b) {
//        System.out.println("bbbb");
//    }

    public static void test(short b) {
        System.out.println("ssss");
    }

//    public static void test(char b) {
//        System.out.println("cccc");
//    }

    public static void test(int b) {
        System.out.println("iiii");
    }
}
