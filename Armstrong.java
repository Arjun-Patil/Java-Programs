// Program to find the given number is armstrong number or not

class Armstrong {
    public static void main(String args[]) {
        int a = 154, r, sum = 0;
        int b = a;
        while (b > 0) {
            r = b % 10;
            sum += Math.pow(r, 3);
            b = b / 10;
        }
        if (sum == a)
            System.out.println("The given number is Armstrong number");
        else
            System.out.println("The given number is not an Armstrong number");
    }
}