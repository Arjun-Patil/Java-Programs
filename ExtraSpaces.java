// Program to remove extra spaces from a string

class ExtraSpaces {
    public static void main(String args[]) {
        String str = " A  bc       abcd      abcde ";
        System.out.println(str.replaceAll("\\s+", " ").trim());
    }
}