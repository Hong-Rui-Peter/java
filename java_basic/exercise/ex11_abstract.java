package exercise;

import java.util.Scanner;

//抽象
public class ex11_abstract {
    static Scanner sc = new Scanner(System.in);

    static abstract class people {
        String eat = "rice";
        String drink = "water";

        abstract String play();
    }

    static class people_A extends people {
        public String play() {
            System.out.print("請輸入玩的項目:");
            String play = sc.next();

            return play;
        }
    }

    static class people_B extends people {
        public String play() {
            System.out.print("請輸入玩的項目:");
            String play = sc.next();

            return play;
        }
    }

    static class people_C extends people {
        public String play() {
            System.out.print("請輸入玩的項目:");
            String play = sc.next();

            return play;
        }
    }

    public static void run() {
        System.out.println("ex11_abstract:");

        people a = new people_A();
        System.out.println("同學A:");
        System.out.println("吃:" + a.eat + " 喝:" + a.drink + " 玩:" + a.play());

        people b = new people_B();
        System.out.println("同學B:");
        System.out.println("吃:" + b.eat + " 喝:" + b.drink + " 玩:" + b.play());

        people c = new people_C();
        System.out.println("同學C:");
        System.out.println("吃:" + c.eat + " 喝:" + c.drink + " 玩:" + c.play());

        System.out.println();
        sc.close();
    }
}