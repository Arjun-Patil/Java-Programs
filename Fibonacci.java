// Program to print fibonnaci series

import java.util.Scanner;

class Fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.print(a + ", " + b + ", ");
        for (int i = 0; i < n; i++) {
            c = a + b;
            System.out.print(c + ", ");
            a = b;
            b = c;
        }
        System.out.println();
    }
}