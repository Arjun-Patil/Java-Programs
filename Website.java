// Program to find the type of a website

import java.util.Scanner;

class Website {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the website URL: ");
        String web = sc.nextLine();

        String protocal = web.substring(0, web.indexOf(":"));

        if (protocal.equals("http"))
            System.out.println("Hypertext transfer protocol");
        else if (protocal.equals("ftp"))
            System.out.println("File transfer protocol");

        String ext = web.substring(web.lastIndexOf(".") + 1);

        if (ext.equals("com"))
            System.out.println("Commercial");
        else if (ext.equals("org"))
            System.out.println("Organization");
        else if (ext.equals("net"))
            System.out.println("Network");

    }
}
