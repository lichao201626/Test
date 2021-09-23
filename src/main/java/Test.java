public class Test {
    public volatile int count = 1;

    public void incr() {
        count++;
    }

    public static void main(String[] args) {
        Test t = new Test();
        for (int i=0; i<10; i++) {
            new Thread(){
                public void run() {
                    for (int j=0;j<1000;j++) {
                     //   System.out.println("....run");
                        t.incr();
                    }
                };
            }.start();
        }
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println("....." + t.count);
    }
}