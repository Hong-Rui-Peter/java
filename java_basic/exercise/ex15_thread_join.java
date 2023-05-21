package exercise;

//執行緒(join)
public class ex15_thread_join {
    static class X extends Thread {
        String name;

        X(String name) {
            this.name = name;
        }

        public void run() {
            Thread y = new Thread(new Y("Y"));
            y.start();

            try {
                y.join();
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

        public void run() {
            Thread z = new Thread(new Z("Z"));
            z.start();

            try {
                z.join();
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
        System.out.println("ex15_thread_join:");

        Thread x = new X("X");
        x.start();
    }
}
