import java.util.concurrent.CountDownLatch;

public class LockTest {
    public static Integer count = new Integer("0");
    public static CountDownLatch countDownLatch = new CountDownLatch(1000);

    public static Object o = new Object();
    public static Integer vv = new Integer("223");

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                synchronized (vv) {
                    count++;
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        System.out.println(count);
    }
}
