package exercise;

import java.util.Scanner;

//流程控制-if...else
public class ex3_IfElse {
    static Scanner sc = new Scanner(System.in);

    public static void run() {
        System.out.println("ex3_IfElse:");
        System.out.print("請輸入一整數:");
        int number = sc.nextInt();

        if (number % 2 == 0 && number % 7 == 0) {
            System.out.println(number + "是2及7的倍數");
        } else if (number % 2 == 0) {
            System.out.println(number + "是2的倍數");
        } else if (number % 7 == 0) {
            System.out.println(number + "是7的倍數");
        } else {
            System.out.println(number + "不是2也不是7的倍數");
        }

        System.out.println();
        // scanner.close();
    }
}
