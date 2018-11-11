public class ThreadTest extends Thread {
    public ThreadTest(String name) {
        super(name);
    }

    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println(this.getName());
        }
    }

    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest("A");
        ThreadTest t2 = new ThreadTest("B");
        ThreadTest t3 = new ThreadTest("C");
        ThreadTest t4 = new ThreadTest("D");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
