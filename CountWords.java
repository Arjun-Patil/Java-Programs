// Program to count the number of words in a given string

class ExtraSpaces {
    public static void main(String args[]) {
        String str = " A  bc       abcd      abcde ";
        str = str.replaceAll("\\s+", " ").trim();
        String words[] = str.split("\\s");
        System.out.println(words.length);
    }
}