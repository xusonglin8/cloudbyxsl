/**
 * @author xusonglin
 * @date 2020/12/26 - 23:00
 */
public class test {
    public static void main(String[] args) {
            method1();
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
        method3();
    }

    private static  void method3(){
        throw new RuntimeException("");
    }
}
