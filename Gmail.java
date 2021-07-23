class Gmail {
    public static void main(String args[]) {
        String email = "programmer@gmail.com";

        int i = email.indexOf('@');
        int j = email.indexOf('.');
        System.out.println("Username : " + email.substring(0, i));
        System.out.println("Domain   : " + email.substring(i + 1, email.length()));
        System.out.println(email.substring(i + 1, j).equals("gmail"));
    }
}