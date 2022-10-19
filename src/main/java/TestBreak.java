/**
 * @author 夏明
 * @version 1.0
 */
public class TestBreak {
    public static void main(String[] args) {
        // 使用break关键字
        for (int i = 0; i < 5; i ++ ) {
            if (i == 3)
                break;
            System.out.println(i);
        }
        System.out.println("这是循环外的代码");

        // 通过throw exception实现break
        try {
            for (int i = 0; i < 5; i ++ ) {
                if (i == 3)
                    break;
                System.out.println(i);
            }
        } catch (Exception e) {
            // 什么都不做 只是退出循环
        }
        System.out.println("这是循环外的代码");
    }
}
