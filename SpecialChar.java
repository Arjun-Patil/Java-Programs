// Program to remove special characters from a string

class SpecialChar {
    public static void main(String args[]) {
        String str = "s@#$fdg*(FG()";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
    }
}