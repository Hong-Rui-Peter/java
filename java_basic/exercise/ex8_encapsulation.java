package exercise;

import java.util.Scanner;

//封裝
public class ex8_encapsulation {
    static Scanner sc = new Scanner(System.in);

    static private class x {
        private int x1, x2;

        private int x3() {
            int x4 = x1 * x2;
            return x4;
        }

        void setValue(int x1, int x2) {
            this.x1 = x1;
            this.x2 = x2;
        }

        int getValue() {
            return x3();
        }
    }

    public static void run() {
        System.out.println("ex8_encapsulation");
        System.out.println("請輸入兩個整數:");

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();

        x x = new x();
        x.setValue(x1, x2);
        System.out.println("兩數相乘=" + x.getValue());

        System.out.println();
        // sc.close();
    }
}