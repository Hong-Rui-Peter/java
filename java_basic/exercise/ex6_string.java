package exercise;

//字串
public class ex6_string {
    // 情況一:String literal
    static void state1() {
        String s1 = "java";
        String s2 = "java";
        System.out.println("情況一:");
        System.out.println("s1==s2:" + (s1 == s2) + ";s1 equals:" + s1.equals(s2));
    }

    // 情況二:new建構式
    static void state2() {
        String s1 = new String("java");
        String s2 = new String("java");
        System.out.println("情況二:");
        System.out.println("s1==s2:" + (s1 == s2) + ";s1 equals:" + s1.equals(s2));
    }

    // 情況三:String literal+new建構式
    static void state3() {
        String s1 = "java";
        String s2 = new String("java1");
        System.out.println("情況三:");
        System.out.println("s1==s2:" + (s1 == s2) + ";s1 equals:" + s1.equals(s2));
    }

    public static void run() {
        System.out.println("ex6_string:");

        state1();
        state2();
        state3();

        System.out.println();
    }

}
