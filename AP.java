// Program to find Arithmetic progression

import java.util.Scanner;

class AP {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a, d and n: ");
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i == n - 1)
                System.out.print(a);
            else
                System.out.print(a + ", ");
            a += d;
        }
        System.out.println();
    }
}