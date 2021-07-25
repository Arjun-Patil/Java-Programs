// Program to add two matrix

class MatrixAdd {
    public static void main(String args[]) {
        int a[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
        int b[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
        int c[][] = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int x[] : c) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }
}