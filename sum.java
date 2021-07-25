// Program to find sum of all elements in an array

class sum {
    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int sum = 0;
        for (int x : a) {
            sum += x;
        }
        System.out.println("SUm is : " + sum);
    }
}