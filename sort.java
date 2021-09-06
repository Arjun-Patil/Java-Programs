import java.util.*;

public class sort {
    public static void main(String... args) {
        // ArrayList<Integer> a = new ArrayList<>();

        // a.add(5);
        // a.add(4);
        // a.add(3);
        // a.add(2);
        // a.add(1);
        // a.add(0);
        // a.add(11);
        // a.add(10);
        // a.add(6);
        // System.out.println(a);
        // System.out.println();
        // Collections.sort(a, Collections.reverseOrder());
        // System.out.println(a);

        Integer[] a = { 5, 4, 3, 2, 1, 0, 11, 10, 6 };
        for (int ele : a)
            System.out.print(ele + " ");
        System.out.println();
        Arrays.sort(a, Collections.reverseOrder());

        for (int ele : a)
            System.out.print(ele + " ");
        System.out.println();

    }
}
