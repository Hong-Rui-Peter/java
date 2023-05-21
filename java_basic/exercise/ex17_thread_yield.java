package exercise;

//執行緒(yield)
public class ex17_thread_yield {
    static int xBool = 0;
    static int yBool = 0;
    static int zBool = 0;

    static class X extends Thread {
        String name;

        X(String name) {
            this.name = name;
        }

        public void run() {
            while (yBool == 0 || zBool == 0) {
                Thread.yield();
            }

            for (int i = 1; i <= 30; i += 2) {
                System.out.println(name + ":" + i);
            }

            xBool = 1;
        }
    }

    static class Y implements Runnable {
        String name;

        Y(String name) {
            this.name = name;
        }

        public void run() {
            while (zBool == 0) {
                Thread.yield();
            }

            for (int i = 1; i <= 30; i *= 3) {
                System.out.println(name + ":" + i);
            }

            yBool = 1;
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

            zBool = 1;
        }
    }

    public static void run() {
        System.out.println("ex17_thread_yield:");

        Thread x = new X("X");
        x.start();

        Thread y = new Thread(new Y("Y"));
        y.start();

        Thread z = new Thread(new Z("Z"));
        z.start();
    }
}
