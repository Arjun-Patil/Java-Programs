// Program to count the number of digits and displaying each digit in a given number.

class CountDigit {
    public static void main(String args[]) {
        int a = 123456, r, count = 0;

        while (a > 0) {
            r = a % 10;
            a = a / 10;
            count++;
            System.out.println(r);
        }
        System.out.println(count);
    }
}