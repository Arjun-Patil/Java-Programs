// Program to check wheather a number is binary or not

class BInaryCheck {
    public static void main(String args[]) {
        int i = 101011010;
        String str = String.valueOf(i);
        System.out.println(str.matches("[01]+"));
    }
}