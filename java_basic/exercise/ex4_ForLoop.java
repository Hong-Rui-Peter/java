package exercise;

import java.util.Scanner;

//流程控制-for...loop
public class ex4_ForLoop {
    static Scanner sc = new Scanner(System.in);

    public static void run() {
        System.out.println("ex4_ForLoop:");
        System.out.print("請輸入一正整數");
        int a = sc.nextInt();
        int sum = 0;

        for (int initial = 0; initial <= a; initial += 7) {
            sum += initial;
        }

        System.out.println("從1到" + a + "且倍數為7的總和是:" + sum);

        System.out.println();
        // sc.close();
    }
}
