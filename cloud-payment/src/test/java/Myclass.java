/**
 * @author xusonglin
 * @date 2022/4/26 - 9:37
 */
public class Myclass extends Thread {
/*
    private static final int i = 0;
*/
    public void run() {
        int i = 0;
        for (int j = 0; j <= 100; j++) {
            i = i + 1;
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
