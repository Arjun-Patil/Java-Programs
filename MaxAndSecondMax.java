// Program to find the maximum and second maximum element in an array

class MaxAndSecondMax {
    public static void main(String args[]) {
        int a[] = { 4, 522, 400, 300, 800, 560, 63, 81, 20, 700 };
        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                secondMax = max;
                max = a[i];

            } else if (a[i] > secondMax) {
                secondMax = a[i];
            }
        }
        System.out.println("The maximum element in array : " + max);
        System.out.println("The second maximum element in array : " + secondMax);

    }
}