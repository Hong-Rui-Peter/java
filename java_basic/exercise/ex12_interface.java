package exercise;

//介面
public class ex12_interface {
    interface meals {
        public String breakfast();

        public String lunch();

        public String dinner();
    }

    static abstract class food {
        abstract void eat();
    }

    static class people_A extends food implements meals {
        public String breakfast() {
            return "蛋餅";
        }

        public String lunch() {
            return "炒飯";
        }

        public String dinner() {
            return "炒麵";
        }

        void eat() {
            System.out.println("people_A:");
            System.out.println("breakfast:" + breakfast() + " lunch:" + lunch() + " dinner:" + dinner());
        }
    }

    static class people_B extends food implements meals {
        public String breakfast() {
            return "蔥油餅";
        }

        public String lunch() {
            return "燴飯";
        }

        public String dinner() {
            return "拉麵";
        }

        void eat() {
            System.out.println("people_B:");
            System.out.println("breakfast:" + breakfast() + " lunch:" + lunch() + " dinner:" + dinner());
        }
    }

    static class people_C extends food implements meals {
        public String breakfast() {
            return "漢堡";
        }

        public String lunch() {
            return "麥當勞";
        }

        public String dinner() {
            return "肯德基";
        }

        void eat() {
            System.out.println("people_C:");
            System.out.println("breakfast:" + breakfast() + " lunch:" + lunch() + " dinner:" + dinner());
        }
    }

    public static void run() {
        System.out.println("ex12_interface:");

        people_A a = new people_A();
        a.eat();

        people_B b = new people_B();
        b.eat();

        people_C c = new people_C();
        c.eat();

        System.out.println();
    }
}
