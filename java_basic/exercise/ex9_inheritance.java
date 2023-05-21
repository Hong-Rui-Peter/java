package exercise;

import java.util.Scanner;

//繼承
public class ex9_inheritance {
    static Scanner sc = new Scanner(System.in);

    static class father {
        int year, mon, date;

        father(int year, int mon, int date) {
            this.year = year;
            this.mon = mon;
            this.date = date;
        }
    }

    static class son extends father {
        son(int year, int mon, int date) {
            super(year, mon, date);
        }
    }

    public static void run() {
        System.out.println("ex9_inheritance:");

        // System.out.print("年:");
        // int year = sc.nextInt();

        // System.out.print("月:");
        // int mon = sc.nextInt();

        // System.out.print("日:");
        // int date = sc.nextInt();

        int[] fatherBirthday = new int[3];
        int[] sonBirthday = new int[3];

        System.out.println("請輸入父的出生年月日:");

        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    System.out.print("年:");
                    fatherBirthday[i] = sc.nextInt();
                    break;
                case 1:
                    System.out.print("月:");
                    fatherBirthday[i] = sc.nextInt();
                    break;
                case 2:
                    System.out.print("日:");
                    fatherBirthday[i] = sc.nextInt();
                    break;
                default:
                    System.out.println("error,error,error");
            }
        }

        System.out.println("請輸入子的出生年月日:");

        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    System.out.print("年:");
                    sonBirthday[i] = sc.nextInt();
                    break;
                case 1:
                    System.out.print("月:");
                    sonBirthday[i] = sc.nextInt();
                    break;
                case 2:
                    System.out.print("日:");
                    sonBirthday[i] = sc.nextInt();
                    break;
                default:
                    System.out.println("error,error,error");
            }
        }

        father f = new father(fatherBirthday[0], fatherBirthday[1], fatherBirthday[2]);
        System.out.println("父的出生年月日:" + f.year + "/" + f.mon + "/" + f.date);

        son s = new son(sonBirthday[0], sonBirthday[1], sonBirthday[2]);
        System.out.println("子的出生年月日:" + s.year + "/" + s.mon + "/" + s.date);

        System.out.println();
        // sc.close();
    }
}
