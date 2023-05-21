package exercise;

import java.util.*;

//泛型&集合(Generic&Collections)
public class ex13_collection {
    static List l = Arrays.asList(1, 5, 3, 7, 9, 7, 5);

    static void FuncHashSet() {
        System.out.println("不加泛型,使用for each語法");

        HashSet hs = new HashSet();
        hs.addAll(l);

        for (Object obj : hs) {
            System.out.print(obj + ",");
        }

        System.out.println();
    }

    static void FuncArrayList() {
        System.out.println("不加泛型,使用iterator語法");

        ArrayList al = new ArrayList();
        al.addAll(l);
        Iterator i = al.iterator();

        while (i.hasNext()) {
            System.out.print(i.next() + ",");
        }

        System.out.println();
    }

    static void FuncSet() {
        System.out.println("加入泛型,使用for each語法");

        Set<Integer> s = new TreeSet<Integer>();
        s.addAll(l);

        for (Integer i : s) {
            System.out.print(i + ",");
        }

        System.out.println();
    }

    public static void run() {
        System.out.println("ex13_collection:");

        FuncHashSet();
        FuncArrayList();
        FuncSet();

        System.out.println();
    }
}
