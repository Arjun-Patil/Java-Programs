// Program to find Geometric progression

import java.util.Scanner;

class GP {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a, r and n: ");
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i == n - 1)
                System.out.print(a);
            else
                System.out.print(a + ", ");
            a *= r;
        }
        System.out.println();
    }
}