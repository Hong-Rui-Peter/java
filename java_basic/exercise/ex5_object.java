package exercise;

//物件
public class ex5_object {
    static class A {
        String Name = "A大樓設計圖";
        int Size = 30;
        String Price = "300萬";
        int Quantity = 20;
    }

    static A A1() {
        A A1 = new A();
        A1.Name = "A1大樓";
        A1.Price = "350萬";

        return A1;
    }

    static A A2() {
        A A2 = new A();
        A2.Name = "A2大樓";
        A2.Quantity = 30;

        return A2;
    }

    public static void run() {
        System.out.println("ex5_object:");

        A A1 = A1();
        A A2 = A2();

        System.out.println(
                "A1 Name:" + A1.Name +
                        ";A1 Size:" + A1.Size +
                        ";A1 Price:" + A1.Price +
                        ";A1 Quantity:" + A1.Quantity);
        System.out.println(
                "A2 Name:" + A2.Name +
                        ";A2 Size:" + A2.Size +
                        ";A2 Price:" + A2.Price +
                        ";A2 Quantity:" + A2.Quantity);

        System.out.println();
    }
}
