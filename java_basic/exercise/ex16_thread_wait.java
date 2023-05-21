package exercise;

//執行緒(wait)
public class ex16_thread_wait {
    static class X extends Thread {
        String name;

        X(String name) {
            this.name = name;
        }

        public synchronized void run() {
            try {
                this.wait(200);
            } catch (InterruptedException e) {
                System.err.println("Y causes the illegal exception!");
                System.exit(1);
            }

            for (int i = 1; i <= 30; i += 2) {
                System.out.println(name + ":" + i);
            }
        }
    }

    static class Y implements Runnable {
        String name;

        Y(String name) {
            this.name = name;
        }

        public synchronized void run() {
            try {
                this.wait(100);
                ;
            } catch (InterruptedException e) {
                System.err.println("Z causes the illegal exception!");
                System.exit(1);
            }

            for (int i = 1; i <= 30; i *= 3) {
                System.out.println(name + ":" + i);
            }
        }
    }

    static class Z implements Runnable {
        String name;

        Z(String name) {
            this.name = name;
        }

        public void run() {
            for (int i = 1; i <= 30; i += 5) {
                System.out.println(name + ":" + i);
            }
        }
    }

    public static void run() {
        System.out.println("ex16_thread_wait:");

        Thread x = new X("X");
        x.start();

        Thread y = new Thread(new Y("Y"));
        y.start();

        Thread z = new Thread(new Z("Z"));
        z.start();
    }
}
