
// Program to rotate ana array left or right
import java.util.Scanner;

class RotateArray {
    public static void main(String args[]) {
        int a[] = { 4, 522, 400, 300, 800, 560, 63, 81, 20, 700 };

        Scanner sc = new Scanner(System.in);

        System.out.println("Before rotation: ");
        for (int x : a)
            System.out.print(x + " ");
        System.out.println();
        System.out.println();

        System.out.println("You want to rotate left or right? ");
        String input = sc.nextLine().toLowerCase();

        if (input.equals("left")) {
            int temp1 = a[0];
            for (int i = 1; i < a.length; i++)
                a[i - 1] = a[i];
            a[a.length - 1] = temp1;
        } else if (input.equals("rigth")) {
            int temp1 = a[a.length - 1];
            for (int i = 1; i < a.length - 1; i++)
                a[i + 1] = a[i];
            a[0] = temp1;
        }

        System.out.println();
        System.out.println();

        System.out.println("After " + input + " rotation: ");
        for (int x : a)
            System.out.print(x + " ");

    }
}