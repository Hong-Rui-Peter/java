package exercise;

//資料型態
public class ex1_type {
    class circle {
        static double radius = 5;
        static final double pi = 3.1415926;
        static double area = radius * radius * pi;
    }

    class triangle {
        static double bottom = 10;
        static double high = 5;
        static double area = bottom * high / 2;
    }

    class rectangle {
        static double length = 5;
        static double width = 10;
        static double area = length * width;
    }

    class total {
        static double area = circle.area + triangle.area + rectangle.area;
    }

    public static void run() {
        System.out.println("ex1_type:");
        System.out.println("圓形面積為:" + circle.area);
        System.out.println("三角形面積為:" + triangle.area);
        System.out.println("方形面積為:" + rectangle.area);
        System.out.println("此圖形面積為:" + total.area);
        System.out.println();
    }
}