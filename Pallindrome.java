// Program to check wheather a number is pallindrome or not
public class Pallindrome {
    public static void main(String args[]) {
        int a = 1321, rev = 0, r;
        int b = a;
        while (b > 0) {
            r = b % 10;
            rev = rev * 10 + r;
            b = b / 10;
        }
        if (rev == a)
            System.out.println("The given number is pallindrome");
        else
            System.out.println("The given number is not pallindrome");

    }
}
