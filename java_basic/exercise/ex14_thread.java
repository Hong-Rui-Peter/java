package exercise;

//執行緒
public class ex14_thread {
    static class A extends Thread {
        String name;

        A(String name) {
            this.name = name;
        }

        public void run() {
            for (int i = 0; i <= 100; i++) {
                System.out.println(name + ":" + i);
            }
        }
    }

    static class B extends Thread {
        String name;

        B(String name) {
            this.name = name;
        }

        public void run() {
            for (int i = 0; i <= 100; i += 2) {
                System.out.println(name + ":" + i);
            }
        }
    }

    static class C implements Runnable {
        String name;

        C(String name) {
            this.name = name;
        }

        public void run() {
            for (int i = 0; i <= 100; i += 3) {
                System.out.println(name + ":" + i);
            }
        }
    }

    static class D implements Runnable {
        String name;

        D(String name) {
            this.name = name;
        }

        public void run() {
            for (int i = 0; i <= 100; i += 4) {
                System.out.println(name + ":" + i);
            }
        }
    }

    static class E implements Runnable {
        String name;

        E(String name) {
            this.name = name;
        }

        public void run() {
            for (int i = 0; i <= 100; i += 5) {
                System.out.println(name + ":" + i);
            }
        }
    }

    public static void run() {
        System.out.println("ex14_thread:");

        Thread a = new A("A");
        a.start();

        Thread b = new B("B");
        b.start();

        Thread c = new Thread(new C("C"));
        c.start();

        Thread d = new Thread(new D("D"));
        d.start();

        Thread e = new Thread(new E("E"));
        e.start();
    }
}
